package de.sfc.tamagotchi.tamagotchi.toys;

/**
 * Abstract class Toy should be the base of any other subclass.
 */
public abstract class Toy {
    private final String name;
    private final int funPoints;

    protected Toy(String name, int funPoints) {
        this.name = name;
        this.funPoints = funPoints;
    }

    public String getName() {
        return name;
    }

    public int getFunPoints() {
        return funPoints;
    }

}
