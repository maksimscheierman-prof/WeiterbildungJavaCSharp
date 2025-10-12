package A18_DungeonCrawl.world;

import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.units.Monster;
import A18_DungeonCrawl.game.Quest;

import java.util.List;

public class Room {

    private String door;
    private List<Monster> monsters;
    private List<Item> items;
    private Quest quest;

    public Room(String door, List<Monster> monsters, List<Item> items, Quest quest) {
        this.door = door;
        this.monsters = monsters;
        this.items = items;
        this.quest = quest;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    //TODO Methodenrumpf ausstehend enter/leave

    public void enter(){

    }

    public void leave(){

    }
}
