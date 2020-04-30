package com.launchacademy.adopt.controllers.api.v1;

import com.launchacademy.adopt.dtos.PetTypeDTO;
import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import com.launchacademy.adopt.services.PetTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.engine.IterationStatusVar;

@RestController
@RequestMapping("/api/v1/pets")
public class PetTypeApiController {

  private PetTypeService petTypeSerivce;

  @Autowired
  public PetTypeApiController(PetTypeService petTypeSerivce) {
    this.petTypeSerivce = petTypeSerivce ;
  }

  @GetMapping
  public Iterable<PetTypeDTO> getList() { return petTypeSerivce.findAll(); }

//  @GetMapping("/api/v1/pet_type")//
//  public PetType getType() {
//    return petTypeRepo.findByType("reptile");
//  }
}
