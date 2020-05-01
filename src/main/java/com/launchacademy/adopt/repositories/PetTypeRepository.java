package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends PagingAndSortingRepository<PetType, Integer> {
  public List<PetType> findAll();
  public List<PetType> findAllByType(String string);
//  public PetType findFirstByType(String string);
  public PetType findByType (String type);
}
