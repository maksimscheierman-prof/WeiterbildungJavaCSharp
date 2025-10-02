package A17_Interfaces;

class DomesticCat extends Cat {

    @Override
    void hunt() {
        System.out.println("Jagt Mäuse und Vögel");
    }

    @Override
    void makeSound() {
        System.out.println("Miau");
    }
}
