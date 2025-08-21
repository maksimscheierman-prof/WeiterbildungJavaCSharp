package A09_Objekte.LieferwagenMaksim;

public class Paket {

    //Attribute
    private String name;
    private Integer gewicht;

    //Getter & Setter
    public Integer getGewicht() {
        return gewicht;
    }

    public void setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor
    public Paket(String name, Integer gewicht) {
        this.gewicht = gewicht;
        this.name = name;
    }
}
