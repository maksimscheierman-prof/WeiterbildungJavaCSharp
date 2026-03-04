package de.sfc.tamagotchi.tamagotchi.food;

import de.sfc.tamagotchi.tamagotchi.pets.Pet;

public class Steak extends Food {
    public Steak() {
        super("Steak", 50);
    }
    public void applyEffect(Pet pet) {
        pet.setHungriness(pet.getHungriness() + 60);
        pet.setHappiness(pet.getHappiness() + 10);
    }
}
