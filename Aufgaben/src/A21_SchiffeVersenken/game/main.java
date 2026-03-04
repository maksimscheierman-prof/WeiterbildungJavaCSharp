package A21_SchiffeVersenken.game;

import A21_SchiffeVersenken.model.Board;
import A21_SchiffeVersenken.player.*;

public class main {
        public static void main(String[] args) {
            System.out.println("=== Willkommen zu Schiffe versenken! ===");

            System.out.println("\nSymbole:");
            System.out.println("O = dein Schiff, X = Treffer, * = verfehlt, ~ = Wasser\n");

            // Spielbretter erzeugen (Dependency Injection)
            Board board1 = new Board(10);
            Board board2 = new Board(10);

            // Spieler anlegen – ein Mensch, ein Computer
            Player human = new HumanPlayer("Admiral", board1);
            Player ai = new AIPlayer("Computer", board2);

            // Spiel erstellen
            Game game = new Game(human, ai);

            // Spiel starten
            game.start();

            System.out.println("\n=== Spiel beendet ===");
        }


}
