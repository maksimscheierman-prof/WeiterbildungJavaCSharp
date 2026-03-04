package Uebungsaufgaben;

public class BankAccount {

    // Static Zähler für alle erstellten Konten
    private static int accountCount = 0;

    // Individuelle Kontonummer (ID)
    private final int id;

    // Konstruktor
    public BankAccount() {
        accountCount++;      // Erhöhe statischen Zähler
        this.id = accountCount;  // Weise fortlaufende Kontonummer zu
    }

    // Getter für die Kontonummer
    public int getId() {
        return id;
    }

    // Statische Methode zur Abfrage der Anzahl aller Konten
    public static int getAccountCount() {
        return accountCount;
    }
    public static class Main {
        public static void main(String[] args) {
            BankAccount acc1 = new BankAccount();
            BankAccount acc2 = new BankAccount();
            BankAccount acc3 = new BankAccount();

            System.out.println("acc1 ID: " + acc1.getId());
            System.out.println("acc2 ID: " + acc2.getId());
            System.out.println("acc3 ID: " + acc3.getId());

            System.out.println("Gesamtanzahl Konten: " + BankAccount.getAccountCount());
        }
    }

}
