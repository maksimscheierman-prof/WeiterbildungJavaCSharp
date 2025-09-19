package A15_Webemaschine;

import java.util.ArrayList;

public class Order {
    private Integer amountTshirt;
    private Integer amountSweatshirt;
    private Double totalPrice;
    private ArrayList<Clothes> clothOrder = new ArrayList<>();

    public Order(Integer amountTshirt, Integer amountSweatshirt) {
        this.amountTshirt = amountTshirt;
        this.amountSweatshirt = amountSweatshirt;
    }

    public void createTshirtOrder(String brand, Double cost, String material, String collar){
        for (int i = 0; i < amountTshirt; i++) {
            clothOrder.add(new TShirts(brand,cost,material,collar));
        }
    }
    public void createSweatshirtOrder(String brand, Double cost, String material, Boolean hoodie){
        for (int i = 0; i < amountTshirt; i++) {
            clothOrder.add(new Sweatshirts(brand,cost,material,hoodie));
        }
    }
}
