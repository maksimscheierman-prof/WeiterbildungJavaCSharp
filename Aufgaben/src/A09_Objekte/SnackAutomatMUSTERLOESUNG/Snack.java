package A09_Objekte.SnackAutomatMUSTERLOESUNG;

public class Snack {
    /*
    - Menge pro Riegel/Tüte
            - kcal auf 100g
            - Kohlenhydrate auf 100 g
            - Fett auf 100 g
            - Eiweiß auf 100 g
     */

    private double grammProEinheit;
    private double kcalProEinheit;
    private double carbsPro100g;
    private double fatPro100g;
    private double proteinPro100g;

    public Snack(double grammProEinheit,double kcalProEinheit, double carbsPro100g,double fatPro100g, double proteinPro100g) {
        this.grammProEinheit = grammProEinheit;
        this.kcalProEinheit = kcalProEinheit;
        this.carbsPro100g = carbsPro100g;
        this.fatPro100g = fatPro100g;
        this.proteinPro100g = proteinPro100g;
    }
    // Getter
    public double getGrammProEinheit() {return grammProEinheit;}
    public double getCarbsPro100g() {return carbsPro100g;}
    public double getFatPro100g(){return fatPro100g;}
    public double getProteinPro100g(){return proteinPro100g;}
    // Setter







}
