package A14_Trumpf.Maksim;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Willkommen zu Quartett!");
            System.out.println("Wähle ein Deck:");
            System.out.println("1 = Superhelden");
            System.out.println("2 = Animes");
            System.out.println("3 = Galaxien");

            int choice = 0;
            while (choice < 1 || choice > 3) {
                System.out.print("Deine Wahl: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    scanner.next(); // falsche Eingabe verwerfen
                }
            }

            Deck chosenDeck = null;
            switch (choice) {
                case 1:
                    chosenDeck = DeckFactory.createSuperheroDeck();
                    System.out.println("Du spielst mit dem Superhelden-Deck!");
                    break;
                case 2:
                    chosenDeck = DeckFactory.createAnimeDeck();
                    System.out.println("Du spielst mit dem Anime-Deck!");
                    break;
                case 3:
                    chosenDeck = DeckFactory.createGalaxyDeck();
                    System.out.println("Du spielst mit dem Galaxien-Deck!");
                    break;
            }

            Game game = new Game(chosenDeck);
            game.start();

            scanner.close();
        }
    }


