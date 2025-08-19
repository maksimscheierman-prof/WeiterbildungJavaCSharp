package A09_Objekte_snackautomat.SnackAutomatMUSTERLOESUNG;

import java.util.ArrayList;
import java.util.Scanner;

public class SnackAutomat {
    ArrayList<Snack> Snickers = new ArrayList<>();
    ArrayList<Snack> Mars = new ArrayList<>();
    ArrayList<Snack> Bountys = new ArrayList<>();
    double marsPreis = 1.5;
    double bountyPreis = 3;
    double snickersPreis = 2;
    private final int MAXSNACKS = 10;

    Scanner scan = new Scanner(System.in);

    public void run(){
        createSnacks();

        while(true){
            System.out.println("____________ ANGEBOT _____");
            System.out.println(" (1) "+snickersPreis+"€ Snickers: " + Snickers.size());
            System.out.println(" (2) "+marsPreis+"€ Mars:     " + Mars.size());
            System.out.println(" (3) "+bountyPreis+"€ Bountys:  " + Bountys.size());
            System.out.println("--------------------------");
            System.out.print("Deine Wahl: ");
            //double eingezahltesGeld;
            int choice = scan.nextInt();
            scan.nextLine(); // Buffer clearen

            if(choice == 473){  // Auffüllen
                createSnacks();
            }
            if(choice == 1){
                snackKaufen(Snickers,snickersPreis);
            }
            if(choice == 2){
                snackKaufen(Mars,marsPreis);
            }
            if(choice == 3){
                snackKaufen(Bountys,bountyPreis);
              /*  if(!Bountys.isEmpty()){
                    System.out.println("Bitte zahlen sie mindestens " + bountyPreis + "Euro");
                    eingezahltesGeld = scan.nextInt();
                    scan.nextLine();
                    if(verrechnen(bountyPreis,eingezahltesGeld)){
                        Bountys.removeLast();
                    }
                }else{
                    System.out.println("Ungültig");
                }
               */
            }
        }

    }
    private void snackKaufen(ArrayList<Snack> lager, double preis){
        if(!lager.isEmpty()){
            System.out.println("Bitte zahlen sie mindestens " + preis + "Euro");
            double eingezahlt = scan.nextInt();
            scan.nextLine();
            if(verrechnen(preis,eingezahlt)){
                lager.removeLast();
            }
        }else{
            System.out.println("Ungültig");
        }
    }

    private boolean verrechnen(double preis, double eingezahlt){
        if(eingezahlt < preis){
            System.out.println("Dein Rückgeld: " + eingezahlt);
            return false;
        }else{
            System.out.println("Dein Rückgeld: " + (eingezahlt - preis));
            return true;
        }
    }

    private void createSnacks(){
        for(int i = 0; i < 10; i++) {
            if(Snickers.size() <MAXSNACKS) {
                Snickers.add(new Snack(57, 504, 61, 23, 8.6));
            }
            if(Mars.size() <MAXSNACKS) {
                Mars.add(new Snack(51, 448, 70.1, 16.6, 3.8));
            }
            if(Bountys.size() <MAXSNACKS) {
                Bountys.add(new Snack(57,470,57.8,24.6,4.1));
            }
        }
    }



}
