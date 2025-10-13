package A18_DungeonCrawl.races;

import A18_DungeonCrawl.items.effects.Effect;

import java.util.List;

public abstract class Race {
    protected List<Effect> effects;

    public Race() {
        initEffects();
    }

    protected abstract void initEffects();

    public void useAbility(){}

    public List<Effect> getEffects() {
        return effects;
    }
}
