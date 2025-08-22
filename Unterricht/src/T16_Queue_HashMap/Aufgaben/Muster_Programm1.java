package T16_Queue_HashMap.Aufgaben;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Muster_Programm1 {

    public static void main(String[] args) {
        Queue<String> kunde = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        String name = "";
        String input = "";

        while(true){
            System.out.println("(1) Kunden in warteschlange anlegen. (2) nächsten Kunden dran nehmen.");
            input = scan.nextLine();
            switch(input) {
                case "1":
                    System.out.println("Anmeldung, wie ist ihr Name?");
                    name = scan.nextLine();
                    kunde.add(name);
                    break;
                case "2":
                    System.out.println("Jetzt am Telefon: " + kunde.poll());
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
            System.out.println("Nächste Person in der Schlange: " + kunde.peek());
            System.out.println("Personen in der Warteschlange: "+ kunde.size());

        }
    }
}
