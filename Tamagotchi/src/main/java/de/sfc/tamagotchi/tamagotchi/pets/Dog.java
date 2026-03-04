package de.sfc.tamagotchi.tamagotchi.pets;

public class Dog extends Pet{
    public Dog(String name){
        super(name,100,100,20, true);
    }

    @Override
    public String hug() {
        // Hund freut sich über Umarmung 🥰
        setHappiness(getHappiness() + 25);
        return getName() + " freut sich riesig über deine Umarmung! 🐶";
    }
}
