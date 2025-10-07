package P001_20251002_RPG_Interfaces;

public class HumanCharacter extends PlayerCharacter {
    public HumanCharacter(String name) {
        super(name, 5, 5);
    }

    @Override
    public void run() {
        System.out.println(name + " (Human) runs quickly!");
    }

    @Override
    public void jump() {
        System.out.println(name + " (Human) jumps gracefully!");
    }
}

