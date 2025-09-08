package A10_Queue_Hashmap.TelefonbuchMUSTERLOESUNG;

import java.util.HashMap;
import java.util.Scanner;

public class Telefonbuch {

HashMap<String, Kontakt> teleBuch = new HashMap<>();
String name;
String nummer;


    public void run() {
        while (true) {
            System.out.println("--- Telefonbuch --- ");
            System.out.println("1. Kontakt hinzufügen");
            System.out.println("2. Kontakt suchen");
            System.out.println("3. Kontakt löschen");
            System.out.println("4. Alle Kontakte anzeigen");

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            switch (input) {
                case "1":   // Kontakt hinzufügen
                    newContact();
                    break;
                case "2": // Kontakt suchen
                    System.out.println("Bitte geben Sie den Namen ein:");
                    name = scan.nextLine();
                    showByName(name);
                    break;
                case "3": // Kontakt löschen
                    System.out.println("Welchen Kontakt wollen sie löschen?");
                    name = scan.nextLine();
                    deleteByName(name);
                    break;
                case "4": // Alle Kontakte anzeigen
                    showContacts();
                    break;
                default:
                    System.out.println("Das kann ich nicht!");
                    break;
            }
        }
    }

    private void deleteByName(String name){
        if(teleBuch.containsKey(name)){
            teleBuch.remove(name);
            System.out.println("Kontakt : " + name + "wurde geloescht.");
        }else{
            System.out.println("Kontakt : " + name + "wurde nicht gefunden.");
        }
    }

    private void showByName(String name){
        if(teleBuch.containsKey(name)) {
            System.out.println("Name: " + name);
            teleBuch.get(name).printInfos();
        }
    }

    private void newContact(){
        String name;
        String nummer;
        String email;
        String notizen;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Name eingeben: ");
        name = scan.nextLine();
        System.out.println("Bitte Nummer eingeben: ");
        nummer = scan.nextLine();
        System.out.println("Bitte Email eingeben: ");
        email = scan.nextLine();
        System.out.println("Bitte Notizen eingeben: ");
        notizen = scan.nextLine();

        Kontakt neuerKontakt = new Kontakt(name,nummer,email,notizen);
        teleBuch.put(name, neuerKontakt);
    }

    private void showContacts(){
        for (String key : teleBuch.keySet()) {
            System.out.println("Die Kontakte im Telefonbuch: ");
            System.out.println("Name: " + key);
            teleBuch.get(key).printInfos();
        }
    }

}
