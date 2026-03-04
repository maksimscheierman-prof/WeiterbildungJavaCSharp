package A18_DungeonCrawl.items;

import A18_DungeonCrawl.items.effects.Effect;
import A18_DungeonCrawl.units.Unit;

import java.util.List;

public class Item {
    private String name;
    private List<Effect> effects;

    public Item(String name, List<Effect> effects) {
        this.name = name;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    /**
     * Wird aufgerufen, wenn das Item ausgerüstet oder aufgehoben wird.
     * Wendet alle passiven Effekte an (z. B. Heilung, DmgBonus usw.).
     */
    public void applyEffect(Unit unit) {
        for (Effect effect : effects) {
            effect.apply(unit);
        }
        System.out.println(name + " Effekte wurden angewendet.");
    }

    /**
     * Wird aufgerufen, wenn das Item aktiv benutzt wird (z. B. Heiltrank, temporäre Buffs).
     * Nach der Aktivierung kann das Item z. B. verbraucht werden.
     */
    public void activate(Unit unit) {
        for (Effect effect : effects) {
            effect.apply(unit);
        }
        System.out.println(name + " wurde aktiviert!");
        // Optional: Hier Item aus Inventar entfernen, falls es „verbraucht“ wird.
    }
}
