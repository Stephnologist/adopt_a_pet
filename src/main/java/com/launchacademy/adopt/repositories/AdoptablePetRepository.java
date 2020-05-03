package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptablePetRepository extends PagingAndSortingRepository<AdoptablePet, Integer> {
  public List<AdoptablePet> findAllByName(String name);//AdoptablePet Seeder
  public List<AdoptablePet> findAll(); //("/api/v1/pets")shows all pets, both types
  public AdoptablePet findAdoptablePetById(Integer id); //("/api/v1/pet/{id}")shows adoptable pet by its id
  //("api/v1/pets/{type}")
  @Query("SELECT a FROM AdoptablePet a JOIN PetType p ON a.typeId = p.id WHERE p.type = :type")
  public List<AdoptablePet> findAllByType(@Param("type") String type);

  @Query("SELECT a FROM AdoptablePet a JOIN PetType p ON a.typeId = p.id WHERE p.type = :type AND a.id = :id")
  public AdoptablePet findPetByTypeAndId(@Param("type") String type, @Param("id") Integer id);


//  public List<AdoptablePet> findAllByPetType(PetType petType);
//  public List<AdoptablePet> findAllByPetType(String petType);
//  public List<AdoptablePet> findAllByPetTypeId(Integer id);
//  public List<AdoptablePet> findAllById(Integer id);
}
