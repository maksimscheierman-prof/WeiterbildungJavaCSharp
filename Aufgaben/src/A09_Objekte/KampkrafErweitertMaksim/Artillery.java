package A09_Objekte.KampkrafErweitertMaksim;

public class Artillery extends Unit{
    public Artillery(String name, Integer power, Integer cost, Integer lifepoints) {
        super(name, power, cost, lifepoints);
    }

    @Override
    public int calculateDamage(Unit opponent) {
        int finalDamage = super.getPower();
        // Artillerie hat BonusAngriff gegen Kavallerie
        if (opponent instanceof Cavalry) {
            System.out.println(">> Bonus: Artillerie schlägt Kavallerie!");
            finalDamage *= 1.5; // +50% Schaden
        }
        return finalDamage;
    }
}
