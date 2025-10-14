package A18_DungeonCrawl.races;

import A18_DungeonCrawl.units.Unit;


public class Elf extends Race{
    private boolean dodgeReady = true;

    @Override
    public void useAbility(Unit self, Unit opponent) {
        if (canUseAbility() && dodgeReady) {
            System.out.println(self.getName() + " nutzt elfische Agilität – weicht der nächsten Attacke aus!");
            dodgeReady = false;
            markAbilityUsed();

            // In deiner Kampf-Logik kannst du später prüfen:
            // if (defender.getRace() instanceof Elf && ((Elf) defender).isDodgeReady()) ...
        } else {
            System.out.println("Die Fähigkeit wurde bereits genutzt.");
        }
    }

    public boolean isDodgeReady() {
        return dodgeReady;
    }

    public void resetDodge() {
        dodgeReady = true;
        resetAbility();
    }

}
