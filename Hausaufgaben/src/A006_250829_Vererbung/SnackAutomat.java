package A006_250829_Vererbung;

import A09_Objekte.SnackAutomatMaksim.Snacks;

import java.util.ArrayList;
import java.util.Scanner;

public class SnackAutomat {

    ArrayList<Snack> allSnacks = new ArrayList<>();
    ArrayList<Drink> allDrinks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Double userDoubleInput;
    Integer userIntInput;
    String menu = "main";

    public void run(){
        Drink.createInitialDrinks(allDrinks);
        Drink.showDrinks(allDrinks);
        Snack.createInitialSnacks(allSnacks);
        Snack.showSnacks(allSnacks);


    }

    // Snackautomaten Auffüllen mit Getränken und Essen
    private void fill(){

    }
    // Bestand des Automaten
    private void showArticles(){

    }

}
