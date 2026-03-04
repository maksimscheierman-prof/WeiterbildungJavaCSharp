package A18_DungeonCrawl.items.effects;

import A18_DungeonCrawl.enums.EffectType;
import A18_DungeonCrawl.units.Unit;

public class PassiveEffect implements Effect {

    private final EffectType type;
    private final double value;

    public PassiveEffect(EffectType type, double value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public void apply(Unit unit) {
        switch (type) {
            case HEAL -> unit.restoreHealth(value);
            case DAMAGE_BONUS -> unit.increaseDmgBonus(value);
        }
    }

    @Override
    public void remove(Unit unit) {
        if (type == EffectType.DAMAGE_BONUS) {
            unit.increaseDmgBonus(-value);
        }
        // Heilung wird nicht rückgängig gemacht
    }

    public EffectType getType() { return type; }
    public double getValue() { return value; }
}

