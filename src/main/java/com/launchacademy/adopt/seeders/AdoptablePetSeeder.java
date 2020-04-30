package com.launchacademy.adopt.seeders;


import com.launchacademy.adopt.models.AdoptablePet;
import com.launchacademy.adopt.models.PetType;
import com.launchacademy.adopt.repositories.AdoptablePetRepository;
import com.launchacademy.adopt.repositories.PetTypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdoptablePetSeeder {
    private AdoptablePetRepository adoptablePetRepo;
    private PetTypeRepository petTypeRepo;

    @Autowired
    public AdoptablePetSeeder(AdoptablePetRepository adoptablePetRepo, PetTypeRepository petTypeRepo) {
        this.adoptablePetRepo = adoptablePetRepo;
        this.petTypeRepo = petTypeRepo;
    }

    public void seed() {
        Iterable<PetType> allPets = petTypeRepo.findAll();
        List<PetType> allTypes = new ArrayList<>() {
        };
        for (PetType petType: allTypes ) {
            allTypes.add(petType);
        }
        PetType guinea = allTypes.get(0);
        PetType reptile = allTypes.get(1);
        List<AdoptablePet> adoptablePets = new ArrayList();

        if (adoptablePetRepo.count() == 0) {
            AdoptablePet adoptablePet1 = new AdoptablePet();
            adoptablePet1.setName("Helena");
            adoptablePet1.setImgUrl("https://www.reptilecentre.com/images/wmfixed/Reptile/frozen-guinea-pig-v1-495-495.jpg?v=2");
            adoptablePet1.setAge(3);
            adoptablePet1.setVaccinationStatus(true);
            adoptablePet1.setAdoptionStory("Is a sweet guineapig that loves belly rubs.");
            adoptablePet1.setAdoptionStatus("Pending");
            adoptablePet1.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet1);

            AdoptablePet adoptablePet2 = new AdoptablePet();
            adoptablePet2.setName("Artemis");
            adoptablePet2.setImgUrl("https://lafeber.com/vet/wp-content/uploads/Veiled-chameleon-by-Mrs-Logic-cropped-square.jpg");
            adoptablePet2.setAge(5);
            adoptablePet2.setVaccinationStatus(false);
            adoptablePet2.setAdoptionStory("Is a chameleon that gets excited at the sight of lettuce.");
            adoptablePet2.setAdoptionStatus("Pending");
            adoptablePet2.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet2);

            AdoptablePet adoptablePet3 = new AdoptablePet();
            adoptablePet3.setName("Rocky");
            adoptablePet3.setImgUrl("https://cdn.mos.cms.futurecdn.net/gJJFamQca86CibEeDmegk-1024-80.jpg");
            adoptablePet3.setAge(7);
            adoptablePet3.setVaccinationStatus(false);
            adoptablePet3.setAdoptionStory("Is an ornery guinea pig that hates belly rubs.");
            adoptablePet3.setAdoptionStatus("'Pending'");
            adoptablePet3.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet3);

            AdoptablePet adoptablePet4 = new AdoptablePet();
            adoptablePet4.setName("Harry");
            adoptablePet4.setImgUrl("https://img1.grunge.com/img/gallery/the-truth-about-why-there-arent-snakes-in-ireland/intro-1547479326.jpg");
            adoptablePet4.setAge(2);
            adoptablePet4.setVaccinationStatus(true);
            adoptablePet4.setAdoptionStory("Is a snake with a huge appetite for bunnies.");
            adoptablePet4.setAdoptionStatus("Pending");
            adoptablePet4.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet4);

            AdoptablePet adoptablePet5 = new AdoptablePet();
            adoptablePet5.setName("Sticky");
            adoptablePet5.setImgUrl("https://live.staticflickr.com/8576/15166690374_6dcf167afa_b.jpg");
            adoptablePet5.setAge(1);
            adoptablePet5.setVaccinationStatus(true);
            adoptablePet5.setAdoptionStory("This guy loves crickets");
            adoptablePet5.setAdoptionStatus("Pending");
            adoptablePet5.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet5);

            AdoptablePet adoptablePet6 = new AdoptablePet();
            adoptablePet6.setName("Pancake");
            adoptablePet6.setImgUrl("https://i.pinimg.com/originals/f8/bc/80/f8bc8082646c8bc7e7a87b9d6b02543f.jpg");
            adoptablePet6.setAge(4);
            adoptablePet6.setVaccinationStatus(true);
            adoptablePet6.setAdoptionStory("This guy loves to lounge around");
            adoptablePet6.setAdoptionStatus("Pending");
            adoptablePet6.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet6);

            AdoptablePet adoptablePet7 = new AdoptablePet();
            adoptablePet7.setName("Dino");
            adoptablePet7.setImgUrl("https://www.zillarules.com/-/media/images/zilla-na/us/blog-articles/myths-facts-about-bearded-dragon-care/bearded-dragon.jpg?h=350&w=350&la=en&hash=BB45C333590D6C0AF6E426FC419D6A3B224212BE");
            adoptablePet7.setAge(3);
            adoptablePet7.setVaccinationStatus(true);
            adoptablePet7.setAdoptionStory("Great lizard just looking to play.");
            adoptablePet7.setAdoptionStatus("Pending");
            adoptablePet7.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet7);

            AdoptablePet adoptablePet8 = new AdoptablePet();
            adoptablePet8.setName("Nibbles");
            adoptablePet8.setImgUrl("https://storage.needpix.com/rsynced_images/guinea-pig-850563_1280.jpg");
            adoptablePet8.setAge(1);
            adoptablePet8.setVaccinationStatus(true);
            adoptablePet8.setAdoptionStory("He will chew everything, right into your heart.");
            adoptablePet8.setAdoptionStatus("Pending");
            adoptablePet8.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet8);

            AdoptablePet adoptablePet9 = new AdoptablePet();
            adoptablePet9.setName("Sharkeisha");
            adoptablePet9.setImgUrl("https://i.pinimg.com/236x/33/a2/ee/33a2ee6acf44268d81d9021a654f06e0.jpg");
            adoptablePet9.setAge(2);
            adoptablePet9.setVaccinationStatus(false);
            adoptablePet9.setAdoptionStory("Baby Shark doo doo doo doo dooo, also likes lettuce.");
            adoptablePet9.setAdoptionStatus("Pending");
            adoptablePet9.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet9);

            AdoptablePet adoptablePet10 = new AdoptablePet();
            adoptablePet10.setName("ChamWow");
            adoptablePet10.setImgUrl("https://www.cbreptile.com/wp-content/uploads/2017/08/ambilobe-panther-chameleon-breeder.jpg");
            adoptablePet10.setAge(4);
            adoptablePet10.setVaccinationStatus(true);
            adoptablePet10.setAdoptionStory("Will do what he needs to do to change. Just for you.");
            adoptablePet10.setAdoptionStatus("Pending");
            adoptablePet10.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet10);

            AdoptablePet adoptablePet11 = new AdoptablePet();
            adoptablePet11.setName("Brownies");
            adoptablePet11.setImgUrl("https://i.pinimg.com/originals/4d/b4/06/4db406f8c896c14f2a0dfa64e2744e79.jpg");
            adoptablePet11.setAge(5);
            adoptablePet11.setVaccinationStatus(false);
            adoptablePet11.setAdoptionStory("Loves mice! Not for friends or play play though.");
            adoptablePet11.setAdoptionStatus("Pending");
            adoptablePet11.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet11);

            AdoptablePet adoptablePet12 = new AdoptablePet();
            adoptablePet12.setName("Napsy");
            adoptablePet12.setImgUrl("https://media.giphy.com/media/ZLF9Loju0q3MA/giphy.gif");
            adoptablePet12.setAge(3);
            adoptablePet12.setVaccinationStatus(false);
            adoptablePet12.setAdoptionStory("You will see her in your dreams.");
            adoptablePet12.setAdoptionStatus("Pending");
            adoptablePet12.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet12);

            AdoptablePet adoptablePet13 = new AdoptablePet();
            adoptablePet13.setName("Connakry");
            adoptablePet13.setImgUrl("https://media1.giphy.com/media/9ryDmaTgXFc90a6fah/giphy.gif");
            adoptablePet13.setAge(1);
            adoptablePet13.setVaccinationStatus(false);
            adoptablePet13.setAdoptionStory("Ready or not here I come. Oh there you are hiding!! Likes to existentially think of life.");
            adoptablePet13.setAdoptionStatus("Pending");
            adoptablePet13.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet13);

            AdoptablePet adoptablePet14 = new AdoptablePet();
            adoptablePet14.setName("Orange Fanta");
            adoptablePet14.setImgUrl("https://cdn.pixabay.com/photo/2014/10/22/19/21/guinea-pig-498824__340.jpg");
            adoptablePet14.setAge(3);
            adoptablePet14.setVaccinationStatus(false);
            adoptablePet14.setAdoptionStory("Loves carrots and will love you too.");
            adoptablePet14.setAdoptionStatus("Pending");
            adoptablePet14.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet14);

            AdoptablePet adoptablePet15 = new AdoptablePet();
            adoptablePet15.setName("Megan Thee Guinea Pig");
            adoptablePet15.setImgUrl("https://merryabouttown.com/wp-content/uploads/2019/04/guinea-pig-1325841_1280.jpg");
            adoptablePet15.setAge(15);
            adoptablePet15.setVaccinationStatus(false);
            adoptablePet15.setAdoptionStory("She got him swerving and breaking the law These windows tinted so nobody saw.");
            adoptablePet15.setAdoptionStatus("Pending");
            adoptablePet15.setPetType(guinea);
            adoptablePetRepo.save(adoptablePet15);

            AdoptablePet adoptablePet16 = new AdoptablePet();
            adoptablePet16.setName("Boxy Brown");
            adoptablePet16.setImgUrl("https://farm2.staticflickr.com/1889/43040326120_715b221842_b.jpg");
            adoptablePet16.setAge(10);
            adoptablePet16.setVaccinationStatus(false);
            adoptablePet16.setAdoptionStory("Love lettuce, walking, and beating up the man you jive turkey.");
            adoptablePet16.setAdoptionStatus("Pending");
            adoptablePet16.setPetType(reptile);
            adoptablePetRepo.save(adoptablePet16);
        }
    }
}
