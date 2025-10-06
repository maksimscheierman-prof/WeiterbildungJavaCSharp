package de.sfc.tamagotchi.tamagotchi.toys;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Rope extends Toy{
    public Rope(){
        super("Rope", 30);
    }

    public void applyEffect(Pet pet) {
        pet.setHappiness(pet.getHappiness() + 40);
        pet.setSleepiness(pet.getSleepiness() - 10);
    }

}
