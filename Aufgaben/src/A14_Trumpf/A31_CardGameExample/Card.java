package A14_Trumpf.A31_CardGameExample;

public class Card {
    private double weight;
    private int size;
    private int speed;
    private String name;

    public Card(String name,double weight, int size, int speed) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
