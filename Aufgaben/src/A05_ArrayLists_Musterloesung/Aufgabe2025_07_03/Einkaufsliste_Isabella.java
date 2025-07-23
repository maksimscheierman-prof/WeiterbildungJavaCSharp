/**
 * 2. Einkaufsliste
 * - Erstelle eine Interaktive Einkaufsliste
 * Folgende Features werden benötigt:
 * -> Menü:
 * - -> Hinzufügen
 * - -> Ändern
 * - -> Löschen
 * - -> Anzeigen
 * __ Extra Features __
 * -> Menge
 * -> Kosten
 * -> Kategorien
 **/

//TO DO //
// - leere Liste am Anfang? anzeige in 2,3 & 4- //
// - doppelnennungen ? - //
// - Index?? - =>Darf nicht negativ sein, -1 als failsafe?//
// - failsafe int/char - //
// -  - //


package A05_ArrayLists_Musterloesung.Aufgabe2025_07_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Einkaufsliste_Isabella {
    public static void main(String[] args) {

        ArrayList<String> einkaufsliste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int menueauswahl;
        String suche;
        String yesno;
        String item;
        String VERBOTEN = "Snacks";
        boolean eingebend = true;
        System.out.println("\nErstelle eine Einkaufsliste mit mir!\n");
        while (true) {
            //Menü//
            System.out.println("Vergiss nicht: Snacks sind der Feind!\n");
            System.out.println("Menü: \n 1 - Item hinzufügen\n 2 - Item ändern\n 3 - Item löschen\n " +
                    "4 - fertige Liste anzeigen\n 6 - Programm beenden\n");
            menueauswahl = scan.nextInt();
            scan.nextLine();
            //Hinzufügen//
            if (menueauswahl == 1) {
                System.out.println("Trage deine Einkaufs-Items mit mir ein!");
                while (eingebend) {
                    System.out.println("Bitte sag mir welches Item auf die Liste soll: ");
                    item = scan.nextLine();


                    if (item.equals(VERBOTEN)) {
                        System.out.println("neim!\nFeind!\n");
                    } else {
                        einkaufsliste.add(item);
                    }

                    System.out.println("Bisherige Items auf deiner Liste:");
                    for (int i = 0; i < einkaufsliste.size(); i++) {
                        System.out.println("\n * " + einkaufsliste.get(i));
                    }
                    //Ins Menü zurück//
                    System.out.println("Zurück ins Menü mit (5) ");
                    System.out.println("Weitere Items hinzufügen mit (1)");
                    menueauswahl = scan.nextInt();
                    scan.nextLine();
                    if (menueauswahl == 5) {
                        eingebend = false;
                        break;
                    }
                }
            }
            //Ändern//
            else if (menueauswahl == 2) {
                System.out.println("Bitte zu änderndes Item eingeben: ");
                suche = scan.nextLine();
                for (int i = 0; i < einkaufsliste.size(); i++) {

                    if (einkaufsliste.contains(suche)) {
                        System.out.println("Dieses Item ist auf der Liste\nMöchtest du es ändern?(Ja/Nein)");
                        yesno = scan.nextLine();
                        if (yesno.equals("Nein")) {
                            break;
                        } else if (yesno.equals("Ja")) {
                            System.out.println("Welches Item möchtest du statt " + suche + " auf deiner Liste eintagen?");
                            item = scan.nextLine();
                            if (item.equals(VERBOTEN)) {
                                System.out.println("neim!\nFeind!\n");
                            } else {
                                einkaufsliste.add(item);
                                einkaufsliste.remove(suche);
                                System.out.println("Dein Item wurde geändert!");
                                System.out.println("Bisherige Items auf deiner Liste: ");
                                for (int y = 0; y < einkaufsliste.size(); y++) {
                                    System.out.println("\n * " + einkaufsliste.get(y));
                                }
                            }
                        }

                    } else {
                        System.out.println("Dieses Item ist leider nicht auf der Liste");
                        System.out.println("Möchtest du es hinzufügen? (Ja / Nein)");
                        yesno = scan.nextLine();
                        for (int j = 0; j < einkaufsliste.size(); j++) {
                            if (yesno.equals("Ja")) {
                                einkaufsliste.add(suche);
                                System.out.println("Bisherige Items auf deiner Liste: ");
                                for (int y = 0; y < einkaufsliste.size(); y++) {
                                    System.out.println("\n * " + einkaufsliste.get(y));
                                }
                            } else if (yesno.equals("Nein")) {
                                System.out.println("Das Item wurde nicht hinzugefügt");
                                break;
                            } else {
                                System.out.println("Bitte Ja oder Nein eingeben");
                            }
                        }
                    }
                }
            }

            //Löschen//
            else if (menueauswahl == 3) {
                System.out.println("Bitte sag mir welches Item du löschen möchtest: ");
                suche = scan.nextLine();
                for (int i = 0; i < einkaufsliste.size(); i++) {
                    if (einkaufsliste.contains(suche)) {
                        System.out.println("Möchtest du " + suche + " wirklich löschen?(Ja/Nein)");
                        yesno = scan.nextLine();
                        if (yesno.equals("Ja")) {
                            einkaufsliste.remove(suche);
                            System.out.println(suche + " wurde gelöscht.");
                        } else if (yesno.equals("Nein")) {
                            System.out.println(suche + " wurde nicht gelöscht..make up ur mind man..");

                        } else {
                            System.out.println("Lern doch bitte zu tippen ò_ó");
                        }
                    } else {
                        System.out.println("Dieses Item ist nicht auf der Liste\nSpart dir das Löschen =)");
                    }
                }

            }


            //Liste anzeigen//
            else if (menueauswahl == 4) {
                System.out.println("Bisherige Items auf deiner Liste: ");
                for (int i = 0; i < einkaufsliste.size(); i++) {
                    System.out.println("\n * " + einkaufsliste.get(i));
                }
            }


            //Programm beenden//
            else if (menueauswahl == 6) {
                break;
            } else {
                System.out.println("Bitte zwischen 1&6 wählen");
            }
        }
    }
}
