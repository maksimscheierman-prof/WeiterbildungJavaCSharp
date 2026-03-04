package de.sfc.tamagotchi.tamagotchi.pets;

public class Bird extends Pet{
    public Bird(String name){
        super(name, 70,70,50,true);

    }

    @Override
    public String hug() {
        // Vogel wird vorsichtig umarmt und freut sich 🐤
        setHappiness(getHappiness() + 10);
        return getName() + " zwitschert fröhlich! 🐤";
    }
}
