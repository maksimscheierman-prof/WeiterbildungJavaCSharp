package A18_DungeonCrawl.world;

import java.util.List;

public class Chapter {
    private String narrative;

    private int number;

    private List<Room> rooms;

    public Chapter(String narrative, int number, List<Room> rooms) {
        this.narrative = narrative;
        this.number = number;
        this.rooms = rooms;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
