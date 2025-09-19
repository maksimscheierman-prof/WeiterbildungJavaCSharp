package A15_Webemaschine;

public class Shop {
    public void run(){

        Order orderA = new Order(50,50);
        orderA.createTshirtOrder("Adidas", 49.99, "Wool","Point collar");
        orderA.createSweatshirtOrder("3 Stripes", 9.99,"Polyester", true);
    }
}
