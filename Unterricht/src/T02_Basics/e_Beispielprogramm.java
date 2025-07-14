package T02_Basics;

import java.util.Scanner;

public class e_Beispielprogramm {

    /**
     *  Ablauf:
     *  1. Wir schreiben Code
     *  2. Der Compiler übersetzt diesen Code in Bytecode
     *  3. die JVM nimmt den Bytecode und kompiliert ihn in Maschinencode, der vom PC ausgeführt wird.
     *  Die JVM benötigt hierzu immer eine "public static void main(String[] args)" als Einstiegspunkt.
     */

    // Einstiegspunkt in unser Programm.
    public static void main(String[] args) {

        String eingabe = "";    // Eine Variable die unsere Konsoleneingabe speichert.
        Scanner scan = new Scanner(System.in);      // Unser Scanner Objekt

        System.out.println("Hallo, wie heißt du?"); // Wir begrüßen die Anwendenden
        eingabe = scan.nextLine();                  // Wir warten auf Eingabe
                                                    // Erst nach der Eingabe läuft der Code weiter

        // Erstmal wird etwas Text ausgegeben.
        System.out.println("Hallo " + eingabe + "!"); //Wir können auch den Inhalt von variablen ausgeben.
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Was hat Wurzeln, die niemand sieht, Ist größer als Bäume,");
        System.out.println("Steigt immer weiter hinauf, und wächst doch nie?");

        eingabe = scan.nextLine(); // Wir lesen erneut eine Eingabe und überschreiben die Variable.

        if(eingabe.equals("Berg")){                                             // Wenn die Antwort Berg ist, (was richtig ist)
            System.out.println("Garstiger Hobbit!");                            //Antworte fluchend.
        }else if(eingabe.equals("Wind")){                                       // Wenn die Antwort Wind ist, was die Antwort von Gollums zweitem Rätsel ist
            System.out.println("*Nee das ist die Antwort vom zweiten Rätsel*"); //Dann ist hier ein Cheater oder so.
        }
        else{                                                                   // Wenn keine Antwort zutrifft wurde ggfs. groß und Kleinschreibung falsch gewählt.
            System.out.println("Ne, also ne. Du musst übrigens auch auf" +
                    "groß und kleinschreibung achten.");
        }

        System.out.println("okay bye ... (Eingabe um zu beenden.)");
        eingabe = scan.nextLine();

    }
}
