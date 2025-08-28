package T18_Klassen_ConstructorChaining;

public class Katze {

    private String art;                                             // Tierart
    private  String food;                                           // Was frisst das Tier

    private double size                 = 7;                        // Größe des Tieres
    private double weight               = 0;                        // Gewicht
    private double speed                = 0;                        // In kmh
    private int lifespan;                        // In Jahren

    private final boolean carnivour;

    public Katze() {
        carnivour = true;
        System.out.println("Katze erstellt");
    }


    public Katze(double size, String food, String art) {
        this();
        this.size = size;
        this.food = food;
        this.art = art;
    }

    public Katze(String art, String food, double size, double weight, double speed) {
        this(size, food, art);
        this.speed = speed;
        this.weight = weight;
    }


    public Katze(String art, String food, double size, double weight, double speed, int lifespan) {
        this(art, food, size, weight, speed);
        this.lifespan = lifespan;
    }





    public Katze(boolean carnivour) {
        this.carnivour = carnivour;
    }
}
