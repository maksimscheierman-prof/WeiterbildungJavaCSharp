package A09_Objekte.KampkrafErweitertMaksim;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Unit> units;
    //Logik für einzelne Kampfwerte zusammen addieren
    private Integer power = 0;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Unit> getUnits() {
        return units;
    }
    //Constructor

    public Team(String name) {
        units = new ArrayList<>();
        this.name = name;
    }

    //Methods
    public void addUnit(Unit unit) {
        units.add(unit);
        //this.power += unit.getPower();

    }

    public void addUnits(List<Unit> newUnits) {
        units.addAll(newUnits);
    }

    public void showUnits() {
        for (Unit unit : units) {
            System.out.println("Unitname: " + unit.getName() + " Power: " + unit.getPower() + " Cost: " + unit.getCost());
        }
    }


    public void showTeam() {
        System.out.println("********************************************");
        System.out.println("Team: " + getName() + " | Gesamtkampfkraft: " + getPower());
        System.out.println("********************************************");
        if (units.isEmpty()) {
            System.out.println("Das Team hat keine Einheiten.");
        } else {
            for (Unit unit : units) {
                System.out.println(unit.toString());
            }
            System.out.println("*********************************\n");
        }

    }
}
