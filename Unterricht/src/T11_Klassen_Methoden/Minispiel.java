package T11_Klassen_Methoden;

import java.util.Random;
import java.util.Scanner;

public class Minispiel {

    /*
        Du bist hier:
        [x] Kapitel 1. Minispiel
        [ ] Kapitel 2. Main
     */


    /** Wir wollen ein kleines Spiel entwickeln, bei dem wir raten müssen
     * ob eine Random zahl größer oder kleiner als 50 sein wird.
     * */

    // 0. Wir deklarieren einige Variablen
    int guessedNumber;
    int randomNumber;
    Scanner sc = new Scanner(System.in);    // Scanner um Nutzereingaben zu lesen.
    Random rn = new Random();               // Wir nehmen uns eine Variable Random von der Klasse Random
                                            // Dabei handelt es sich um eine Klasse aus der Standardbibliothek

    // 1. Wir erstellen eine public Methode um das Spiel zu starten.
    public void startGame(){
        // Unser GameLoop
        while(true){
            randomNumber =   rn.nextInt(100);       // Next int gibt uns eine Random zahl zwischen 1 und 100
            System.out.println("Guess if the Number will be lower than 50: (1) yes (2) no");
            guessedNumber = sc.nextInt();       // Wir lesen eine Zahl ein
            sc.nextLine();                      // Wir bereinigen den Buffer
            // Jetzt wollen wir Prüfen ob die Zaheln übereinstimmen, dafür legen wir eine neue Methode an.
            boolean isLow = isLowerThan50(randomNumber);    // Wir rufen die Methode auf um zu prüfen ob die Zahl kleiner war
            if(isLow){                                      // Wenn dem so ist
                if(guessedNumber == 1){
                    System.out.println("richtig, Zahl war: " + randomNumber);
                }else{
                    System.out.println("falsch, Zahl war: " + guessedNumber);
                }
            }else{
                if(guessedNumber == 1){
                    System.out.println("falsch, Zahl war: " + randomNumber);
                }else{
                    System.out.println("richtig, Zahl war: " + guessedNumber);
                }
            }
        }
    }

    // Die Methode ist privat, also nur INNERHALB dieser Klasse sichtbar.
    // Die Methode gibt bool zurück.
    // Ihr name ist "isLowerThan50"
    // Sie akzeptiert den Parameter int number in der Parameterliste
    private boolean isLowerThan50(int number){
        if(number < 50){
            return true;    // Wenn die Zahl kleiner als 50 ist wird true zurückgegeben
        }
        return false;       // sonst wird false zurückgegeben.
    }



}
