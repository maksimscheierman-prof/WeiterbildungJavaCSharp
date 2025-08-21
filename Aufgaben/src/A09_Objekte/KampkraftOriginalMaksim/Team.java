package A09_Objekte.KampkraftOriginalMaksim;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Unit> units;
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

    public ArrayList<Unit> getUnits() {
        return units;
    }
    //Constructor

    public Team(String name) {
        units = new ArrayList<>();
        this.name = name;
    }

    //Methods
    public void addUnit(Unit unit){
        units.add(unit);
        this.power += unit.getPower();

    }

    public void showUnits(){
        for(Unit unit : units){
            System.out.println("Unitname: " + unit.getName() + " Power: " + unit.getPower());
        }
    }


    public void showTeam(){
        System.out.println("Team: " + getName() + " Power: " + getPower());
    }
}
