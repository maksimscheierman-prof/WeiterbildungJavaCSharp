package de.sfc.tamagotchi.tamagotchi.utils;

import de.sfc.tamagotchi.tamagotchi.TamagotchiViewController;
import de.sfc.tamagotchi.tamagotchi.food.Food;
import de.sfc.tamagotchi.tamagotchi.pets.Pet;
import de.sfc.tamagotchi.tamagotchi.toys.Toy;
import java.util.List;


/**
 * This class should help to interact with the graphical user interface as easy as possible.
 */
public class UIHelper {

    private TamagotchiViewController controller;

    /**
     *
     * Ein Beispiel zu Dependency Injection (ohne Spring): Der Controller wird in das UIHelper-Objekt injected.
     * Man macht es, damit man mit dem Controller arbeiten kann, ohne ihn in dieser Klasse zu instanziieren.
     * TODO: Für die, die es interessiert, dürfen gerne auch darüber recherchieren, was Dependency Injection ist.
     * @param controller
     */
    public UIHelper(TamagotchiViewController controller) {
        this.controller = controller;
    }

    /**
     * Methods to fill the dropdown menu with food-items
     * @param foods - the pet will eat
     */
    public void populateFoodDropdown(List<Food> foods) {

    }

    /**
     * Methods to fill the dropdown menu with pets
     * @param pets
     */
    public void populatePetDropdown(List<Pet> pets) {

    }

    /**
     * Methods to fill the dropdown menu with toys
     * @param toys
     */
    public void populateToyDropdown(List<Toy> toys) {

    }

}
