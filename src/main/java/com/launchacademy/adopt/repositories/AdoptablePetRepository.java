package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptablePetRepository extends CrudRepository<AdoptablePet, Integer> {
  public List<AdoptablePet> findAll();
//  public List<AdoptablePet> findAllByPetType(String petType);

//  @Query("SELECT a FROM AdoptablePet a JOIN PetType p ON a.typeId = p.id WHERE p.type = :type")
//  public List<AdoptablePet> findAllByType(@Param("type") String type);
}
