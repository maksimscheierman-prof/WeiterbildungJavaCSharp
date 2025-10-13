package A18_DungeonCrawl.world;

import java.util.List;

public class Chapter {
    private String narrative;
    private String decision;
    private Boolean isDecision = false;
    private int number;
    private List<Room> rooms;



    //Constructors
    public Chapter(int number, String narrative, String decision, List<Room> rooms) {
        this.narrative = narrative;
        this.decision = decision;
        this.isDecision = true;
        this.number = number;
        this.rooms = rooms;
    }

    public Chapter(int number, String narrative, List<Room> rooms) {
        this.narrative = narrative;
        this.number = number;
        this.rooms = rooms;
    }

    //Getter
    public String getNarrative() {
        return narrative;
    }

    public String getDecision() {
        return decision;
    }

    public int getNumber() {
        return number;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
