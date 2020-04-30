package com.launchacademy.adopt.repositories;

import com.launchacademy.adopt.models.PetType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends PagingAndSortingRepository<PetType, Integer> {

}
