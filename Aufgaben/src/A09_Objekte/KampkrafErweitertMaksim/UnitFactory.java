package A09_Objekte.KampkrafErweitertMaksim;

import java.util.*;

public class UnitFactory {
    private static final Random random = new Random();
    private static final List<Unit> templates = new ArrayList<>();
    private static final Map<String, Integer> nameCounters = new HashMap<>();

    // Call this once to generate 100 unique templates
    public static void generateTemplates() {
        templates.clear();  // clear previous templates if any

        String[] adjectives = {"Fierce", "Dark", "Swift", "Brutal", "Mighty", "Ancient", "Cunning", "Savage"};
        String[] creatures = {"Goblin", "Orc", "Knight", "Mage", "Skeleton", "Assassin", "Dragon", "Troll", "Zombie"};
        String[] types = {"inf", "cav", "art"};

        for (int i = 1; i <= 100; i++) {

            // Random name from adjective + creature + number
            String name = adjectives[random.nextInt(adjectives.length)] +
                    " " +
                    creatures[random.nextInt(creatures.length)] +
                    " #" + i;

            // Random cost 5–30
            int cost = 5 + random.nextInt(26);

            // Random lifepoints 5–30
            int lifepoints = 5 + random.nextInt(26);

            // Random dice formula: 1–3 dice, 4–12 sides, optional +0–5 modifier
            int numDice = 1 + random.nextInt(3);      // 1–3 dice
            int sides = 4 + random.nextInt(9);        // 4–12 sides
            int modifier = random.nextInt(6);         // 0–5

            String formula = numDice + "d" + sides;
            if (modifier > 0) formula += "+" + modifier;

            //Random types
            String type = types[random.nextInt(types.length)];
            switch (type){
                case "inf":
                    templates.add(new Infantry(name, cost, lifepoints, new Dice(formula)));
                    break;
                case "art":
                    templates.add(new Artillery(name, cost, lifepoints, new Dice(formula)));
                    break;
                case "cav":
                    templates.add(new Cavalry(name, cost, lifepoints, new Dice(formula)));
            }

        }
    }

    // Create N units by picking from templates randomly
    public static List<Unit> createUnits(int numberOfUnits) {
        if (templates.isEmpty()) generateTemplates();

        List<Unit> result = new ArrayList<>();
        for (int i = 0; i < numberOfUnits; i++) {
            Unit template = templates.get(random.nextInt(templates.size()));

            Dice newDice = new Dice(template.getPower());

            Unit newUnit;
            if (template instanceof Infantry) {
                newUnit = new Infantry(template.getName(), template.getCost(), template.getLifepoints(), newDice);
            } else if (template instanceof Cavalry) {
                newUnit = new Cavalry(template.getName(), template.getCost(), template.getLifepoints(), newDice);
            } else if (template instanceof Artillery) {
                newUnit = new Artillery(template.getName(), template.getCost(), template.getLifepoints(), newDice);
            } else {
                throw new IllegalStateException("Unknown unit type: " + template.getClass());
            }

            result.add(newUnit);
        }
        return result;
    }

    public static List<Unit> getAllTemplates() {
        if (templates.isEmpty()) generateTemplates();
        return new ArrayList<>(templates);
    }
}
