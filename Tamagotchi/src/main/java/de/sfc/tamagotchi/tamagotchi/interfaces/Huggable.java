package de.sfc.tamagotchi.tamagotchi.interfaces;

/**
 * Is an interface that can be implemented by the abstract class {@link de.sfc.tamagotchi.tamagotchi.pets.Pet}.
 */
public interface Huggable {
    /**
     * Depending on the pet the happiness should increase or decrease
     */
    void hug();
}
