package de.sfc.tamagotchi.tamagotchi.toys;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Ball extends Toy{
    public Ball(String name){
        super(name, 50);
    }
    public void applyEffect(Pet pet) {
        pet.setHappiness(pet.getHappiness() + 40);
        pet.setSleepiness(pet.getSleepiness() - 10);
    }
}
