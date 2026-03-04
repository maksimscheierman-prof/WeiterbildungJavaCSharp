package A18_DungeonCrawl.races;

import A18_DungeonCrawl.units.Unit;

import java.util.List;

public abstract class Race {

    private boolean abilityUsed = false;

    /**
     * Jede Rasse implementiert ihre eigene Spezialfähigkeit.
     */
    public abstract void useAbility(Unit self, Unit opponent);

    /**
     * Prüft, ob die Fähigkeit in diesem Kampf schon genutzt wurde.
     */
    public boolean canUseAbility() {
        return !abilityUsed;
    }

    /**
     * Setzt den Zustand, dass die Fähigkeit benutzt wurde.
     */
    protected void markAbilityUsed() {
        this.abilityUsed = true;
    }

    /**
     * Setzt den Zustand am Anfang eines neuen Kampfes zurück.
     */
    public void resetAbility() {
        this.abilityUsed = false;
    }
}
