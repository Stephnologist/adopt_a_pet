package com.launchacademy.adopt.controllers.api.v1;


import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetTypeApiController {

  private final PetTypeRepository petTypeRepo;

  @Autowired
  public PetTypeApiController(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }


  //shows the type of pets available, only 2
  @GetMapping("/api/v1/pet_type")
  public Iterable<PetType> getPetTypes() {
    return petTypeRepo.findAll();
  }


  //shows the pet type entered in the variable section
  @GetMapping("/api/v1/pet_type/{pet_type}")
  public Iterable<PetType> getListByType(@PathVariable String pet_type) {
    return petTypeRepo.findAllByType(pet_type);
  }


}