package A09_Objekte.KampkrafErweitertMaksim;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Unit> units = new ArrayList<>();
    private int gold = 50; // starting gold (example)

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void addUnits(List<Unit> newUnits) {
        units.addAll(newUnits);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void showUnits() {
        for (Unit unit : units) {
            System.out.println(unit);
        }
    }
    public void clearUnits() {
        units.clear();
    }
    public void resetUnits() {
        for (Unit unit : units) {
            unit.setLifepoints(unit.getMaxLifepoints()); // requires maxLifepoints in Unit
        }
    }

    public int getGold() { return gold; }
    public void addGold(int amount) { gold += amount; }
    public boolean spendGold(int amount) {
        if (gold >= amount) {
            gold -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " (Gold: " + gold + ", Units: " + units.size() + ")";
    }
}
