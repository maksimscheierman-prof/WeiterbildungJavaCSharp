package T15_Klassen_Objekte;

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
    String userinput;
    public void runFarm(){
        createAnimals();    // Beim Start wollen wir unsere Tiere anlegen.
        while(true){        // Programm Loop
            for(Haustier haustier : alleHaustiere){
                System.out.print("Index: " + haustier.getIndex() + " ");// Gib alle Tiere einmal aus
                System.out.print("Art: " + haustier.getArt() + " ");
                System.out.print("Name: " + haustier.getName() + " ");
                System.out.println("Size: " + haustier.getSize());
            }
            System.out.println("Haustier hinzufügen oder Tiergeräusch abspielen? (ja eintippen, nein für weitere Optionen)");  // Wir fragen ob ein neues Hinzukommen soll
            userinput = scan.nextLine();
            if(userinput.equals("ja")){         // Wenn ja
                addNewAnimal();                 // Starte die Subroutine
            }
            else if(userinput.equals("nein")){
                System.out.println("Index des Tieres eingeben um das jeweilige Geräusch abzuspielen!");
                playAnimalSound();
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
    private void playAnimalSound(){
        int searchIndex = scan.nextInt();
        scan.nextLine(); // Buffer clearen
        Haustier h = getHaustierByIndex(searchIndex);
        System.out.println("Haustier: " + h.getName() + " " + h.getArt() + " " + h.getSize());
        Haustier.gibLaut(h.getArt());
    }
    private Haustier getHaustierByIndex(int index) {
        for (Haustier h : alleHaustiere) {
            if (h.getIndex() == index) {
                return h; // gefunden!
            }
        }
        return null; // nichts gefunden
    }

}
