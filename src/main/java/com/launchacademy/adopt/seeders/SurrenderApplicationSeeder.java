package com.launchacademy.adopt.seeders;

import com.launchacademy.adopt.models.SurrenderApplication;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import com.launchacademy.adopt.repositories.SurrenderApplicationRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurrenderApplicationSeeder {

  private SurrenderApplicationRepository surrenderAppRepo;
  private PetTypeRepository petTypeRepo;

  @Autowired
  public void setSurrenderAppRepo(SurrenderApplicationRepository surrenderAppRepo) {
    this.surrenderAppRepo = surrenderAppRepo;
  }

  @Autowired
  public void setPetTypeRepo(PetTypeRepository petTypeRepo) {
    this.petTypeRepo = petTypeRepo;
  }

  public void seed() {
    List<SurrenderApplication> seeds = new ArrayList<>();

    SurrenderApplication surrenderApp1 = new SurrenderApplication();
    surrenderApp1.setName("John");
    surrenderApp1.setPhoneNumber("617-882-5647");
    surrenderApp1.setEmail("johnm@gmail.com");
    surrenderApp1.setPetName("Bob");
    surrenderApp1.setPetAge(2);
    surrenderApp1.setPetType(petTypeRepo.findByType("reptile"));
    surrenderApp1.setImgUrl("https://1.bp.blogspot.com/-8kABMMyDw_E/UCeYS-CqiRI/AAAAAAAAEmI/09PDWJEOToM/s1600/hd-snake-wallpaper-with-a-attacking-green-snake-wallpapers-backgrounds.jpg");
    surrenderApp1.setVaccinationStatus(false);
    surrenderApp1.setApplicationStatus("Pending");
    seeds.add(surrenderApp1);

    SurrenderApplication surrenderApp2 = new SurrenderApplication();
    surrenderApp2.setName("Jessica");
    surrenderApp2.setPhoneNumber("617-784-3921");
    surrenderApp2.setEmail("jmatos@gmail.com");
    surrenderApp2.setPetName("Tom");
    surrenderApp2.setPetAge(8);
    surrenderApp2.setPetType(petTypeRepo.findByType("guinea"));
    surrenderApp2.setImgUrl("https://animals.sandiegozoo.org/sites/default/files/2019-04/animals_guineapigs.jpg");
    surrenderApp2.setVaccinationStatus(true);
    surrenderApp2.setApplicationStatus("Pending");
    seeds.add(surrenderApp2);

    for(SurrenderApplication seed: seeds) {
      List surrenderApps = surrenderAppRepo.findAllByName(seed.getName());
      if(surrenderApps.size() == 0) {
        SurrenderApplication surrenderApp = new SurrenderApplication();
        surrenderApp.setName(seed.getName());
        surrenderApp.setPhoneNumber(seed.getPhoneNumber());
        surrenderApp.setEmail(seed.getEmail());
        surrenderApp.setPetAge(seed.getPetAge());
        surrenderApp.setPetType(seed.getPetType());
        surrenderApp.setImgUrl(seed.getImgUrl());
        surrenderApp.setVaccinationStatus(seed.getVaccinationStatus());
        surrenderApp.setApplicationStatus("Pending");
        surrenderAppRepo.save(surrenderApp);
      }
    }
  }
}
