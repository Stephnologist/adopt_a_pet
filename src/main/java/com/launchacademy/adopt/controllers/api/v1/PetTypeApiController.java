package com.launchacademy.adopt.controllers.api.v1;


import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetTypeApiController {

  private final PetTypeRepository petTypeRepo;

  @Autowired
  public PetTypeApiController(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }

  @GetMapping("/api/v1/types")
  public Iterable<PetType> getPetTypes() {
    return petTypeRepo.findAll();
  }

  @GetMapping("/api/v1/types/{type}")
  public Iterable<PetType> getListByType(@PathVariable String type) {
    return petTypeRepo.findAllByType(type);
  }
}
