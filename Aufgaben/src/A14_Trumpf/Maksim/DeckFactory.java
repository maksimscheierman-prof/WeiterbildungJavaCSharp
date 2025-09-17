package A14_Trumpf.Maksim;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class DeckFactory {

    // ---------- Superhelden ----------
    public static Deck createSuperheroDeck() {
        Deck deck = new Deck();

        // Quartett 1: Avengers
        deck.addCard(makeHero("Iron Man", 85, 95, 90));
        deck.addCard(makeHero("Captain America", 90, 80, 88));
        deck.addCard(makeHero("Hulk", 100, 70, 85));
        deck.addCard(makeHero("Thor", 95, 75, 87));

        // Quartett 2: DC Helden
        deck.addCard(makeHero("Superman", 100, 80, 95));
        deck.addCard(makeHero("Batman", 75, 100, 92));
        deck.addCard(makeHero("Wonder Woman", 90, 85, 89));
        deck.addCard(makeHero("Flash", 88, 70, 86));

        // Quartett 3: X-Men
        deck.addCard(makeHero("Wolverine", 92, 70, 84));
        deck.addCard(makeHero("Cyclops", 80, 75, 78));
        deck.addCard(makeHero("Storm", 82, 85, 81));
        deck.addCard(makeHero("Professor X", 60, 100, 83));

        // Quartett 4: Antihelden
        deck.addCard(makeHero("Deadpool", 85, 70, 88));
        deck.addCard(makeHero("Venom", 90, 60, 80));
        deck.addCard(makeHero("Spawn", 87, 65, 76));
        deck.addCard(makeHero("Hellboy", 88, 68, 79));

        return deck;
    }

    private static Card makeHero(String name, int staerke, int intelligenz, int beliebtheit) {
        Map<String, Integer> attrs = new HashMap<>();
        attrs.put("Stärke", staerke);
        attrs.put("Intelligenz", intelligenz);
        attrs.put("Beliebtheit", beliebtheit);
        return new Card(name, attrs);
    }

    // ---------- Animes ----------
    public static Deck createAnimeDeck() {
        Deck deck = new Deck();

        // Quartett 1: Dragon Ball
        deck.addCard(makeAnime("Son Goku", 100, 95, 98));
        deck.addCard(makeAnime("Vegeta", 95, 90, 92));
        deck.addCard(makeAnime("Piccolo", 85, 88, 80));
        deck.addCard(makeAnime("Trunks", 87, 85, 84));

        // Quartett 2: Naruto
        deck.addCard(makeAnime("Naruto Uzumaki", 85, 90, 97));
        deck.addCard(makeAnime("Sasuke Uchiha", 90, 88, 93));
        deck.addCard(makeAnime("Sakura Haruno", 70, 78, 75));
        deck.addCard(makeAnime("Kakashi Hatake", 88, 92, 89));

        // Quartett 3: One Piece
        deck.addCard(makeAnime("Monkey D. Luffy", 88, 85, 96));
        deck.addCard(makeAnime("Zoro", 90, 82, 91));
        deck.addCard(makeAnime("Nami", 65, 80, 78));
        deck.addCard(makeAnime("Sanji", 82, 83, 85));

        // Quartett 4: My Hero Academia
        deck.addCard(makeAnime("Deku", 80, 88, 87));
        deck.addCard(makeAnime("Bakugo", 85, 75, 83));
        deck.addCard(makeAnime("Todoroki", 82, 85, 84));
        deck.addCard(makeAnime("All Might", 95, 90, 90));

        return deck;
    }

    private static Card makeAnime(String name, int kraft, int ausdauer, int beliebtheit) {
        Map<String, Integer> attrs = new HashMap<>();
        attrs.put("Kraft", kraft);
        attrs.put("Ausdauer", ausdauer);
        attrs.put("Beliebtheit", beliebtheit);
        return new Card(name, attrs);
    }

    // ---------- Galaxien ----------
    public static Deck createGalaxyDeck() {
        Deck deck = new Deck();

        // Quartett 1: Lokale Gruppe
        deck.addCard(makeGalaxy("Milchstraße", 400, 100000, 13));
        deck.addCard(makeGalaxy("Andromeda", 1000, 220000, 10));
        deck.addCard(makeGalaxy("Dreiecksnebel", 40, 60000, 9));
        deck.addCard(makeGalaxy("Große Magellansche Wolke", 30, 14000, 11));

        // Quartett 2: Spiralgalaxien
        deck.addCard(makeGalaxy("Whirlpool-Galaxie", 300, 76000, 11));
        deck.addCard(makeGalaxy("Pinwheel-Galaxie", 1000, 170000, 12));
        deck.addCard(makeGalaxy("Feuerrad-Galaxie", 250, 100000, 10));
        deck.addCard(makeGalaxy("Messier 81", 250, 90000, 12));

        // Quartett 3: Elliptische Galaxien
        deck.addCard(makeGalaxy("M87", 1200, 240000, 13));
        deck.addCard(makeGalaxy("M49", 600, 160000, 12));
        deck.addCard(makeGalaxy("M60", 800, 180000, 12));
        deck.addCard(makeGalaxy("M32", 30, 8000, 10));

        // Quartett 4: Besondere Galaxien
        deck.addCard(makeGalaxy("Sombrero-Galaxie", 800, 50000, 12));
        deck.addCard(makeGalaxy("Zigarren-Galaxie", 300, 37000, 11));
        deck.addCard(makeGalaxy("Antennae-Galaxien", 400, 500000, 9));
        deck.addCard(makeGalaxy("Cartwheel-Galaxie", 500, 150000, 8));

        return deck;
    }

    private static Card makeGalaxy(String name, int sterne, int durchmesser, int alter) {
        Map<String, Integer> attrs = new HashMap<>();
        attrs.put("Sterne (Mrd.)", sterne);
        attrs.put("Durchmesser (Lj)", durchmesser);
        attrs.put("Alter (Mrd. Jahre)", alter);
        return new Card(name, attrs);
    }
}
