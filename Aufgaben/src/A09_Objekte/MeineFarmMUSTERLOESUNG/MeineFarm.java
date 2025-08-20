package A09_Objekte.MeineFarmMUSTERLOESUNG;

import java.util.ArrayList;
import java.util.Scanner;

public class MeineFarm {

            /*
        Du bist hier:
        [ ] a_Info
        [ ] Haustier
        [x] MeineFarm
        [ ] Main
     */

    // Wir legen eine Liste an in die unsere Haustiere kommen.
    ArrayList<Haustier> alleHaustiere = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userInput;
    public void runFarm(){
        createAnimals();    // Beim Start wollen wir unsere Tiere anlegen.
        while(true){        // Programm Loop
            for(Haustier haustier : alleHaustiere){                 // Gib alle Tiere einmal aus
                System.out.print("Art: " + haustier.getArt() + " ");
                System.out.print("Name: " + haustier.getName() + " ");
                System.out.println("Size: " + haustier.getSize());
            }
            System.out.println("Haustier hinzufügen? (_JA_ eintippen)");  // Wir fragen ob ein neues Hinzukommen soll
            System.out.println("Ein Tier rufen lassen? (Name eintippen)"); // AUFGABE 1
            userInput = scan.nextLine().toLowerCase();
            if(userInput.equals("ja")){         // Wenn ja
                addNewAnimal();                 // Starte die Subroutine
            }
            else{    // AUFGABE 1
                for(Haustier haustier : alleHaustiere){
                    if(haustier.getName().toLowerCase().equals(userInput)){
                        haustier.gibLaut();
                    }
                }
            }
        }
    }

    // Methode um ein paar standard Tiere zu laden
    public void createAnimals(){
        alleHaustiere.add(new Haustier("Jim","Dog",100));
        alleHaustiere.add(new Haustier("Jack","Dog",120));
        alleHaustiere.add(new Haustier("Nelly","Dog",50));
        alleHaustiere.add(new Haustier("Kaja","Dog",10));
        alleHaustiere.add(new Haustier("Pandora","Dog",200));
        alleHaustiere.add(new Haustier("Nicky","Cat",30));
        alleHaustiere.add(new Haustier("Micky","Cat",40));
        alleHaustiere.add(new Haustier("Jana","Cat",60));
        alleHaustiere.add(new Haustier("Tom","Cat",80));
        alleHaustiere.add(new Haustier("Pipi","Hamster",2));
    }

    // Methode um neues Haustier hinzuzufügen.
    private void addNewAnimal(){
        String name;
        String art;
        int size;

        System.out.println("Name Eingeben: ");
        name = scan.nextLine();
        System.out.println("Art Eingeben: ");
        art = scan.nextLine();
        System.out.println("Größe Eingeben: ");
        size = scan.nextInt();
        scan.nextLine(); // Buffer clearen
        alleHaustiere.add(new Haustier(name,art,size));
    }
}
