package com.launchacademy.adopt.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainSeeder implements CommandLineRunner {
  @Autowired PetTypeSeeder petTypeSeeder;
  @Autowired AdoptablePetSeeder adoptablePetSeeder;
  @Autowired SurrenderApplicationSeeder surrenderAppSeeder;


  @Override
  public void run(String... args) throws Exception {
    petTypeSeeder.seed();
    adoptablePetSeeder.seed();
    surrenderAppSeeder.seed();
  }
}
