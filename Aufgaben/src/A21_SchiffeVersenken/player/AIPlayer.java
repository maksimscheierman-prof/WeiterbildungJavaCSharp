package A21_SchiffeVersenken.player;

import A21_SchiffeVersenken.model.*;
import java.util.Random;

public class AIPlayer extends Player {
    private final Random random = new Random();

    public AIPlayer(String name, Board board) {
        super(name, board);
    }

    @Override
    public void placeShips() {
        Random random = new Random();
        Ship[] shipsToPlace = {
                new Ship("Zerstörer", 2),
                new Ship("Kreuzer", 3),
                new Ship("Schlachtschiff", 4)
        };

        for (Ship ship : shipsToPlace) {
            boolean placed = false;
            while (!placed) {
                int x = random.nextInt(10);
                int y = random.nextInt(10);
                Direction dir = random.nextBoolean() ? Direction.HORIZONTAL : Direction.VERTICAL;
                placed = board.placeShip(ship, new Coordinate(x, y), dir);
            }
        }
        System.out.println(name + " hat seine Flotte platziert.");
    }


    @Override
    public Coordinate chooseTarget() {
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        return new Coordinate(x, y);
    }
}

