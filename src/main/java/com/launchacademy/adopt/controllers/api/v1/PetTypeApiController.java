package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.engine.IterationStatusVar;

@RestController
public class PetTypeApiController {

  private PetTypeRepository petTypeRepo;

  @Autowired
  public PetTypeApiController(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }

  @GetMapping("/api/v1/pets")
  public Iterable<PetType> getPetType() {
    return petTypeRepo.findAll();
  }

  @GetMapping("/api/v1/pet_type")//
  public PetType getType() {
    return petTypeRepo.findByType("reptile");
  }
}
