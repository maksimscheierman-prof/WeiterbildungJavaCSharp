package A21_SchiffeVersenken.player;

import A21_SchiffeVersenken.model.*;
import java.util.Scanner;

public class HumanPlayer extends Player {
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name, Board board) {
        super(name, board);
    }

    @Override
    public void placeShips() {
        System.out.println("\n" + name + ", platziere deine Schiffe!");
        board.printBoard(true);

        Ship[] shipsToPlace = {
                new Ship("Zerstörer", 2),
                new Ship("Kreuzer", 3),
                new Ship("Schlachtschiff", 4)
        };

        for (Ship ship : shipsToPlace) {
            boolean placed = false;
            while (!placed) {
                System.out.println("Setze " + ship.getName() + " (Größe: " + ship.getSize() + ")");
                System.out.print("Startkoordinate (x y): ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                System.out.print("Ausrichtung (h = horizontal, v = vertikal): ");
                char dir = scanner.next().toLowerCase().charAt(0);
                Direction direction = (dir == 'h') ? Direction.HORIZONTAL : Direction.VERTICAL;

                placed = board.placeShip(ship, new Coordinate(x, y), direction);
                if (!placed) {
                    System.out.println("❌ Ungültige Platzierung, versuch es nochmal!");
                } else {
                    System.out.println("✅ Schiff gesetzt!");
                    board.printBoard(true);
                }
            }
        }
    }


    @Override
    public Coordinate chooseTarget() {
        System.out.print(name + ", enter coordinates (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Coordinate(x, y);
    }
}

