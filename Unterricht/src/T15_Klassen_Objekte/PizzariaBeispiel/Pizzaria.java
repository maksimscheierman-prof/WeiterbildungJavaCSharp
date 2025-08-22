package T15_Klassen_Objekte.PizzariaBeispiel;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {

    ArrayList<Pizza> pizzaStapel = new ArrayList<Pizza>();
    int maximalerPizzaStapel = 5;
    Scanner scan = new Scanner(System.in);


    public void run(){
        while(true){

            macheEinenBurger();
            scan.nextLine();
           // machePizzas();
           // showPizzas();

        }
    }


    private void macheEinenBurger(){
        Burger krabbenburger = new Burger();
        krabbenburger.setBunArt("Weizen");
        krabbenburger.setSauce("Geheim");
        krabbenburger.setPattyArt("ImSorryMrsCrabs");
        krabbenburger.setPrice(1.99);

        Burger abfallEimerBurger = new Burger("Metall","Abfall","Schuhsohle",1.99);

    }

    private void showPizzas(){
        for (Pizza pizza : pizzaStapel) {
            System.out.println(pizza.getZutaten());

        }
    }


    private void machePizzas(){
        System.out.println("neue Pizza: ");
        String gewaehlteZutat;
        if(pizzaStapel.size()<maximalerPizzaStapel){
            pizzaStapel.add(new Pizza());

            for(int i=0; i<pizzaStapel.get(0).getMaxZutaten(); i++){
                System.out.println("Deine Zutat Nr. "+(i+1)+"/4 : ");
                gewaehlteZutat = scan.nextLine();

                pizzaStapel.getLast().addZutat(gewaehlteZutat);
            }
        }
        else{
            System.out.println("Du bist in der Warteschlange ...");
            verteilePizza();

        }
    }



    private void verteilePizza(){
        // TODO
        scan.nextLine();
    }



    private void macheEinzelnPizza(){
        Pizza calzone = new Pizza();
        pizzaStapel.add(new Pizza());

        pizzaStapel.get(0).addZutat("Tomaten");
        pizzaStapel.get(0).addZutat("Oliven");
        pizzaStapel.get(0).addZutat("Ananas");
        pizzaStapel.get(0).addZutat("Plutonium");

        pizzaStapel.add(new Pizza());
        pizzaStapel.get(1).addZutat("Radisschen");
        pizzaStapel.get(1).addZutat("Mais");
        pizzaStapel.get(1).addZutat("Gummibaerchen");
        pizzaStapel.get(1).addZutat("Kartoffelsalat");


        calzone.addZutat("Tomaten");
        calzone.addZutat("Oliven");
        calzone.addZutat("Ananas");
        calzone.addZutat("Plutonium");

    }

}
