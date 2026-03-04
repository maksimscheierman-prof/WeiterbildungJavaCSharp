package A15_Webemaschine;

public class Order {
    private int amountTshirt;
    private int amountSweatshirt;
    private double pricePerPiece = 0.05; // Standardpreis

    public Order(int amountTshirt, int amountSweatshirt) {
        this.amountTshirt = amountTshirt;
        this.amountSweatshirt = amountSweatshirt;
    }

    private double getDiscountPercent(int totalPieces) {
        if (totalPieces >= 50) return 0.50;
        if (totalPieces >= 40) return 0.40;
        if (totalPieces >= 30) return 0.30;
        if (totalPieces >= 20) return 0.20;
        if (totalPieces >= 10) return 0.10;
        return 0.0;
    }

    public void printOrder() {
        int totalPieces = amountTshirt + amountSweatshirt;
        double discount = getDiscountPercent(totalPieces);
        double totalCost = totalPieces * pricePerPiece;
        double finalPrice = totalCost * (1 - discount);

        System.out.println("Bestellung: " + amountTshirt + " T-Shirts, "
                + amountSweatshirt + " Sweatshirts.");
        System.out.println("Gesamtanzahl: " + totalPieces);
        System.out.println("Rabatt: " + (int)(discount * 100) + "%");
        System.out.printf("Gesamtpreis nach Rabatt: %.2f €%n", finalPrice);
        System.out.println("------------------------------------------------");
    }
}
