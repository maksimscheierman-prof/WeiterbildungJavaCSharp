package A18_DungeonCrawl.items.effects;

import A18_DungeonCrawl.units.Unit;

import java.util.HashMap;
import java.util.Map;

public class PassiveEffect implements Effect{

    private Map<String,Integer> attributeBonus;

    public PassiveEffect(String attribute, Integer bonus) {
        this.attributeBonus = new HashMap<>();
        this.attributeBonus.put(attribute, bonus);
    }

    //TODO Methoden remove apply fertig stellen
    @Override
    public void apply(Unit unit) {

    }

    @Override
    public void remove(Unit unit) {

    }
}
