package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.*;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.items.ItemFactory;
import A18_DungeonCrawl.races.*;
import A18_DungeonCrawl.weapons.*;
import A18_DungeonCrawl.units.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterFactory {

    private static final Random random = new Random();

    public static List<Monster> createMonsters(int count) {
        List<Monster> monsters = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            monsters.add(createRandomMonster());
        }

        return monsters;
    }

    public static Monster createRandomMonster() {
        String name = generateName();
        Archetype archetype = getRandomArchetype();
        Race race = getRandomRace();
        Weapon weapon = getRandomWeapon();
        Item item = getRandomItem();
        double dmgBonus = random.nextInt(10) + 1;
        double lifepoints = 40.0;

        return new Monster(name, archetype, race, weapon, item, dmgBonus, lifepoints);
    }

    // ===== Hilfsmethoden =====
    private static String generateName() {
        String[] names = {"Goblin", "Ork", "Skelett", "Dämon", "Troll", "Schattenwolf"};
        return names[random.nextInt(names.length)];
    }

    private static Archetype getRandomArchetype() {
        return switch (random.nextInt(3)) {
            case 0 -> new Warrior();
            case 1 -> new Mage();
            default -> new Hunter();
        };
    }

    private static Race getRandomRace() {
        return switch (random.nextInt(3)) {
            case 0 -> new Orc();
            case 1 -> new Human();
            default -> new Elf();
        };
    }

    private static Weapon getRandomWeapon() {
        return switch (random.nextInt(3)) {
            case 0 -> new Weapon("Melee",1,10.0);
            case 1 -> new Weapon("Range",4,5.0);
            default -> new Weapon("Staff", 3,7.0);
        };
    }

    private static Item getRandomItem() {
        return ItemFactory.createItems(1).get(0);
    }
}
