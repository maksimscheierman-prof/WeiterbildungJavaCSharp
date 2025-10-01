package T22_AbstrakteKlassen;

//Da wir von Animal erben, welche eine abstrakte Methode hält, erhalten wir erst mal einen "Fehler".
//Dieser Fehler liegt dem zu Grunde, dass Animal eine abstrakte Methode hat,
// die in den (nicht abstrakten) Subklassen implentiert werden muss!

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Wuff");
    }

    private void getStick(){
        System.out.println("Wo ist das Stöcken?Ah da!?!");
    }

    private void getStick(String treat){
        System.out.println("Wo ist das Stöcken?Ah da!?! *bringt zurück* Nyom nyom, lecker " + treat);
    }
}
