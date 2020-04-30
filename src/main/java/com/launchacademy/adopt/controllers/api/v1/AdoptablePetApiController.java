package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdoptablePetApiController {
  private AdoptablePetRepository adoptablePetRepo;

  @Autowired
  public AdoptablePetApiController(AdoptablePetRepository adoptablePetRepo) {
    this.adoptablePetRepo = adoptablePetRepo;
  }

//  @GetMapping("/{type}")
//  public Iterable<AdoptablePet> getTypeList(@PathVariable String type) {
//    return adoptablePetRepo.findAllByType(type);
//  }

//  @GetMapping("/api/v1/{petType}")//is the fetch endpoint in ListPage
//  public Iterable<AdoptablePet> getTypeList(@PathVariable String type) { return petTypeRepo.findAllByType(type); }
}
