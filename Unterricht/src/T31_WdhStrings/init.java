package T31_WdhStrings;

import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Eingabe
        System.out.print("Gib einen Satz ein: ");
        String satz = sc.nextLine();

        System.out.print("Gib ein Wort ein, das im Satz vorkommen könnte: ");
        String wort = sc.nextLine();

        System.out.println("\n--- Ergebnisse ---");

        // 2.1 Prüfe, ob Satz mit "Hallo" beginnt oder mit "!" endet
        if (satz.startsWith("Hallo")) {
            System.out.println("Der Satz beginnt mit 'Hallo'.");
        } else if (satz.endsWith("!")) {
            System.out.println("Der Satz endet mit '!'.");
        } else {
            System.out.println("Der Satz beginnt nicht mit 'Hallo' und endet nicht mit '!'.");
        }

        // 2.2 Prüfe, ob Satz das Wort enthält (case-insensitive)
        if (satz.toLowerCase().contains(wort.toLowerCase())) {
            System.out.println("Der Satz enthält das Wort '" + wort + "'.");
        } else {
            System.out.println("Der Satz enthält das Wort '" + wort + "' nicht.");
        }

        // 2.3 Ersetze Leerzeichen durch Unterstriche
        String ersetzt = satz.replace(" ", "_");
        System.out.println("Satz mit Unterstrichen: " + ersetzt);

        // 2.4 Länge des Satzes
        System.out.println("Länge des Satzes: " + satz.length());

        // 2.5 Position des ersten Auftretens des Wortes
        int pos = satz.toLowerCase().indexOf(wort.toLowerCase());
        if (pos != -1) {
            System.out.println("Das Wort '" + wort + "' beginnt an Position: " + pos);
        } else {
            System.out.println("Das Wort '" + wort + "' wurde nicht gefunden.");
        }

        // 2.6 Nur die ersten 10 Zeichen
        String kurz = satz.length() > 10 ? satz.substring(0, 10) : satz;
        System.out.println("Erste 10 Zeichen: " + kurz);

        // 2.7 Leerzeichen am Anfang/Ende entfernen
        String getrimmt = satz.trim();
        System.out.println("Getrimmter Satz: '" + getrimmt + "'");

        // 2.8 Erstes Zeichen
        if (!satz.isEmpty()) {
            System.out.println("Erstes Zeichen: " + satz.charAt(0));
        } else {
            System.out.println("Satz ist leer.");
        }

        sc.close();
    }
}

