package de.sfc.tamagotchi.tamagotchi.food;


/**
 * Abstract class food. Should be a basis for every subtype of food.
 */
public abstract class Food {
    private final String name;
    private final int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
