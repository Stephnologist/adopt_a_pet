package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdoptablePetApiController {
  private AdoptablePetRepository adoptablePetRepo;

  @Autowired
  public AdoptablePetApiController(AdoptablePetRepository adoptablePetRepo) {
    this.adoptablePetRepo = adoptablePetRepo;
  }

  @GetMapping("/api/v1/pets")
  public Iterable<AdoptablePet> getAdoptablePets() {
    return adoptablePetRepo.findAll();
  }

//  @GetMapping("/api/v1/pets/{id}")
//  public AdoptablePet getAdoptablePet(@PathVariable Integer id) {
//    return adoptablePetRepo.findAllById();
//  }

//  @GetMapping("/api/v1/{petType}")//is the fetch endpoint in ListPage
//  public Iterable<AdoptablePet> getTypeList(@PathVariable String type) { return petTypeRepo.findAllByType(type); }
}
