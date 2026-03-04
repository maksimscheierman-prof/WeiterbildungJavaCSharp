package A18_DungeonCrawl.items.effects;

import A18_DungeonCrawl.units.Unit;

public interface Effect {
    void apply(Unit unit);
    void remove(Unit unit);

}
