package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.engine.IterationStatusVar;

@RestController
@RequestMapping("/api/v1/pet_type")
public class PetTypeApiController {

  private PetTypeRepository petTypeRepo;

  @Autowired
  public PetTypeApiController(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }

  @GetMapping
  public List<PetType> getPetTypesList() {
    return petTypeRepo.findAll();
  }

//  @GetMapping("/api/v1/pet")
//  public PetType getPet() { return petTypeRepo.findByType("reptile"); }
}
