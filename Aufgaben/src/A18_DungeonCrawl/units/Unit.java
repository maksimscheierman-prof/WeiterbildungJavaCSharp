package A18_DungeonCrawl.units;

import A18_DungeonCrawl.archetypes.Archetype;
import A18_DungeonCrawl.items.Item;
import A18_DungeonCrawl.races.Elf;
import A18_DungeonCrawl.races.Human;
import A18_DungeonCrawl.races.Orc;
import A18_DungeonCrawl.races.Race;
import A18_DungeonCrawl.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {
    private String name;
    private Archetype archetype;
    private Race race;
    private Weapon weapon;
    private List<Item> items = new ArrayList<>();
    private Double dmgBonus;
    private Double lifepoints;

    public Unit(String name, Archetype archetype, Race race, Weapon weapon,
                       List<Item> items, double dmgBonus, double baseLifepoints) {

        this.name = name;
        this.archetype = archetype;
        this.race = race;
        this.weapon = weapon;
        this.items = items;
        this.dmgBonus = dmgBonus;

        // Lebenspunkte = Basis + Archetypenbonus
        this.lifepoints = baseLifepoints + archetype.getBonusLifepoints();
    }

    public Unit(String name, Archetype archetype, Race race, Weapon weapon,
                Item item, double dmgBonus, double baseLifepoints) {

        this.name = name;
        this.archetype = archetype;
        this.race = race;
        this.weapon = weapon;
        this.items.add(item);
        this.dmgBonus = dmgBonus;

        // Lebenspunkte = Basis + Archetypenbonus
        this.lifepoints = baseLifepoints + archetype.getBonusLifepoints();
    }
        // ====== Getter & Utility ======
    public double getLifepoints() { return lifepoints; }

    public void restoreHealth(double amount) {
        lifepoints += amount;
        System.out.println(name + " heilt sich um " + amount + " Punkte. Aktuell: " + lifepoints);
    }

    public void takeDamage(double dmg) {
        lifepoints -= dmg;
        if (lifepoints < 0.0) lifepoints = 0.0;
        System.out.println(name + " erleidet " + dmg + " Schaden. HP: " + lifepoints);
    }

    public void increaseDmgBonus(double amount) { dmgBonus += amount; }
    public double getDmgBonus() { return dmgBonus; }

    public Archetype getArchetype() { return archetype; }
    public Weapon getWeapon() { return weapon; }

    public abstract double calcDamage();
    public void addItem(Item item){
        items.add(item);
        item.applyEffect(this);
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public List<Item> getItems() {
        return items;
    }


    public void fight(Unit attacker, Unit defender) {
        defender.getRace().resetAbility(); // Reset zu Beginn des Kampfes
        attacker.getRace().resetAbility();

        double dmg = attacker.calcDamage();

        // Spezialfall Human mit Energieschild
        if (defender.getRace() instanceof Human humanRace) {
            humanRace.onAttack(defender, attacker, dmg);
        }
        // Spezialfall Elf: Ausweichen
        else if (defender.getRace() instanceof Elf elfRace && elfRace.isDodgeReady()) {
            System.out.println(defender.getName() + " weicht geschickt aus!");
            elfRace.resetDodge();
        }
        // Standardfall: normaler Schaden
        else {
            defender.takeDamage(dmg);
        }

        // Orc-Heilung am Ende der Runde
        if (attacker.getRace() instanceof Orc orcRace) {
            orcRace.onTurn(attacker);
        }
    }


}
