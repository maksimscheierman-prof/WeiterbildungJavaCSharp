package A18_DungeonCrawl.races;

import A18_DungeonCrawl.units.Unit;


public class Elf extends Race {
    private boolean dodgeReady = true;

    @Override
    public void useAbility(Unit self, Unit opponent) {
        if (canUseAbility() && dodgeReady) {
            System.out.println(self.getName() + " nutzt elfische Agilität – weicht der nächsten Attacke aus!");
            dodgeReady = true;
            markAbilityUsed();
        } else {
            System.out.println("Die Fähigkeit wurde bereits genutzt.");
        }
    }

    // Wird beim ersten Angriff ausgelöst
    public boolean isDodgeReady() {
        return dodgeReady;
    }

    // Wird nach einem Ausweichvorgang aufgerufen
    public void consumeDodge() {
        dodgeReady = false; // ❗ bleibt aus, bis der Kampf vorbei ist
    }

    public void resetDodge() {
        dodgeReady = true;
        resetAbility();
    }
}
