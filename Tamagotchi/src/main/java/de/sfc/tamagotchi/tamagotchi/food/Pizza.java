package de.sfc.tamagotchi.tamagotchi.food;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Pizza extends Food{
    public Pizza(){
        super("Pizza", 80);
    }
    public void applyEffect(Pet pet) {
        pet.setHungriness(pet.getHungriness() + 60);
        pet.setHappiness(pet.getHappiness() + 10);
    }
}
