package A18_DungeonCrawl.races;

import A18_DungeonCrawl.units.Unit;

public class Human extends Race{
    private boolean shieldActive = false;

    @Override
    public void useAbility(Unit self, Unit opponent) {
        if (canUseAbility() && !shieldActive) {
            shieldActive = true;
            markAbilityUsed();
            System.out.println(self.getName() + " erschafft ein Energieschild!");
        } else {
            System.out.println("Energieschild wurde bereits genutzt.");
        }
    }

    public boolean isShieldActive() {
        return shieldActive;
    }

    public void onAttack(Unit self, Unit attacker, double dmg) {
        if (shieldActive) {
            System.out.println(self.getName() + " blockt und reflektiert den Angriff!");
            attacker.takeDamage(dmg); // reflektiert den Schaden
            shieldActive = false; // Schild verbraucht
        } else {
            self.takeDamage(dmg);
        }
    }

    public void resetShield() {
        shieldActive = false;
        resetAbility();
    }
}
