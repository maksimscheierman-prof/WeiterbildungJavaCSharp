package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.Archetype;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.races.Race;
import A18_DungeonCrawl.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Unit{
    public Monster(String name,
                   Archetype archetype,
                   Race race,
                   Weapon weapon,
                   List<Item> items,
                   double dmgBonus,
                   double baseLifepoints) {

        super(name, archetype, race, weapon, items, dmgBonus, baseLifepoints);
    }

    public Monster(String name,
                   Archetype archetype,
                   Race race,
                   Weapon weapon,
                   Item item,
                   double dmgBonus,
                   double baseLifepoints) {

        super(name, archetype, race, weapon, new ArrayList<>(List.of(item)), dmgBonus, baseLifepoints);
    }

    @Override
    public double calcDamage() {
        return getWeapon().getDmg() * getArchetype().getDmgMulti(getWeapon()) * 0.5;
    }
}
