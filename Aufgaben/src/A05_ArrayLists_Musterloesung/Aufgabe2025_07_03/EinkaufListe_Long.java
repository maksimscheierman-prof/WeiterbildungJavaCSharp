/* Aufgabe 5.1: Einkaufsliste
 * Erstellen eine Einkaufsliste mit einem ArrayList.
 * @author Pham Hoang Long Dang */

package A05_ArrayLists_Musterloesung.Aufgabe2025_07_03;

import java.util.ArrayList;
import java.util.Scanner;

public class EinkaufListe_Long {
    /* Methode 1: erstellt eine Einkaufsliste als ArrayList von ArrayList.
     * Methode 2: erstellt eine Einkaufsliste als ArrayList von Artikeln als Objekten.
     * Artikel wird in einer eigenen Klasse definiert. */
    private static final ArrayList<ArrayList<String>> einkaufsliste = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("Einkaufsliste");
        boolean laufend = true;
        while (laufend) {
            System.out.println("\n--- Bitte eine Option wählen ---");
            System.out.println("1. Artikel hinzufügen");
            System.out.println("2. Artikel suchen");
            System.out.println("3. Artikel entfernen");
            System.out.println("4. Artikel ändern");
            System.out.println("5. Liste anzeigen");
            System.out.println("6. Beenden");
            System.out.print("Wähle eine Option: ");

            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    artikelHinzufuegen();
                    break;
                case "2":
                    artikelSuchen();
                    break;
                case "3":
                    artikelEntfernen();
                    break;
                case "4":
                    artikelAendern();
                    break;
                case "5":
                    listeAnzeigen();
                    break;
                case "6":
                    laufend = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte erneut versuchen.");
            }
        }
    }

    // Speichern Artikel in die Einkaufsliste. Es wird großgeschrieben, um die Suche einfacher zu machen.
    private static void artikelHinzufuegen() {
        String name;
        String kategorie;
        String menge;
        String preis;
        ArrayList<String> artikel = new ArrayList<>();

        System.out.println("Artikel hinzufügen: ");
        System.out.print("Artikel name: ");
        name = scanner.nextLine().toUpperCase();
        System.out.print("Artikel kategorie: ");
        kategorie = scanner.nextLine().toUpperCase();
        System.out.print("Artikel menge: ");
        menge = scanner.nextLine();
        System.out.print("Artikel preis: ");
        preis = scanner.nextLine();

        // Methode 1: ArrayList von ArrayList
        artikel.add(name);
        artikel.add(kategorie);
        artikel.add(menge);
        artikel.add(preis);
        einkaufsliste.add(artikel);
        System.out.println("Methode 1: Artikel wurde hinzugefügt:\n" + artikel);

    }

    private static void artikelSuchen() {
        System.out.print("Artikel name suchen: ");
        String name = scanner.nextLine().toUpperCase();

        // Methode 1: ArrayList von ArrayList
        for (ArrayList<String> artikel : einkaufsliste) {
            if (artikel.getFirst().equals(name)) {
                System.out.println("Methode 1: Artikel wurde gefunden:\n" + artikel);
                return;
            } else {
                System.out.println("Methode 1: Artikel wurde nicht gefunden.\n");
            }
        }
    }

    private static void listeAnzeigen() {
        // Methode 1: ArrayList von ArrayList
        if (einkaufsliste.isEmpty()) {
            System.out.println("Methode 1: Die Einkaufsliste ist leer.");
        } else {
            System.out.println("Methode 1: Aktuelle Einkaufsliste:");
            for (int i = 0; i < einkaufsliste.size(); i++) {
                System.out.println((i + 1) + ". " + einkaufsliste.get(i));
            }
        }

    }

    private static void artikelAendern() {
        listeAnzeigen();
        System.out.print("Gib die Nummer des Artikels ein, den du ändern möchtest: ");
        int artikelNummer = scanner.nextInt();
        scanner.nextLine();

        // prüfe, ob Artikel existiert
        if (artikelNummer < 1 || artikelNummer > einkaufsliste.size()) {
            System.out.println("Ungültige Eingabe!");
            return;
        }

        System.out.println("Artikel Number " + artikelNummer + " ändern: ");
        System.out.print("Artikel name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Artikel kategorie: ");
        String kategorie = scanner.nextLine().toUpperCase();
        System.out.print("Artikel menge: ");
        String menge = scanner.nextLine();
        System.out.print("Artikel preis: ");
        String preis = scanner.nextLine();

        // Methode 1: ArrayList von ArrayList
        einkaufsliste.get(artikelNummer - 1).set(0, name);
        einkaufsliste.get(artikelNummer - 1).set(1, kategorie);
        einkaufsliste.get(artikelNummer - 1).set(2, menge);
        einkaufsliste.get(artikelNummer - 1).set(3, preis);
        System.out.println("Methode 1: Artikel wurde geändert:\n" + einkaufsliste.get(artikelNummer - 1));

    }

    private static void artikelEntfernen() {
        listeAnzeigen();
        System.out.print("Gib die Nummer des Artikels ein, den du löschen möchtest: ");
        int artikelNummer = scanner.nextInt();
        scanner.nextLine();

        // prüfe, ob Artikel existiert
        if (artikelNummer < 1 || artikelNummer > einkaufsliste.size()) {
            System.out.println("Ungültige Eingabe!");
            return;
        }

        // Methode 1: ArrayList von ArrayList
        System.out.println("Methode 1: Artikel wird gelöscht:\n" + einkaufsliste.get(artikelNummer - 1));
        einkaufsliste.remove(artikelNummer - 1);
    }
}
