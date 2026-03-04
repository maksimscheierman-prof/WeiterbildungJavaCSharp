package A09_Objekte.KampkrafErweitertMaksim;

public class Dice {
    private Integer numberOfDice;
    private Integer sides;
    private Integer modifier;

    //Constructor
    public Dice(Integer numberOfDice, Integer sides, Integer modifier) {
        this.numberOfDice = numberOfDice;
        this.sides = sides;
        this.modifier = modifier;
    }

    // Extra constructor that parses "XdY+Z" style
    public Dice(String notation) {
        // Example: "2d8+3"
        String[] parts = notation.split("d");
        this.numberOfDice = Integer.parseInt(parts[0]);

        int plusIndex = parts[1].indexOf('+');
        if (plusIndex >= 0) {
            this.sides = Integer.parseInt(parts[1].substring(0, plusIndex));
            this.modifier = Integer.parseInt(parts[1].substring(plusIndex + 1));
        } else {
            this.sides = Integer.parseInt(parts[1]);
            this.modifier = 0;
        }
    }

    public Integer roll() {
        Integer total = 0;
        for (int i = 0; i < numberOfDice; i++) {
            total += (int)(Math.random() * sides) +1;

        }
        return total + modifier;
    }

    @Override
    public String toString() {
        return numberOfDice + "d" + sides + (modifier != 0 ? "+" + modifier : "");
    }
}
