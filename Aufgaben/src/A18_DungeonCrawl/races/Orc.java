package A18_DungeonCrawl.races;

import A18_DungeonCrawl.enums.AttributeType;
import A18_DungeonCrawl.items.effects.Effect;
import A18_DungeonCrawl.items.effects.PassiveEffect;

import java.util.ArrayList;
import java.util.List;

public class Orc extends Race{
    private List<Effect> effects = new ArrayList<>();



    public List<Effect> getEffects() {
        return effects;
    }

    @Override
    protected void initEffects() {
        effects.add(new PassiveEffect(AttributeType.STRENGTH.getDisplayName(), 2));
    }
}
