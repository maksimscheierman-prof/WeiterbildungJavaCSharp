package A003_250822_Bibliothek;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliothek
{
    ArrayList<Buch> Buecher = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userStrInput;

    public void run(){
        Buch.createInitialBooks(Buecher);
        Buch.showBooks(Buecher);
    }
}
