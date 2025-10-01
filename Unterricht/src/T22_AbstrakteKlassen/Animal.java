package T22_AbstrakteKlassen;

abstract class Animal {
    void sleep(){
        System.out.println("zzZZZZzzZZZZzzz");
    }

    //Überladene Methode
    void sleep(int hours){
        System.out.println("I sleep for " + hours + " hours");
    }

    abstract void makeSound();

}
