package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.Archetype;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.races.Race;
import A18_DungeonCrawl.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {
    private Archetype archetype;
    private Race race;
    private Weapon weapon;
    private List<Item> items = new ArrayList<>();;
    private Integer dmgBonus;

    public Unit(Archetype archetype, Race race, Weapon weapon, List<Item> items, Integer dmgBonus) {
        this.archetype = archetype;
        this.race = race;
        this.weapon = weapon;
        this.items = items;
        this.dmgBonus = dmgBonus;
    }

    public Unit(Archetype archetype, Race race, Weapon weapon, Item item, Integer dmgBonus) {
        this.archetype = archetype;
        this.race = race;
        this.weapon = weapon;
        this.items.add(item);
        this.dmgBonus = dmgBonus;
    }

    public void addItem(Item item){
        items.add(item);
        item.applyEffect();
    }
}
