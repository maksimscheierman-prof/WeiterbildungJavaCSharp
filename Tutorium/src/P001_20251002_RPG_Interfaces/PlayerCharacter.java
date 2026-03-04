package P001_20251002_RPG_Interfaces;

public abstract class PlayerCharacter {
    protected String name;
    protected int strength;
    protected int willpower;

    public PlayerCharacter(String name, int strength, int willpower) {
        this.name = name;
        this.strength = strength;
        this.willpower = willpower;
    }

    public abstract void run();
    public abstract void jump();

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getWillpower() {
        return willpower;
    }
}

