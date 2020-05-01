package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptablePetRepository extends PagingAndSortingRepository<AdoptablePet, Integer> {
  public List<AdoptablePet> findAll();
  public List<AdoptablePet> findAllByName(String name);
  public List<AdoptablePet> findAllByPetType(PetType petType);
//  public List<AdoptablePet> findAllByPetType(String petType);
}
