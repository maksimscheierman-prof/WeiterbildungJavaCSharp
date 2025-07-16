package A03_2DArrays.Musterloesung;

import java.util.Scanner;

public class Essensplan {

    public static void main(String[] args) {
        // Wochentage als String-Array (Index 0 = Montag, Index 4 = Freitag)
        String[] tage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};

        // Mahlzeiten am Tag
        String[] mahlzeiten = {"Frühstück", "Mittagessen", "Abendessen"};

        // 2D-Array für den Essensplan: Zeile = Tag, Spalte = Mahlzeit
        String[][] essensplan = new String[tage.length][mahlzeiten.length];

        Scanner scanner = new Scanner(System.in); // Scanner zur Eingabe durch Benutzer

        // Anfangszustand: alle Felder mit "-" füllen
        for (int i = 0; i < tage.length; i++) {
            for (int j = 0; j < mahlzeiten.length; j++) {
                essensplan[i][j] = "-"; // Platzhalter für noch nicht geplante Mahlzeiten
            }
        }

        boolean weiter = true; // Kontrollvariable für die Menü-Schleife

        // Menü wird so lange wiederholt, bis der Benutzer "x" eingibt
        while (weiter) {
            // Menüoptionen anzeigen
            System.out.println("\n1. Essen für einen Tag anzeigen");
            System.out.println("2. Ganze Woche anzeigen");
            System.out.println("3. Neue Woche planen");
            System.out.println("4. Neuen Tag planen");
            System.out.println("x. Programm beenden");
            System.out.print  ("Wähle eine Option: ");
            String auswahl = scanner.nextLine(); // Benutzereingabe

            // --- Option 1: Einzelnen Tag anzeigen ---
            if (auswahl.equals("1")) {
                System.out.print("Gib den Tag ein (Montag - Freitag): ");
                String tagEingabe = scanner.nextLine(); // Eingabe des Tagesnamens
                int tagIndex = -1;

                // Passenden Index zum eingegebenen Tag finden
                for (int i = 0; i < tage.length; i++) {
                    if (tage[i].equalsIgnoreCase(tagEingabe)) {
                        tagIndex = i;
                        break;
                    }
                }

                // Falls Tag gültig ist → entsprechende Mahlzeiten anzeigen
                if (tagIndex == -1) {
                    System.out.println("Ungültiger Tag.");
                } else {
                    System.out.println(tage[tagIndex] + ":");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("  " + mahlzeiten[i] + ": " + essensplan[tagIndex][i]);
                    }
                }

                // --- Option 2: Ganze Woche anzeigen ---
            } else if (auswahl.equals("2")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(tage[i] + ":");
                    for (int j = 0; j < 3; j++) {
                        System.out.println("  " + mahlzeiten[j] + ": " + essensplan[i][j]);
                    }
                }

                // --- Option 3: Neue Woche komplett planen ---
            } else if (auswahl.equals("3")) {
                // Für jeden Tag die drei Mahlzeiten eingeben
                for (int i = 0; i < 5; i++) {
                    System.out.println("Planung für " + tage[i] + ":");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(mahlzeiten[j] + ": ");
                        essensplan[i][j] = scanner.nextLine(); // Eingabe speichern
                    }
                }

                // --- Option 4: Einzelnen Tag neu planen ---
            } else if (auswahl.equals("4")) {
                System.out.print("Gib den Tag ein (Montag - Freitag): ");
                String tagEingabe = scanner.nextLine(); // Tageseingabe
                int tagIndex = -1;

                // Index für den eingegebenen Tag finden
                for (int i = 0; i < tage.length; i++) {
                    if (tage[i].equalsIgnoreCase(tagEingabe)) {
                        tagIndex = i;
                        break;
                    }
                }

                // Wenn gültiger Tag, dann neue Mahlzeiten für diesen Tag eingeben
                if (tagIndex == -1) {
                    System.out.println("Ungültiger Tag.");
                } else {
                    System.out.println("Planung für " + tage[tagIndex] + ":");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(mahlzeiten[j] + ": ");
                        essensplan[tagIndex][j] = scanner.nextLine(); // Eingabe speichern
                    }
                }

                // --- Option x: Programm beenden ---
            } else if (auswahl.equalsIgnoreCase("x")) {
                weiter = false; // Schleife wird beendet
                System.out.println("Programm beendet.");

                // --- Falsche Eingabe ---
            } else {
                System.out.println("Ungültige Eingabe."); // Hinweis bei ungültiger Option
            }
        }
    }
}
