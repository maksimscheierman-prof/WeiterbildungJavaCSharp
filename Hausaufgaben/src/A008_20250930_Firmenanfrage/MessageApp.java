package A008_20250930_Firmenanfrage;

import java.util.ArrayList;
import java.util.Scanner;

public class MessageApp {

    private ArrayList<Message> messages = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("_____________________________________");
            System.out.println("|          Hauptmenü                 |");
            System.out.println("|------------------------------------|");
            System.out.println("| 1.  Neue Email erstellen           |");
            System.out.println("| 2.  Neue SMS erstellen             |");
            System.out.println("| 3.  Neuen Brief erstellem          |");
            System.out.println("| 4.  Nachrichtenübersicht           |");
            System.out.println("| 0.  Programm beenden               |");
            System.out.println("|____________________________________|");
            System.out.print(  "Wähle eine Option (0-4): ");

            String auswahl = scanner.nextLine();

            switch (auswahl) {
                case "1" -> createEmail();
                case "2" -> createSMS();
                case "3" -> createLetter();
                case "4" -> messageOverview();
                case "0" -> {
                    running = false;
                    System.out.println("Programm beendet");
                }
                default -> System.out.println("Ungültige Eingab");
            }
        }
    }

    private void createEmail() {
        System.out.print("Absender Email: ");
        String sender = scanner.nextLine();
        System.out.print("Empfänger Email: ");
        String empfänger = scanner.nextLine();
        System.out.print("Betreff: ");
        String betreff = scanner.nextLine();
        System.out.print("Text: ");
        String text = scanner.nextLine();

        Message email = new Email(sender, empfänger, betreff, text);
        messages.add(email);
        System.out.println(email.send());
    }

    private void createSMS() {
        System.out.print("Absender Nummer: ");
        String sender = scanner.nextLine();
        System.out.print("Empfänger Nummer: ");
        String empfänger = scanner.nextLine();
        System.out.print("Text: ");
        String text = scanner.nextLine();

        Message sms = new SMS(sender, empfänger, text);
        messages.add(sms);
        System.out.println(sms.send());
    }

    private void createLetter() {
        System.out.print("Absender Adresse: ");
        String sender = scanner.nextLine();
        System.out.print("Empfänger Adresse: ");
        String empfänger = scanner.nextLine();
        System.out.print("Portokosten (z.B. 0.85): ");
        double postage = Double.parseDouble(scanner.nextLine());
        System.out.print("Text: ");
        String text = scanner.nextLine();

        Message brief = new Brief(sender, empfänger, postage, text);
        messages.add(brief);
        System.out.println(brief.send());
    }

    private void messageOverview() {
        if (messages.isEmpty()) {
            System.out.println("Keine Nachrichten vorhanden");
            return;
        }

        System.out.println("\n Nachrichten Vorschau ");
        for (int i = 0; i < messages.size(); i++) {
            System.out.print((i + 1) + ". ");
            messages.get(i).preview(20);
        }

        System.out.println("\nNummer der Nachricht eingeben für die Details (0 für Hauptmenü): ");
        int auswahl = Integer.parseInt(scanner.nextLine());

        if (auswahl > 0 && auswahl <= messages.size()) {
            messages.get(auswahl - 1).display();
        } else {
            System.out.println("Zurück zum Hauptmenü...");
        }
    }
}