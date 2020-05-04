package com.launchacademy.adopt.models;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "pet_surrender_applications")
@Setter
@Getter
@NoArgsConstructor
public class SurrenderApplication {
    @Id
    @SequenceGenerator(name = "pet_surrender_application_generator", sequenceName = "pet_surrender_applications_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_surrender_application_generator")
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @NotBlank
    @Column
    private String name;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;

    @Email
    @NotBlank
    @Column
    private String email;

    @NotEmpty
    @Column(name = "pet_name")
    private String petName;

    @Column(name = "pet_age")
    private Integer petAge;

    @ManyToOne
    @JoinColumn(name = "pet_type_id", nullable = false)
    private PetType petType;

    @URL
    @NotBlank
    @Column(name = "pet_img_url")
    private String imgUrl;

    @Column(name = "vaccination_status")
    private Boolean vaccinationStatus;

    @NotBlank
    @Column(name = "application_status")
    private String applicationStatus;
}
