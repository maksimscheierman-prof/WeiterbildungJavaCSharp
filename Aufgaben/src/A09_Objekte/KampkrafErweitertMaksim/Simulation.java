package A09_Objekte.KampkrafErweitertMaksim;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Double userDoubleInput;
    Integer userIntInput;
    String menu = "main";

    //Teams
    Team shop = new Team("Shop");
    Team user = new Team("User");
    Team enemy = new Team("Enemy");
    public void simulate(){
        System.out.println("Matrix initialisiert....");
        createShop();

    }

    public void createShop(){
        shop.addUnits(UnitFactory.createUnits(10));
        shop.showUnits();
    }
}
