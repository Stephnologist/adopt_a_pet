package com.launchacademy.adopt.seeders;

import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PetTypeSeeder {

  private PetTypeRepository petTypeRepo;

  @Autowired
  public PetTypeSeeder(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }


  public void seed() {
    if(petTypeRepo.count() == 0) {
      PetType petType1 = new PetType();
      petType1.setType("giunea pig");
      petType1.setDescription("Domesticated rodent");
      petTypeRepo.save(petType1);

      PetType petType2 = new PetType();
      petType2.setType("reptile");
      petType2.setDescription("Domesticated questionable enemy'");
      petTypeRepo.save(petType2);
    }
  }
}
