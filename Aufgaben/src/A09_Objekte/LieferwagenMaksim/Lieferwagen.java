package A09_Objekte.LieferwagenMaksim;

import java.util.ArrayList;

public class Lieferwagen {

    //Attributes
    private String name;
    private ArrayList<Paket> pakete; //muss im constructor initialisiert werden
    private Integer maxGesamtgewicht;
    private Integer Gesamtgewicht = 0;

    //Getter & Setter
    public Integer getGesamtgewicht() {
        return Gesamtgewicht;
    }

    public void setGesamtgewicht(Integer gesamtgewicht) {
        Gesamtgewicht = gesamtgewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxGesamtgewicht() {
        return maxGesamtgewicht;
    }

    public void setMaxGesamtgewicht(Integer maxGesamtgewicht) {
        this.maxGesamtgewicht = maxGesamtgewicht;
    }

    //Constructor
    public Lieferwagen(String name, Integer maxGesamtgewicht) {
        pakete = new ArrayList<>();
        this.name = name;
        this.maxGesamtgewicht = maxGesamtgewicht;
    }

    //Methods

    public void addPackage(Paket paket) {
        pakete.add(paket);
        if (maxGesamtgewicht >= this.Gesamtgewicht + paket.getGewicht()) {
            this.Gesamtgewicht += paket.getGewicht();
            System.out.println("Neues Gesamtgewicht beträgt " + (this.Gesamtgewicht + paket.getGewicht()));
        } else {
            System.out.println("Das Gesamtgewicht beträgt " + this.Gesamtgewicht + " .\nDas Paket wiegt " + paket.getGewicht());
            System.out.println("Neues Gesamtgewicht wäre " + (this.Gesamtgewicht+paket.getGewicht()));
            System.out.println("Zulässigesgesamtgewicht von" + this.maxGesamtgewicht + " kann nicht überschritten werden");
        }
    }

    public void showPackages(){
        for(Paket paket : pakete){
            System.out.println("Paketname: " + paket.getName() + " Paketgewicht: " + paket.getGewicht());
        }
    }

}
