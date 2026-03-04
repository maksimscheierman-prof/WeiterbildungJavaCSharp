package de.sfc.tamagotchi.tamagotchi.toys;

/**
 * Abstract class Toy should be the base of any other subclass.
 */
public abstract class Toy {
    private final String name;
    private final int funPoints;
    private int usageCount = 0;

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

    public void incrementUsageCount() { usageCount++; }
    public void resetUsageCount() { usageCount = 0; }
    public int getUsageCount() { return usageCount; }

    @Override
    public String toString() {
        return name; // 👈 Zeigt nur den Namen im Dropdown an
    }

}
