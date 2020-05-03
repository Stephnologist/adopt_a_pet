package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

  @GetMapping("/api/v1/pet/{id}")//shows adoptable pet by its id
  public AdoptablePet getAdoptablePetByP(@PathVariable Integer id) {
    return adoptablePetRepo.findAdoptablePetById(id);
  }

  @GetMapping("api/v1/pets/{type}")//custom query one param
  public Iterable<AdoptablePet> listAdoptablePetsByType(@PathVariable String type) {
    return adoptablePetRepo.findAllByType(type);
  }

  @GetMapping("api/v1/{type}/{id}")
  public AdoptablePet getAdoptablePetByTypeAndId(@PathVariable String type, @PathVariable Integer id) {
    return adoptablePetRepo.findPetByTypeAndId(type, id);
  }

//  @GetMapping("/api/v1/pets/{id}")//shows list of pets with same pet_type_id
//  public Iterable<AdoptablePet> getAdoptablePetByPetTypeId(@PathVariable Integer id) {
//    return adoptablePetRepo.findAllByPetTypeId(id);
//  }



//  @GetMapping("api/v1/{pet_type}") //doesn't work
//  public Iterable<AdoptablePet> getAdoptablePetsByType(@PathVariable String petType) {
//    return adoptablePetRepo.findAllByPetType(petType);
//  }


  //  shows the pet type entered in the variable section from pet type table
//  @GetMapping("/api/v1/pet_type/{pet_type}")
//  public Iterable<PetType> getListByType(@PathVariable String pet_type) {
//    return petTypeRepo.findAllByType(pet_type);
//  }

//  @GetMapping("/api/v1/{petType}")///api/v1/{petType} is the fetch endpoint in ListPage
//  public Iterable<AdoptablePet> getPetByTypeList(@PathVariable String petType) {
//    PetType petType = petTypeRepo.findByType(petType).getId();
//    return adoptablePetRepo.findAllByPetTypeId(petType); }
//}

//  @GetMapping("/api/v1/pet_type/{pet_type}") //type/{type} //api/v1/pets/{id}
//  public Iterable<PetType> getListByType(@PathVariable String pet_type) {
//    return petTypeRepo.findAllByType(pet_type);
//  }

}