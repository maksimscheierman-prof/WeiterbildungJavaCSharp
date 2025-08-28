package T18_Klassen_ConstructorChaining;

public class Katzenartige {

    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  Constructor Chaining
     *      Durch Constructor Chaining können Konstruktoren über andere Konstruktoren aufgerufen werden.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */


    //                      Attribute / Eigenschaften = Variablen
    //---------------------------------------------------------------------------------------
    private String art                  = "nicht zugewiesen";       // Tierart
    private  String food                = "fleisch";                // Was frisst das Tier

    private double size                 = 0;                        // Größe des Tieres
    private double weight               = 0;                        // Gewicht
    private double speed                = 0;                        // In kmh
    private int lifespan                = 0;                        // In Jahren


    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * final Variablen können im späteren Verlauf nicht mehr verändert werden. Aber trotzdem gelesen!
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    private final boolean carnivour     = true;


    //                                      Konstruktoren
    //-------------------------------------------------------------------------------------------------------


    //Standardkonstruktor (Konstruktor 0)
    public Katzenartige(){
        System.out.println("Der Standardkonstruktor wird ausgeführt");
    }
    // Würde man einen leeren "this()" Befehl schreiben würde der Standardkonstruktor aufgerufen.



    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *  "this()" ruft einen anderen Konstruktor innerhalb der Klasse auf.
     *  Es wird der Konstruktor aufgerufen, der mit den Parametern am ehesten übereinstimmt!
     *  In diesem Fall übereinstimmt die "this(...)" Methode mit dem Konstruktor 2.
     *  Wenn "this()" benutzt werden soll MUSS ES IMMER der erste Befehl im Konstruktor sein.
     *  (Die Konstruktoren sind nur für dieses Beispiel durchnummeriert, dies ist keine übliche Vorgehensweise)
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    //Konstruktor mit 5 Parametern (Konstruktor 1)
    public Katzenartige(String art, double size, double weight, double speed){
        this(art,"fleisch",size,weight,speed);

        System.out.println("Konstruktor 1 wird ausgeführt");
    }


    /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Dieser Konstruktor wird vom Konstruktor 1 über "this()" aufgerufen.
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    //Konstruktor mit 7 Parametern (Konstruktor 2)
    public Katzenartige(String art, String food, double size, double weight, double speed) {

        System.out.println("Konstruktor 2 wird ausgeführt");

        this.art = art;
        this.food = food;
        this.size = size;
        this.weight = weight;
        this.speed = speed;
    }



    //                                      Getter & Setter
    //-------------------------------------------------------------------------------------------------------

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public boolean isCarnivour() {
        return carnivour;
    }
}
