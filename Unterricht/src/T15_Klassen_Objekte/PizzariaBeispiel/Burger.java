package T15_Klassen_Objekte.PizzariaBeispiel;


// Klasse als Schablone
public class Burger {

    // Felder (Variablen / Eigenschaften der Klasse)
    private String bunArt;
    private String pattyArt;
    private String sauce;
    private double price;

    // Getter & Setter
    public String getBunArt() {return bunArt;}
    public String getPattyArt(){return pattyArt;}
    public String getSauce(){return sauce;}
    public double getPrice(){return price;}

    public void setPrice(double price){
        if(price < 0){
            System.out.println("wir verschenken hier nichts!");
        }else{
            this.price = price;
        }
    }
    public void setBunArt(String bunArt){this.bunArt = bunArt;}
    public void setSauce(String sauce){this.sauce = sauce;}
    public void setPattyArt(String pattyArt){this.pattyArt = pattyArt;}


    // Konstruktor - "Baut" uns das Objekt nach unserer Schablone
    public Burger(){

    }
    public Burger(String meinBun, String pattyArt, String sauce, double price){
        this.bunArt = meinBun;
        this.pattyArt = pattyArt;
        this.sauce = sauce;
        if(price > 0){
            this.price = price;
        }else{
            this.price = 2.99;
        }
        preisKracher();
    }

    // Methoden - Stellen das Verhalten unseres Objektes dar
    private void preisKracher(){
        if(price < 2){
            System.out.println("SUPER SUPER ANGEBOT NEU NEU NEU");
        }
    }

}
