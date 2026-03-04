package de.sfc.tamagotchi.tamagotchi.food;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Apple extends Food {
    public Apple() {
        super("Apfel", 20);
    }
    public void applyEffect(Pet pet) {
        pet.setHungriness(pet.getHungriness() + 60);
        pet.setHappiness(pet.getHappiness() + 10);
    }
}
