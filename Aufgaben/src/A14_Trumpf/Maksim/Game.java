package A14_Trumpf.Maksim;

import java.util.*;

public class Game {
    private Queue<Card> playerDeck;
    private Queue<Card> computerDeck;
    private final Scanner scanner = new Scanner(System.in);;

    public Game(Deck deck) {
        deck.shuffle();

        // 5 Karten austeilen
        playerDeck = new LinkedList<>();
        computerDeck = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            playerDeck.add(deck.getCards().get(i));
            computerDeck.add(deck.getCards().get(i + 5));
        }
    }

    public void start() {
        System.out.println("Spiel startet!");
        boolean playerTurn = true; // Spieler beginnt

        while (!playerDeck.isEmpty() && !computerDeck.isEmpty()) {
            Card playerCard = playerDeck.peek();   // oberste Karte
            Card computerCard = computerDeck.peek();

            System.out.println("\nDeine Karte: " + playerCard);
            System.out.println("Computer hat eine Karte verdeckt.");

            String chosenCategory;
            if (playerTurn) {
                // Spieler wählt
                chosenCategory = playerChooseCategory(playerCard);
            } else {
                // Computer wählt zufällig
                chosenCategory = computerChooseCategory(computerCard);
                System.out.println("Computer wählt Kategorie: " + chosenCategory);
            }

            int playerValue = playerCard.getAttribute(chosenCategory);
            int computerValue = computerCard.getAttribute(chosenCategory);

            System.out.println("Computer Karte war: " + computerCard);

            System.out.println("Vergleich in '" + chosenCategory + "':");
            System.out.println("Dein Wert: " + playerValue);
            System.out.println("Computer Wert: " + computerValue);

            if (playerValue > computerValue) {
                System.out.println("Du gewinnst die Runde!");
                playerDeck.add(playerDeck.poll());     // eigene Karte nach hinten
                playerDeck.add(computerDeck.poll());   // Gegner-Karte bekommen
                playerTurn = true; // Spieler darf weiter auswählen
                waitForEnter();
            } else if (computerValue > playerValue) {
                System.out.println("Computer gewinnt die Runde!");
                computerDeck.add(computerDeck.poll());
                computerDeck.add(playerDeck.poll());
                playerTurn = false; // Computer wählt nächste Eigenschaft
                waitForEnter();
            } else {
                System.out.println("Unentschieden! Beide Karten kommen nach hinten.");
                playerDeck.add(playerDeck.poll());
                computerDeck.add(computerDeck.poll());
                // Auswahlrecht bleibt gleich
                waitForEnter();
            }

            System.out.println("Deine Karten: " + playerDeck.size());
            System.out.println("Computer Karten: " + computerDeck.size());
        }

        if (playerDeck.isEmpty()) {
            System.out.println("Du hast verloren! 😢");
        } else {
            System.out.println("Du hast gewonnen! 🎉");
        }
    }

    private String playerChooseCategory(Card card) {
        List<String> categories = new ArrayList<>(card.getCategories());

        System.out.println("Wähle eine Kategorie:");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + " = " + categories.get(i));
        }

        while (true) {
            System.out.print("Deine Wahl (1-" + categories.size() + "): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Eingabe-Puffer leeren
                if (choice >= 1 && choice <= categories.size()) {
                    return categories.get(choice - 1);
                }
            } else {
                scanner.next(); // falsche Eingabe verwerfen
            }
            System.out.println("Ungültige Eingabe, bitte nochmal versuchen!");
        }
    }


    private String computerChooseCategory(Card card) {
        // ganz simpel: nimmt zufällige Kategorie
        List<String> categories = new ArrayList<>(card.getCategories());
        Random rand = new Random();
        return categories.get(rand.nextInt(categories.size()));
    }
    private void waitForEnter(){
        System.out.println("\nDrücke ENTER um fortzufahren...");
        scanner.nextLine(); // wartet, bis Spieler ENTER drückt
    }
}

