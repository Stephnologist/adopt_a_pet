package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.AdoptablePet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptablePetRepository extends CrudRepository<AdoptablePet, Integer> {
  public List<AdoptablePet> findAll();
}
