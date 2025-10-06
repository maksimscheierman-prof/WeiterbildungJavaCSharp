package de.sfc.tamagotchi.tamagotchi.pets;


/**
 * Abstract class Pet. Should define the basis of every subclass of pet.
 * //TODO: Implement the Interface Huggable here.
 */
public abstract class Pet implements Huggable{
    private final String name;
    private double happiness;
    private double hungriness;
    private double sleepiness;
    private boolean isSleeping;
    private boolean isDead;

    protected Pet(String name, int happiness, int hungriness, int sleepiness, boolean isSleeping) {
        this.name = name;
        this.happiness = happiness;
        this.hungriness = hungriness;
        this.sleepiness = sleepiness;
        this.isSleeping = isSleeping;
    }

    public double getSleepiness() {
        return sleepiness;
    }

    public void setSleepiness(double sleepiness) {
        this.sleepiness = sleepiness;
    }

    public double getHungriness() {
        return hungriness;
    }

    public void setHungriness(double hungriness) {
        this.hungriness = hungriness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
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

    @Override
    public abstract String hug();

    @Override
    public String toString() {
        return name; // 👈 Zeigt nur den Namen im Dropdown an
    }

}
