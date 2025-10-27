package A21_SchiffeVersenken.model;

import java.util.*;

public class Ship {
    private final String name;
    private final int size;
    private final List<Coordinate> coordinates = new ArrayList<>();
    private final Set<Coordinate> hitCoords = new HashSet<>();

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void place(Coordinate start, Direction direction) {
        coordinates.clear();
        int dx = (direction == Direction.HORIZONTAL) ? 1 : 0;
        int dy = (direction == Direction.VERTICAL) ? 1 : 0;
        for (int i = 0; i < size; i++) {
            coordinates.add(new Coordinate(start.getX() + i * dx, start.getY() + i * dy));
        }
        hitCoords.clear();
    }

    public boolean occupies(Coordinate c) {
        return coordinates.contains(c);
    }

    /** registriert einen Treffer genau an dieser Koordinate (falls das Schiff dort liegt) */
    public boolean registerHitAt(Coordinate c) {
        if (!occupies(c)) return false;
        // falls schon getroffen: false zurückgeben
        return hitCoords.add(c);
    }

    public boolean isHitAt(Coordinate c) {
        return hitCoords.contains(c);
    }

    public boolean isSunk() {
        return hitCoords.size() >= size;
    }

    public List<Coordinate> getCoordinates() {
        return Collections.unmodifiableList(coordinates);
    }

    public Set<Coordinate> getHitCoords() {
        return Collections.unmodifiableSet(hitCoords);
    }

    public String getName() { return name; }
    public int getSize() { return size; }
}


