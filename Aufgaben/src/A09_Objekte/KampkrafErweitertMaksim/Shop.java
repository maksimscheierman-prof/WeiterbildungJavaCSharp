package A09_Objekte.KampkrafErweitertMaksim;

import java.util.List;
import java.util.Scanner;

import java.util.List;
import java.util.Random;

public class Shop {
    private Team shopTeam;  // internally stores shop units

    public Shop() {
        shopTeam = new Team("Shop");
        shopTeam.addUnits(UnitFactory.createUnits(15)); // initial stock
    }

    // Show all units in the shop
    public void showStock() {
        System.out.println("\n--- Shop Stock ---");
        shopTeam.showUnits();
        System.out.println("-----------------");
    }

    // Buy a unit by ID
    public void buyUnit(int unitId, Team buyer) {
        Unit toBuy = null;
        for (Unit u : shopTeam.getUnits()) {
            if (u.getId() == unitId) {
                toBuy = u;
                break;
            }
        }

        if (toBuy == null) {
            System.out.println("❌ Unit not found in shop!");
            return;
        }

        if (!buyer.spendGold(toBuy.getCost())) {
            System.out.println("❌ Not enough gold to buy " + toBuy.getName());
            return;
        }

        // Transfer unit
        buyer.addUnit(toBuy);
        shopTeam.removeUnit(toBuy);
        System.out.println("✅ " + buyer.getName() + " bought " + toBuy.getName());
    }

    // Accessor for shop units (needed for enemy AI)
    public List<Unit> getUnits() {
        return shopTeam.getUnits();
    }

    // Remove unit from shop (for internal use or AI buying)
    public void removeUnit(Unit unit) {
        shopTeam.removeUnit(unit);
    }
}



