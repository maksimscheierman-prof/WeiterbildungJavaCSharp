package A14_Trumpf.A31_CardGameExample;

public class Player extends Participant{


    // Weil wir Player sind brauchen wir die Methode zum Anzeigen unserer Handkarten.
    public void showHandCards(){
        System.out.println("Deine Handkarten: ");
        for(Card currentCard : getHandCards()){
            System.out.print("Name: " + currentCard.getName());
            System.out.print(" | Gewicht: " + currentCard.getSize());
            System.out.print(" | Speed: " + currentCard.getSpeed());
            System.out.println(" | Size: " + currentCard.getSize());
        }
    }


}
