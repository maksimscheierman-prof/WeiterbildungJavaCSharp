package A09_Objekte.KampkrafErweitertMaksim;

public class Cavalry extends Unit{
    public Cavalry(String name, Integer cost, Integer lifepoints, Dice power) {
        super(name, cost, lifepoints, power);
    }

    @Override
    public int calculateDamage(Unit opponent) {
        int finalDamage = super.getRoll();
        // Kavallerie hat BonusAngriff gegen Infanterie
        if (opponent instanceof Infantry) {
            System.out.println(">> Bonus: Kavallerie schlägt Infanterie!");
            finalDamage *= 1.5; // +50% Schaden
        }
        return finalDamage;
    }
}
