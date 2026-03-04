package A09_Objekte.KampkrafErweitertMaksim;

public class Artillery extends Unit{
    private static final String TYPE = "Artillery";
    public Artillery(String name,Integer cost, Integer lifepoints, Dice power) {
        super(name, cost, lifepoints, power);
    }

    @Override
    public int calculateDamage(Unit opponent) {
        int finalDamage = super.getRoll();
        // Artillerie hat BonusAngriff gegen Kavallerie
        if (opponent instanceof Cavalry) {
            System.out.println(">> Bonus: Artillerie schlägt Kavallerie!");
            finalDamage *= 1.5; // +50% Schaden
        }
        return finalDamage;
    }
    @Override
    public String getType() {
        return TYPE;
    }
}
