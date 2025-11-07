package de.sfc.tamagotchi.tamagotchi.pets;

public class Pikachu extends Pet{
    public Pikachu() {
        super("Pikachu", 100, 150, 300, false);
    }

    @Override
    public void hug() {
        this.setHappiness(this.getHappiness() - 40);
    }
}
