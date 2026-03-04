package de.sfc.tamagotchi.tamagotchi.pets;

public class Cat extends Pet{
    public Cat(String name){
        super(name,50,50,80, true);
    }
    @Override
    public String hug() {
        // Katze mag es nicht unbedingt 🐱‍👤
        setHappiness(getHappiness() - 10);
        return getName() + " faucht und schaut dich böse an. 😾";
    }
}

