package de.sfc.tamagotchi.tamagotchi.food;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Fish extends Food{
    public Fish(){
        super("Fish",40);
    }
    public void applyEffect(Pet pet) {
        pet.setHungriness(pet.getHungriness() + 60);
        pet.setHappiness(pet.getHappiness() + 10);
    }
}
