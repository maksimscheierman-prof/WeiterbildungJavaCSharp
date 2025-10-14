package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.Archetype;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.races.Race;
import A18_DungeonCrawl.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Unit{
    private String name;
    private Archetype archetype;
    private Race race;
    private Weapon weapon;
    private List<Item> items = new ArrayList<>();;
    private Integer dmgBonus;

    public Hero(String name, Archetype archetype, Race race, Weapon weapon, List<Item> items, Integer dmgBonus) {
        super(name, archetype, race, weapon, items, dmgBonus);
    }

    public Hero(String name, Archetype archetype, Race race, Weapon weapon, Item item, Integer dmgBonus) {
        super(name, archetype, race, weapon, item, dmgBonus);
    }

    @Override
    public Double dealDamge() {
       return weapon.getDmg()*archetype.getDmgMulti(weapon)*2+dmgBonus;
    }
}
