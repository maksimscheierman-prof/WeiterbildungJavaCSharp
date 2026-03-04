package Uebungsaufgaben;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(name+ " barks...");
    }
    public void makeSound() {
        System.out.println(name + " barks...");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void miau() {
        System.out.println(name + " miaus...");
    }
    public void makeSound() {
        System.out.println(name + " miaus...");
    }
}
class DataBase {
    public List<Animal> animals = new ArrayList<>();
    public DataBase() {
        animals.add(new Dog("minze"));
        animals.add(new Cat("rex"));
        animals.add(new Cat("echte minze"));
        animals.add(new Dog("chonki rex"));
    }
}
public class Casting {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        for ( Animal animal : db.animals ) {
            // Please implement a function that goes through all the animals in the database
            // and calls the correct method (i.e. .bark() for a Dog and .miaw for a Cat.
            // HINT: you can use either instance of or .getClass().getSimpleName() to determine
            // the class of the current animal
            if (animal instanceof Dog) {
                Dog d = (Dog) animal;   // Downcast
                d.bark();
            }
            else if (animal instanceof Cat) {
                Cat c = (Cat) animal;   // Downcast
                c.miau();
            }
            //animal.makeSound();
        }
    }
}


