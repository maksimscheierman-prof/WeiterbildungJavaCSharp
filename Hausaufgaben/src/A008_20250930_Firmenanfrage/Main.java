package A008_20250930_Firmenanfrage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nachricht> nachrichten = new ArrayList<>();
        // 4 Emails, 3 SMS, 5 Briefe
        nachrichten.addAll(NachrichtenFactory.erstelleEmails(4));
        nachrichten.addAll(NachrichtenFactory.erstelleSMS(3));
        nachrichten.addAll(NachrichtenFactory.erstelleBriefe(5));
        System.out.println();
        for (Nachricht n : nachrichten) {
            long dauer = n.send();
            System.out.println("\nVersanddauer: " + dauer + " Sekunden");
            n.anzeigen();
            n.vorschau(20);
            System.out.println();
        }
    }
}
