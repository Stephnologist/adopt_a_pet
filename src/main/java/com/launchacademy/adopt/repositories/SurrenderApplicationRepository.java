package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.SurrenderApplication;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurrenderApplicationRepository extends PagingAndSortingRepository<SurrenderApplication, Integer> {
  public Iterable<SurrenderApplication> findAll();
  public List<SurrenderApplication> findAllByName(String name);
}
