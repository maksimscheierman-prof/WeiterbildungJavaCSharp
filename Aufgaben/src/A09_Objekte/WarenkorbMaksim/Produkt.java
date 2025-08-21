package A09_Objekte.WarenkorbMaksim;

public class Produkt {

    //Attribute
    private String name;
    private Double price;
    private Integer amount;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    //Constructor
    public Produkt(String name, Integer amount, Double price) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
