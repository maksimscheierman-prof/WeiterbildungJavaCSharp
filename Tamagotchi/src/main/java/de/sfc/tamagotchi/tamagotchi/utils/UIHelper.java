package de.sfc.tamagotchi.tamagotchi.utils;

import de.sfc.tamagotchi.tamagotchi.TamagotchiViewController;
import de.sfc.tamagotchi.tamagotchi.food.Food;
import de.sfc.tamagotchi.tamagotchi.food.Apple;
import de.sfc.tamagotchi.tamagotchi.food.Pizza;
import de.sfc.tamagotchi.tamagotchi.food.Fish;
import de.sfc.tamagotchi.tamagotchi.pets.Pet;
import de.sfc.tamagotchi.tamagotchi.pets.Cat;
import de.sfc.tamagotchi.tamagotchi.pets.Dog;
import de.sfc.tamagotchi.tamagotchi.pets.Bird;
import de.sfc.tamagotchi.tamagotchi.toys.Toy;
import de.sfc.tamagotchi.tamagotchi.toys.Ball;
import de.sfc.tamagotchi.tamagotchi.toys.Teddy;
import de.sfc.tamagotchi.tamagotchi.toys.Rope;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

import java.util.Arrays;
import java.util.List;

/**
 * This class should help to interact with the graphical user interface as easy as possible.
 */
public class UIHelper {

    private final TamagotchiViewController controller;

    /**
     * Beispiel für Dependency Injection:
     * Der Controller wird "injiziert" (übergeben), statt hier neu erzeugt zu werden.
     */
    public UIHelper(TamagotchiViewController controller) {
        this.controller = controller;
    }

    /**
     * Populates the food ComboBox with available food items.
     */
    public void populateFoodComboBox(ComboBox<Food> comboBox) {
        List<Food> foods = Arrays.asList(
                new Apple(),
                new Pizza(),
                new Fish()
        );

        ObservableList<Food> foodList = FXCollections.observableArrayList(foods);
        comboBox.setItems(foodList);
    }

    /**
     * Populates the pet ComboBox with available pets.
     */
    public void populatePetComboBox(ComboBox<Pet> comboBox) {
        List<Pet> pets = Arrays.asList(
                new Dog("Bello"),
                new Cat("Minka"),
                new Bird("Tweety")
        );

        ObservableList<Pet> petList = FXCollections.observableArrayList(pets);
        comboBox.setItems(petList);
    }

    /**
     * Populates the toy ComboBox with available toys.
     */
    public void populateToyComboBox(ComboBox<Toy> comboBox) {
        List<Toy> toys = Arrays.asList(
                new Ball("Basketball"),
                new Teddy("Bärchen"),
                new Rope()
        );

        ObservableList<Toy> toyList = FXCollections.observableArrayList(toys);
        comboBox.setItems(toyList);
    }

    // Optional: Wenn du trotzdem die ursprünglichen Methoden mit Listen behalten willst:
    public void populateFoodDropdown(List<Food> foods) {
        controller.getFeedComboBox().setItems(FXCollections.observableArrayList(foods));
    }

    public void populatePetDropdown(List<Pet> pets) {
        controller.getChangePetComboBox().setItems(FXCollections.observableArrayList(pets));
    }

    public void populateToyDropdown(List<Toy> toys) {
        controller.getPlayComboBox().setItems(FXCollections.observableArrayList(toys));
    }
}
