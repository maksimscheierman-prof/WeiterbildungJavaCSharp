package A008_20250930_Firmenanfrage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// ---------- Factory ----------
class NachrichtenFactory {
    private static Random rand = new Random();

    private static String randomEmail() {
        String[] namen = {"alice", "bob", "charlie", "diana", "erik"};
        String[] domains = {"mail.com", "web.de", "gmx.de", "gmail.com"};
        return namen[rand.nextInt(namen.length)] + "@" + domains[rand.nextInt(domains.length)];
    }

    private static String randomTelefonnummer() {
        return "0176" + (100000 + rand.nextInt(899999));
    }

    private static String randomAdresse() {
        String[] strassen = {"Musterstraße", "Bahnhofweg", "Ringallee", "Hauptplatz", "Schillerstraße"};
        int hausnummer = 1 + rand.nextInt(100);
        int plz = 10000 + rand.nextInt(89999);
        String stadt = "Stadt" + rand.nextInt(50);
        return strassen[rand.nextInt(strassen.length)] + " " + hausnummer + ", " + plz + " " + stadt;
    }

    private static String randomText() {
        String[] texte = {
                "Hallo, wie geht es dir?",
                "Ich komme später vorbei.",
                "Bitte rufe mich zurück.",
                "Dies ist eine Testnachricht.",
                "Sehr geehrte Damen und Herren, vielen Dank für Ihre Anfrage."
        };
        return texte[rand.nextInt(texte.length)];
    }

    private static String randomBetreff() {
        String[] betreffe = {"Meeting", "Frage", "Info", "Einladung", "Bestätigung"};
        return betreffe[rand.nextInt(betreffe.length)];
    }

    public static List<Email> erstelleEmails(int anzahl) {
        List<Email> emails = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            emails.add(new Email(randomEmail(), randomEmail(), randomBetreff(), randomText()));
        }
        return emails;
    }

    public static List<SMS> erstelleSMS(int anzahl) {
        List<SMS> smsListe = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            smsListe.add(new SMS(randomTelefonnummer(), randomTelefonnummer(), randomText()));
        }
        return smsListe;
    }

    public static List<Brief> erstelleBriefe(int anzahl) {
        List<Brief> briefe = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            briefe.add(new Brief(randomAdresse(), randomAdresse(), randomText()));
        }
        return briefe;
    }
}
