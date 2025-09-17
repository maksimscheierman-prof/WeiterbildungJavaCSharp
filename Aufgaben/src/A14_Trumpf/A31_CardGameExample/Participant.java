package A14_Trumpf.A31_CardGameExample;

import java.util.ArrayList;

public class Participant {
    //private Card card;
    private ArrayList<Card> handCards = new ArrayList<>();


    public void addCardToHand(Card card) {
        handCards.add(card);
    }
    public void removeCardFromHand(Card card) {
        handCards.remove(card);
    }
    public ArrayList<Card> getHandCards() {
        return handCards;
    }

}
