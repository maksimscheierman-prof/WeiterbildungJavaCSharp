package A008_20250930_Firmenanfrage;

import java.time.LocalDate;
import java.util.Random;

// Brief
class Brief extends Nachricht {
    private String absenderAdresse;
    private String empfaengerAdresse;
    private double porto;

    public Brief(String absenderAdresse, String empfaengerAdresse, String text) {
        super(text);
        this.absenderAdresse = absenderAdresse;
        this.empfaengerAdresse = empfaengerAdresse;
        this.porto = berechnePorto();
    }

    // Bonus: Porto anhand Textlänge
    private double berechnePorto() {
        int laenge = text.length();
        if (laenge <= 100) return 0.85;
        if (laenge <= 500) return 1.55;
        return 2.70;
    }

    @Override
    public long send() {
        Random rand = new Random();
        long dauer = (1 + rand.nextInt(3)) * 24 * 60 * 60; // 1–3 Tage in Sekunden
        System.out.println("Der Brief an \"" + empfaengerAdresse +
                "\" mit der Nachricht \"" + text +
                "\" wurde am " + LocalDate.now() +
                " versendet. (Porto: " + porto + " EUR)");
        return dauer;
    }

    @Override
    public void anzeigen() {
        System.out.println("----- Brief -----");
        System.out.println("Von: " + absenderAdresse);
        System.out.println("An: " + empfaengerAdresse);
        System.out.println("Porto: " + porto + " EUR");
        System.out.println("Nachricht: " + text);
        System.out.println("Datum: " + LocalDate.now());
    }
}
