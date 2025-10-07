package P001_20251002_RPG_Interfaces;

public class OrcCharacter extends PlayerCharacter {
    public OrcCharacter(String name) {
        super(name, 7, 3); // Orc starts with +2 Strength
    }

    @Override
    public void run() {
        System.out.println(name + " (Orc) charges forward powerfully!");
    }

    @Override
    public void jump() {
        System.out.println(name + " (Orc) jumps heavily!");
    }
}

