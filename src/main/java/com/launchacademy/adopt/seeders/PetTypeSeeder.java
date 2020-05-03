package com.launchacademy.adopt.seeders;

import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PetTypeSeeder {

  private PetTypeRepository petTypeRepo;

  @Autowired
  public void setPetTypeRepo(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }


  public void seed() {

    List<PetType> seeds = new ArrayList<>();

    PetType petType1 = new PetType();
    petType1.setType("guinea");
    petType1.setDescription("Domesticated rodent");
    seeds.add(petType1);

    PetType petType2 = new PetType();
    petType2.setType("reptile");
    petType2.setDescription("Domesticated questionable enemy");
    seeds.add(petType2);

    for(PetType seed : seeds) {
      List petTypes = petTypeRepo.findAllByType(seed.getType());
      if(petTypes.size()==0) {
        PetType petType = new PetType();
        petType.setType(seed.getType());
        petType.setDescription(seed.getDescription());
        petTypeRepo.save(petType);
      }
    }
  }
}
