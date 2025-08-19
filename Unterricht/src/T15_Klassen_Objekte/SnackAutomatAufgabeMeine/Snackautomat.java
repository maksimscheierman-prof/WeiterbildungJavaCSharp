package T15_Klassen_Objekte.SnackAutomatAufgabeMeine;

import java.util.ArrayList;
import java.util.Scanner;

public class Snackautomat {

    ArrayList<Snacks> allSnacks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userinput;
    public void runSnackAutomat(){
        Snacks.createInitialSnacks(allSnacks);
        Snacks.showSnacks(allSnacks);
        while(true){
            for(Snacks snack : allSnacks){

            }
        }
    }
}
