package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends PagingAndSortingRepository<PetType, Integer> {
  public List<PetType> findAll(); //("/api/v1/pet_type")shows the type of pets available, only 2
  public List<PetType> findAllByType(String type); //("/api/v1/{pet_type}")shows the pet type entered in the variable section
  public PetType findByType (String type); //AdoptablePetSeeder
//  public List<PetType> findAllByPetType(PetType petType);

}
