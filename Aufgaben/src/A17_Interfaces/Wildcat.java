package A17_Interfaces;

//Erste konkrete Klasse! Muss also alle noch nicht implementierten abstrakten Methoden implementieren
class Wildcat extends Cat {
    @Override
    void hunt() {
        System.out.println("Jagt Rehe");
    }

    @Override
    void makeSound() {
        System.out.println("RAWRR");
    }
}
