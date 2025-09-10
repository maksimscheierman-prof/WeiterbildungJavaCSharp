package A09_Objekte.KampkrafErweitertMaksim;


import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Simulation {

    private final Scanner scan = new Scanner(System.in);

    private final Team user = new Team("User");
    private final Team enemy = new Team("Enemy");
    private final Shop shop = new Shop();

    private final int startingGold = 50;

    public void simulate() {
        user.addGold(startingGold);
        enemy.addGold(startingGold);

        System.out.println("Matrix initialisiert....");

        while (true) {
            System.out.println("\nYour Team: " + user);
            System.out.println("1. Show Shop");
            System.out.println("2. Buy Unit");
            System.out.println("3. Show My Units");
            System.out.println("4. Show Enemy Team");
            System.out.println("5. Fight!");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> shop.showStock();

                case 2 -> {
                    System.out.print("Enter Unit ID to buy: ");
                    int id = scan.nextInt();

                    shop.buyUnit(id, user);  // player buys unit
                    enemyAutoBuy();           // enemy buys one unit automatically
                }

                case 3 -> {
                    System.out.println("\n--- Your Army ---");
                    user.showUnits();
                }

                case 4 -> {
                    System.out.println("\n--- Enemy Army ---");
                    enemy.showUnits();
                }

                case 5 -> fight();

                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /**
     * Enemy automatically buys units to roughly match player's spent gold
     */
    private void enemyAutoBuy() {
        List<Unit> shopUnits = shop.getUnits();
        if (shopUnits.isEmpty()) return;

        // Filter units that enemy can afford
        List<Unit> affordable = new ArrayList<>();
        for (Unit u : shopUnits) {
            if (enemy.getGold() >= u.getCost()) {
                affordable.add(u);
            }
        }

        if (affordable.isEmpty()) return;

        // Pick one random unit from affordable units
        Unit unitToBuy = affordable.get(new Random().nextInt(affordable.size()));

        enemy.spendGold(unitToBuy.getCost());
        enemy.addUnit(unitToBuy);
        shop.removeUnit(unitToBuy);

        System.out.println("🤖 Enemy bought " + unitToBuy.getName());
    }


    /**
     * Round-based fight: each unit attacks once per round
     */
    private void fight() {
        int round = 1;

        while (!user.getUnits().isEmpty() && !enemy.getUnits().isEmpty()) {
            System.out.println("\n===== ROUND " + round + " =====");

            // USER units attack
            for (Unit unit : new ArrayList<>(user.getUnits())) {
                if (enemy.getUnits().isEmpty()) break;
                Unit target = enemy.getUnits().get(new Random().nextInt(enemy.getUnits().size()));
                attack(unit, target);
                if (target.getLifepoints() <= 0) {
                    System.out.println(target.getName() + " has been defeated!");
                    enemy.removeUnit(target);
                }
            }

            // ENEMY units attack
            for (Unit unit : new ArrayList<>(enemy.getUnits())) {
                if (user.getUnits().isEmpty()) break;
                Unit target = user.getUnits().get(new Random().nextInt(user.getUnits().size()));
                attack(unit, target);
                if (target.getLifepoints() <= 0) {
                    System.out.println(target.getName() + " has been defeated!");
                    user.removeUnit(target);
                }
            }

            // Show stats
            showBattleStatus();

            // Ask player to continue
            System.out.print("Continue to next round? (y/n): ");
            String input = scan.next();
            if (input.equalsIgnoreCase("n")) {
                System.out.println("You surrendered!");
                break;
            }

            round++;
        }

        // Determine winner and show message
        if (user.getUnits().isEmpty()) {
            System.out.println("\n💀 Wow, you lost. Better luck next time!");
        } else if (enemy.getUnits().isEmpty()) {
            System.out.println("\n🏆 Congratulations! You won! Great job!");
        }

        // Ask for rematch
        rematchPrompt();
    }


    /**
     * Show units with current HP and power
     */
    private void showBattleStatus() {
        System.out.println("\n--- YOUR ARMY ---");
        for (Unit u : user.getUnits()) {
            System.out.printf("%s | HP: %d | Power: %s%n", u.getName(), u.getLifepoints(), u.getPower());
        }

        System.out.println("\n--- ENEMY ARMY ---");
        for (Unit u : enemy.getUnits()) {
            System.out.printf("%s | HP: %d | Power: %s%n", u.getName(), u.getLifepoints(), u.getPower());
        }
    }

    /**
     * Execute an attack from attacker to defender using type bonuses
     */
    private void attack(Unit attacker, Unit defender) {
        int damage = attacker.calculateDamage(defender);
        int newLife = defender.getLifepoints() - damage;
        defender.setLifepoints(Math.max(newLife, 0));

        System.out.printf("%s attacks %s for %d damage! (%d HP left)%n",
                attacker.getName(), defender.getName(), damage, defender.getLifepoints());
    }
    private void rematchPrompt() {
        System.out.println("\nDo you want a rematch?");
        System.out.println("1. Rebattle with the same team");
        System.out.println("2. Buy a new team from the shop");
        System.out.println("3. Exit");

        System.out.print("Choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                // Reset lifepoints of all units to max
                user.resetUnits();
                enemy.resetUnits();
                fight(); // start fight again
            }
            case 2 -> {
                // Clear current teams
                user.clearUnits();
                enemy.clearUnits();

                // Let player and enemy buy new units
                System.out.println("\nBuying new units...");
                shop.showStock();

                System.out.print("How many units do you want to buy? ");
                int num = scan.nextInt();
                for (int i = 0; i < num; i++) {
                    System.out.print("Enter Unit ID to buy: ");
                    int id = scan.nextInt();
                    shop.buyUnit(id, user);
                }

                // Enemy buys randomly
                enemyAutoBuy();

                fight(); // start fight again
            }
            case 3 -> {
                System.out.println("Exiting game. Bye!");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid choice!");
                rematchPrompt();
            }
        }
    }

}


