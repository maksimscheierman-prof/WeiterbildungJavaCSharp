package A008_20250930_Firmenanfrage;

import java.time.LocalDate;
import java.util.Random;

// E-Mail
class Email extends Nachricht {
    private String absender;
    private String empfaenger;
    private String betreff;

    public Email(String absender, String empfaenger, String betreff, String text) {
        super(text);
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.betreff = betreff;
    }

    @Override
    public long send() {
        Random rand = new Random();
        long dauer = 1 + rand.nextInt(5); // 1–5 Sekunden
        System.out.println("Die E-Mail an " + empfaenger +
                " mit dem Betreff \"" + betreff +
                "\" und der Nachricht \"" + text +
                "\" wurde am " + LocalDate.now() + " versendet.");
        return dauer;
    }

    @Override
    public void anzeigen() {
        System.out.println("----- E-Mail -----");
        System.out.println("Von: " + absender);
        System.out.println("An: " + empfaenger);
        System.out.println("Betreff: " + betreff);
        System.out.println("Nachricht: " + text);
        System.out.println("Datum: " + LocalDate.now());
    }
}
