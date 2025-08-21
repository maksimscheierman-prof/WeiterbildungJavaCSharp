package T15_Klassen_Objekte.PizzariaBeispiel;

import java.util.ArrayList;

public class Pizza {

    // Parameter unserer Pizza
    private String form = "rund";
    private int maxZutaten = 4;
    private ArrayList<String> zutatenListe = new ArrayList<>();


    // Konstruktor zum erstellen einer neuen Pizza
    public Pizza() {}


    public ArrayList<String> getZutaten() {
        return zutatenListe;
    }
    public int getMaxZutaten() {
        return maxZutaten;
    }
    public String getForm() {
        return form;
    }

    // Methode zum hinzufügen von Zutaten
    public void addZutat(String zutat){
        if(zutatenListe.size() < maxZutaten){
            // zutatenListe == 0   <- Dann +1
            // zutatenListe == 1   <- Dann +1
            // zutatenListe == 2   <- Dann +1
            // zutatenListe == 3   <- Dann +1
            // zutatenListe == 4   <- Dann mach nichts
            zutatenListe.add(zutat); // Fügt die Zutat hinzu
        }
    }

    // Methode zum entfernen von Zutaten
    public void removeZutat(String zutat){
            zutatenListe.remove(zutat);     // entferne die Zutat
                                            // Wenn es sie nicht gibt
                                            // passiert nichts.
    }



}
