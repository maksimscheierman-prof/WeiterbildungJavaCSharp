package A21_SchiffeVersenken.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int size;
    private final List<Ship> ships = new ArrayList<>();
    private final List<Coordinate> shots = new ArrayList<>();

    public Board(int size) {
        this.size = size;
    }
    public int getSize() { return size; }

    public boolean placeShip(Ship ship, Coordinate start, Direction direction) {
        if (!isValidPlacement(ship, start, direction)) return false;
        ship.place(start, direction);
        ships.add(ship);
        return true;
    }

    public boolean isValidPlacement(Ship ship, Coordinate start, Direction direction) {
        int dx = (direction == Direction.HORIZONTAL) ? 1 : 0;
        int dy = (direction == Direction.VERTICAL) ? 1 : 0;

        for (int i = 0; i < ship.getSize(); i++) {
            int x = start.getX() + i * dx;
            int y = start.getY() + i * dy;
            Coordinate c = new Coordinate(x, y);

            if (x < 0 || y < 0 || x >= size || y >= size)
                return false;

            for (Ship s : ships)
                if (s.getCoordinates().contains(c))
                    return false;
        }
        return true;
    }

    // Board.java (relevanter Auszug)
    public String receiveShot(Coordinate coord) {
        if (shots.contains(coord)) return "Already Shot";
        shots.add(coord);

        for (Ship s : ships) {
            if (s.occupies(coord)) {
                boolean firstTime = s.registerHitAt(coord); // markiere die genaue Treffer-Koordinate
                // firstTime könnte false sein, wenn doppelt auf dasselbe Feld geschossen wurde
                return s.isSunk() ? "SUNK " + s.getName() : "HIT";
            }
        }
        return "MISS";
    }


    public boolean allShipsSunk() {
        return ships.stream().allMatch(Ship::isSunk);
    }

    public void printBoard(boolean showShips) {
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (int y = 0; y < size; y++) {
            System.out.printf("%2d ", y);
            for (int x = 0; x < size; x++) {
                Coordinate c = new Coordinate(x, y);
                String symbol = "~"; // Wasser

                // Schiffe anzeigen (nur wenn showShips = true)
                for (Ship s : ships) {
                    if (s.getCoordinates().contains(c)) {
                        symbol = showShips ? "O" : "~";
                        break;
                    }
                }

                // Treffer oder Fehlschuss markieren
                if (shots.contains(c)) {
                    boolean hit = ships.stream().anyMatch(s -> s.getCoordinates().contains(c));
                    symbol = hit ? "X" : "*";
                }

                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void printBoardsSideBySide(Board playerBoard, Board enemyBoard) {
        int size = playerBoard.getSize();
        System.out.println("\n   Dein Board               Gegnerisches Board");
        System.out.println("   0 1 2 3 4 5 6 7 8 9        0 1 2 3 4 5 6 7 8 9");

        for (int y = 0; y < size; y++) {
            // linkes Board (Spieler)
            System.out.printf("%2d ", y);
            for (int x = 0; x < size; x++) {
                Coordinate c = new Coordinate(x, y);
                String symbol = "~";

                boolean hasShip = playerBoard.ships.stream()
                        .anyMatch(s -> s.getCoordinates().contains(c));
                boolean wasShot = playerBoard.shots.contains(c);
                boolean wasHit = playerBoard.ships.stream()
                        .anyMatch(s -> s.isHitAt(c));

                if (wasHit) symbol = "X";
                else if (wasShot) symbol = "*";
                else if (hasShip) symbol = "O";

                System.out.print(symbol + " ");
            }

            // Abstand
            System.out.print("     ");

            // rechtes Board (Gegner – Schiffe nicht zeigen)
            System.out.printf("%2d ", y);
            for (int x = 0; x < size; x++) {
                Coordinate c = new Coordinate(x, y);
                String symbol = "~";

                boolean wasShot = enemyBoard.shots.contains(c);
                boolean wasHit = enemyBoard.ships.stream()
                        .anyMatch(s -> s.isHitAt(c));

                if (wasHit) symbol = "X";
                else if (wasShot) symbol = "*";

                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }




}

