package T16_Queue_HashMap.Aufgaben;

import java.util.HashMap;
import java.util.Scanner;

/** Telefonbuch */
public class Muster_Programm2 {

    public static void main(String[] args) {

        HashMap<String,Integer> telefonbuch = new HashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
       // String input;

        while(true){
            System.out.println("--- Telefonbuch --- ");
            System.out.println("1. Kontakt hinzufügen");
            System.out.println("2. Kontakt suchen");
            System.out.println("3. Kontakt löschen");
            System.out.println("4. Alle Kontakte anzeigen");

            String input = scan.nextLine();

            String name;
            Integer number;
            switch(input){
                case "1":
                    System.out.print("Bitte geben Sie den Namen ein: ");
                    name = scan.nextLine();
                    System.out.print("Bitte geben Sie die Telefonnummer ein: ");
                    try{
                        number = Integer.parseInt(scan.nextLine());
                        telefonbuch.put(name, number);
                        System.out.println("Kontakt hinzugefügt!");
                    }catch(Exception e){
                        System.out.println("Ungültige Eingabe, bitte nur Zahlen eingeben.");
                    }

                    break;
                case "2":
                    System.out.print("Bitte geben Sie den Namen ein: ");
                    name = scan.nextLine();
                    if (telefonbuch.containsKey(name)) {
                        System.out.println(name + ": " + telefonbuch.get(name) + "\n");
                    } else {
                        System.out.println("Kontakt nicht gefunden.\n");
                    }
                    break;
                case "3":
                    System.out.print("Bitte geben Sie den Namen ein: ");
                    name = scan.nextLine();
                    if (telefonbuch.remove(name) != null) {
                        System.out.println("Kontakt gelöscht!\n");
                    } else {
                        System.out.println("Kontakt nicht gefunden.\n");
                    }
                    break;
                case "4":
                    System.out.println("Alle Kontakte:");
                    for (String key : telefonbuch.keySet()) {
                        System.out.println(key + ": " + telefonbuch.get(key));
                    }
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
        }
    }
}
