package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.Archetype;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.races.Race;
import A18_DungeonCrawl.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Unit{

    public Hero(String name, Archetype archetype, Race race, Weapon weapon, List<Item> items, Integer dmgBonus) {
        super(name, archetype, race, weapon, items, dmgBonus, 100.0);
    }

    public Hero(String name, Archetype archetype, Race race, Weapon weapon, Item item, Integer dmgBonus) {
        super(name, archetype, race, weapon, item, dmgBonus,100.0);
    }

    @Override
    public double calcDamage() {
        return getWeapon().getDmg() * getArchetype().getDmgMulti(getWeapon()) * 2 + getDmgBonus();
    }
}
