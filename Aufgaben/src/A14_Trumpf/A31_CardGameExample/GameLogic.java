package A14_Trumpf.A31_CardGameExample;

import java.util.Collections;
import java.util.Scanner;

public class GameLogic {

    private Deck currentDeck;
    private Bot bot = new Bot();
    private Player player = new Player();
    private final int initialHandCards = 5;
    private Scanner scanner = new Scanner(System.in);
    public GameLogic() {

    }

    public void play(){
        createAnimalDeck();
        System.out.println(" Deckkartenmenge: " + currentDeck.getDeck().size());
        austeilen();

        while(true){
            System.out.println("Spieler Karten: ");
            player.showHandCards();

            System.out.println("Computer Karten: ");
            bot.ONLYDEBUG_showHandCards();

            System.out.println("Übrige Deckkarten: " + currentDeck.getDeck().size());
            scanner.nextLine();
        }
    }

    private void createAnimalDeck() {
        currentDeck = new DeckAnimals();
    }

    private void austeilen(){
        // Karten mischen
        shuffle(currentDeck);
        // Karten austeilen
        for(int i = 0; i < initialHandCards; i++ ){
            bot.addCardToHand(currentDeck.getLastCard());
            currentDeck.removeLastCard();
            player.addCardToHand(currentDeck.getLastCard());
            currentDeck.removeLastCard();
        }
    }


    private void shuffle(Deck d) {
        Collections.shuffle(d.getDeck());   // Mischt die Positionen Elementen in der von ArrayLists
    }
}
