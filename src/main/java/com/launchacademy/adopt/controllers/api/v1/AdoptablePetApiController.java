package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdoptablePetApiController {
  private AdoptablePetRepository adoptablePetRepo;

  private PetTypeRepository petTypeRepo;

  @Autowired
  public AdoptablePetApiController(AdoptablePetRepository adoptablePetRepo) {
    this.adoptablePetRepo = adoptablePetRepo;
  }


  @GetMapping("/api/v1/pets") //shows all pets, both types
  public Iterable<AdoptablePet> getAdoptablePets() {
    return adoptablePetRepo.findAll();
  }


//  @GetMapping("/api/v1/pets/{id}")
//  public AdoptablePet getAdoptablePet(@PathVariable Integer id) {
//    return adoptablePetRepo.findAllById();
//  }

  @GetMapping("/api/v1/{petType}")///api/v1/{petType} is the fetch endpoint in ListPage
  public Iterable<AdoptablePet> getPetByTypeList(@PathVariable String petType) {
    PetType type = petTypeRepo.findByType(petType);
    return adoptablePetRepo.findAllByPetType(type); }
}

//  @GetMapping("/api/v1/pet_type/{pet_type}") //type/{type} //api/v1/pets/{id}
//  public Iterable<PetType> getListByType(@PathVariable String pet_type) {
//    return petTypeRepo.findAllByType(pet_type);
//  }