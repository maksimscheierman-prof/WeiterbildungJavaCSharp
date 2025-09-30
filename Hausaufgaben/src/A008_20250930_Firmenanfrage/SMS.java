package A008_20250930_Firmenanfrage;

import java.time.LocalDate;
import java.util.Random;

// SMS
class SMS extends Nachricht {
    private String absenderNr;
    private String empfaengerNr;

    public SMS(String absenderNr, String empfaengerNr, String text) {
        super(text);
        this.absenderNr = absenderNr;
        this.empfaengerNr = empfaengerNr;
    }

    @Override
    public long send() {
        Random rand = new Random();
        long dauer = 1 + rand.nextInt(2); // 1–2 Sekunden
        System.out.println("Die SMS an " + empfaengerNr +
                " mit der Nachricht \"" + text +
                "\" wurde am " + LocalDate.now() + " versendet.");
        return dauer;
    }

    @Override
    public void anzeigen() {
        System.out.println("----- SMS -----");
        System.out.println("Von: " + absenderNr);
        System.out.println("An: " + empfaengerNr);
        System.out.println("Nachricht: " + text);
        System.out.println("Datum: " + LocalDate.now());
    }
}