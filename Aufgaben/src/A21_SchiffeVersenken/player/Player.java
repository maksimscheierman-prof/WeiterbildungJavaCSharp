package A21_SchiffeVersenken.player;

import A21_SchiffeVersenken.model.*;

public abstract class Player {
    protected String name;
    protected Board board;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public String getName() { return name; }

    public Board getBoard() { return board; }

    public abstract void placeShips();

    public String shootAt(Player enemy, Coordinate coord) {
        return enemy.getBoard().receiveShot(coord);
    }

    public abstract Coordinate chooseTarget();
}

