package A18_DungeonCrawl;

import java.util.List;

public class Item {
    private String name;
    private List<Effect> effets;

    public Item(String name, List<Effect> effets) {
        this.name = name;
        this.effets = effets;
    }

    public String getName() {
        return name;
    }

    public List<Effect> getEffets() {
        return effets;
    }

    //TODO Methoden activate und applyEffect fertig stellen
    public void activate(){

    }

    public void applyEffect(){

    }
}
