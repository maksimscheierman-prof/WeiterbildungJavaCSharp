package A09_Objekte.KampkrafErweitertMaksim;

public class Infantry extends Unit{

    // Konstruktor ohne UnitType
    public Infantry(String name, Integer power, Integer cost, Integer lifepoints) {
        super(name, power, cost, lifepoints);
    }

    @Override
    public int calculateDamage(Unit opponent) {
        int finalDamage = super.getPower();
        // Infanterie hat BonusAngriff gegen Artillerie
        // Prüfung erfolgt jetzt mit instanceof
        if (opponent instanceof Artillery) {
            System.out.println(">> Bonus: Infanterie schlägt Artillerie!");
            finalDamage *= 1.5; // +50% Schaden
        }
        return finalDamage;
    }
}
