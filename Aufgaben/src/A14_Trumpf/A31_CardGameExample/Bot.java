package A14_Trumpf.A31_CardGameExample;

public class Bot extends Participant{



    // Weil wir die Karten des Bots eigentlich nicht sehen können wird diese Klasse
    // gar nicht benötigt. Zu Debug zwecken ist sie erstmal drinn.

    public void ONLYDEBUG_showHandCards(){
        System.out.println("Bot Handkarten: ");
        for(Card currentCard : getHandCards()){
            System.out.print("Name: " + currentCard.getName());
            System.out.print(" | Gewicht: " + currentCard.getSize());
            System.out.print(" | Speed: " + currentCard.getSpeed());
            System.out.println(" | Size: " + currentCard.getSize());
        }
    }

    // Hier Logik zum automatisierten Auswählen einer Karte einfügen
}
