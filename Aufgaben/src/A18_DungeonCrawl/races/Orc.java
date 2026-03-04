package A18_DungeonCrawl.races;

import A18_DungeonCrawl.units.Unit;

public class Orc extends Race{
    private int healRoundsLeft = 0;

    @Override
    public void useAbility(Unit self, Unit opponent) {
        if (canUseAbility()) {
            healRoundsLeft = 2;
            markAbilityUsed();
            System.out.println(self.getName() + " aktiviert Blutrausch! Wird in den nächsten zwei Runden geheilt.");
        } else {
            System.out.println("Blutrausch kann nur einmal pro Kampf eingesetzt werden!");
        }
    }

    public void onTurn(Unit self) {
        if (healRoundsLeft > 0) {
            double heal = self.getLifepoints() / 2.0;
            self.restoreHealth(heal);
            healRoundsLeft--;
        }
    }

    public void resetHealing() {
        healRoundsLeft = 0;
        resetAbility();
    }
}
