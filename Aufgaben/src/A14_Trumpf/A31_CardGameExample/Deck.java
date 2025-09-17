package A14_Trumpf.A31_CardGameExample;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();




    public ArrayList<Card> getDeck() {
        return deck;
    }
    public void removeCard(Card card) {
        deck.remove(card);
    }
    public void addCard(Card card) {
        deck.add(card);
    }
    public Card getLastCard() {
        return deck.get(deck.size() - 1);
    }
    public void removeLastCard() {
        deck.remove(deck.size() - 1);
    }
}
