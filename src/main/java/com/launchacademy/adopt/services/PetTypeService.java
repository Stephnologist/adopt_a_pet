//package com.launchacademy.adopt.services;

//import com.launchacademy.adopt.dtos.PetTypeDTO;
//import com.launchacademy.adopt.mappers.PetTypeMapper;
//import com.launchacademy.adopt.models.PetType;
//import com.launchacademy.adopt.repositories.PetTypeRepository;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PetTypeService {
//  private PetTypeRepository petTypeRepo;
//  private PetTypeMapper petTypeMapper;
//
//  @Autowired
//  PetTypeService(PetTypeRepository petTypeRepo, PetTypeMapper petTypeMapper) {
//    this.petTypeRepo = petTypeRepo;
//    this.petTypeMapper = petTypeMapper;
//  }
//
//  @Autowired
//  public Iterable<PetTypeDTO> findAll() { return petTypeMapper.petTypesToPetTypeDTOs(petTypeRepo.findAll());}
//
//}
