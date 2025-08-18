package T15_Klassen_Objekte.SnackAutomatAufgabeMeine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Snacks> allSnacks = new ArrayList<>();
        Snacks.createInitialSnacks(allSnacks);
        Snacks.showSnacks(allSnacks);
    }
}
