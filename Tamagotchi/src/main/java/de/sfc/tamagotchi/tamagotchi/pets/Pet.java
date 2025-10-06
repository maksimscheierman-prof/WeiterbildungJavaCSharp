package de.sfc.tamagotchi.tamagotchi.pets;


/**
 * Abstract class Pet. Should define the basis of every subclass of pet.
 * //TODO: Implement the Interface Huggable here.
 */
public abstract class Pet {
    private final String name;
    private int happiness;
    private int hungriness;
    private int sleepiness;
    private boolean isSleeping;
    private boolean isDead;

    protected Pet(String name, int happiness, int hungriness, int sleepiness, boolean isSleeping) {
        this.name = name;
        this.happiness = happiness;
        this.hungriness = hungriness;
        this.sleepiness = sleepiness;
        this.isSleeping = isSleeping;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public int getHungriness() {
        return hungriness;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public void setSleeping(boolean sleeping) {
        this.isSleeping = sleeping;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDead() {
        return isDead;
    }

}
