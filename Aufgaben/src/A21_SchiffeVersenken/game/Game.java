package A21_SchiffeVersenken.game;

import A21_SchiffeVersenken.player.*;
import A21_SchiffeVersenken.model.*;

public class Game {
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void start() {
        player1.placeShips();
        player2.placeShips();

        while (!checkVictory()) {
            System.out.println("\n-------------------------------------");
            Board.printBoardsSideBySide(player1.getBoard(), player2.getBoard());

            System.out.println("\n" + currentPlayer.getName() + " is taking a turn...");
            Player opponent = (currentPlayer == player1) ? player2 : player1;

            Coordinate target = currentPlayer.chooseTarget();
            String result = currentPlayer.shootAt(opponent, target);

            System.out.println("Shot at " + target + " => " + result);

            if (result.startsWith("MISS")) switchTurns();
        }

        Player winner = player1.getBoard().allShipsSunk() ? player2 : player1;
        System.out.println("\n🏁 Winner: " + winner.getName());
    }

    private void switchTurns() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean checkVictory() {
        return player1.getBoard().allShipsSunk() || player2.getBoard().allShipsSunk();
    }
}

