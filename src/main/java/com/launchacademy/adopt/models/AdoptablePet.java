package com.launchacademy.adopt.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Entity
@Table(name = "adoptable_pets")
@Getter
@Setter
@NoArgsConstructor
public class AdoptablePet {
    @Id
    @SequenceGenerator(name = "adoptable_pet_generator", sequenceName = "adoptable_pets_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adoptable_pet_generator")
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonIgnore
    @JoinColumn(name = "pet_type_id", referencedColumnName = "id")
    private PetType petType;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @URL
    @NotBlank
    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name="age")
    private Integer age;

    @Column(name = "vaccination_status")
    private Boolean vaccinationStatus;

    @NotBlank
    @Column(name = "adoption_story")
    private String adoptionStory;

    @NotBlank
    @Column(name = "adoption_status")
    private String adoptionStatus;
}