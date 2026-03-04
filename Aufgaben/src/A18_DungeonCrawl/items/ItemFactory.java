package A18_DungeonCrawl.items;

import A18_DungeonCrawl.enums.EffectType;
import A18_DungeonCrawl.items.effects.Effect;

import A18_DungeonCrawl.items.effects.PassiveEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemFactory {

    private static final Random random = new Random();

    public static List<Item> createItems(int count) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            items.add(createRandomItem());
        }
        return items;
    }

    public static Item createRandomItem() {
        String name = generateItemName();
        List<Effect> effects = new ArrayList<>();

        // Zufällig: Heilung oder Schadenbonus
        if (random.nextBoolean()) {
            double healAmount = 10 + random.nextInt(20); // heilt 10–30 HP
            effects.add(new PassiveEffect(EffectType.HEAL, healAmount));
        } else {
            double dmgBonus = 1 + random.nextInt(3); // +1 bis +3 Schaden
            effects.add(new PassiveEffect(EffectType.DAMAGE_BONUS, dmgBonus));
        }

        return new Item(name, effects);
    }

    private static String generateItemName() {
        String[] names = {
                "Heiltrank", "Kraftstein", "Runenamulet", "Blutkristall", "Kriegerring"
        };
        return names[random.nextInt(names.length)];
    }
}

