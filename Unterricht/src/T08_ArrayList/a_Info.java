package T08_ArrayList;

import java.util.ArrayList;     /** ArrayList wird hier importiert. */

public class a_Info {

    public static void main(String[] args) {

        /***********************************************************************************************************************************
          █████╗ ██████╗ ██████╗  █████╗ ██╗   ██╗██╗     ██╗███████╗████████╗
         ██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██║     ██║██╔════╝╚══██╔══╝
         ███████║██████╔╝██████╔╝███████║ ╚████╔╝ ██║     ██║███████╗   ██║
         ██╔══██║██╔══██╗██╔══██╗██╔══██║  ╚██╔╝  ██║     ██║╚════██║   ██║
         ██║  ██║██║  ██║██║  ██║██║  ██║   ██║   ███████╗██║███████║   ██║
         ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝╚══════╝   ╚═╝
         ***********************************************************************************************************************************/

        /**                                     Dynamische Listen: ArrayList
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *  Eine ArrayList ist eine flexible Liste, die Elemente aufnehmen, entfernen und verändern kann.
         *  Im Gegensatz zu Arrays ist die Größe nicht fest, sondern dynamisch. Bedeutet es gibt prinzipiell
         *  keine fixe obergrenze für speicherbare Werte.
         *
         *  Eine ArrayList speichert Objekte. Es muss also ein Referenztyp oder eine Wrapperklasse (z.B. String, Integer) angegeben werden.
         *  → Keine primitiven Typen wie int, double, boolean
         *  → Stattdessen: Integer, Double, Boolean
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         */

        /*** Erstellung & Methoden * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *      Die ArrayList ist eine Klasse, die über die Java Util-Bibliothek importiert werden muss.
         *      import java.util.ArrayList;
         *
         *      ArrayList<String> namen = new ArrayList<>(); // Erstellt eine Leere Liste für Strings
         *
         *      Wichtige Methoden:
         *      - .add(element)            → Fügt ein Element am Ende hinzu
         *      - .get(index)              → Holt ein Element an Position 'index'
         *      - .set(index, element)     → Ändert ein Element an Position 'index'
         *      - .remove(index)           → Entfernt das Element an Position 'index'
         *      - .size()                  → Gibt die Anzahl der Elemente zurück
         *      - .clear()                 → Löscht alle Elemente
         *      - .contains(element)       → Prüft, ob ein bestimmtes Element vorhanden ist
         *
         *      Hinweis:
         *      Index beginnt bei 0! Ungültige Zugriffe (z.B. get(5) bei nur 3 Elementen) verursachen Fehler!
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        /** BEISPIEL 1: Erstellen und befüllen **/
        ArrayList<String> einkaufsliste = new ArrayList<>();
        einkaufsliste.add("Brot");
        einkaufsliste.add("Milch");
        einkaufsliste.add("Eier");

        System.out.println("Einkaufsliste: " + einkaufsliste);          // [Brot, Milch, Eier]

        /** BEISPIEL 2: Zugriff **/
        String erstesElement = einkaufsliste.get(0);
        System.out.println("Erstes Element: " + erstesElement);         // Brot
        System.out.println("Zweites element: "+einkaufsliste.get(1));   // Milch

        /** BEISPIEL 3: Bearbeitung **/
        einkaufsliste.set(1, "Hafermilch");                             // Milch wird ersetzt
        System.out.println("Aktualisierte Liste: " + einkaufsliste);    // [Brot, Hafermilch, Eier]
        einkaufsliste.remove(2);                                  // Entfernt "Eier"
        System.out.println("Nach dem Entfernen: " + einkaufsliste);     // [Brot, Hafermilch]

        /** BEISPIEL 4: Durchlaufen mit Schleife **/
        System.out.println("Einträge in der Liste:");
        for(int i = 0; i < einkaufsliste.size(); i++) {
            System.out.println("- " + einkaufsliste.get(i));
        }
        /** BEISPIEL 5: Durchlaufen mit foreach Schleife **/
        for(String zutat : einkaufsliste) {
            System.out.println("- " + zutat);
        }

    }
}

