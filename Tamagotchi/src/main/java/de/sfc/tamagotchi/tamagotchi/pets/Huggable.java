package de.sfc.tamagotchi.tamagotchi.pets;

/**
 * The {@code Huggable} interface represents pets that can be hugged.
 * <p>
 * Implementing classes define what happens when the pet is hugged.
 * Some pets might enjoy hugs (increasing their happiness),
 * while others might dislike them (decreasing their happiness).
 * </p>
 */
public interface Huggable {

    /**
     * Defines the reaction of the pet when it is hugged.
     * <p>
     * Depending on the pet, this can have a positive or negative effect
     * on its happiness level.
     * </p>
     */
    String hug();
}
