package de.sfc.tamagotchi.tamagotchi.toys;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Teddy extends Toy{
    public Teddy(String name){
        super(name, 40);
    }
    public void applyEffect(Pet pet) {
        pet.setHappiness(pet.getHappiness() + 40);
        pet.setSleepiness(pet.getSleepiness() - 10);
    }
}
