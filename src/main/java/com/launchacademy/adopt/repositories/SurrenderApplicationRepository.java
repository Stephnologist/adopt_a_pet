package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.SurrenderApplication;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurrenderApplicationRepository extends PagingAndSortingRepository<SurrenderApplication, Integer> {
  public Iterable<SurrenderApplication> findAll();
}
