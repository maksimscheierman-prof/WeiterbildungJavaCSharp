package A09_Objekte.BibliothekMaksim;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    //Variables
    ArrayList<Medium> allMediums = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Integer userIntInput;

    public void start() {
        Medium.createInitialMedia(allMediums);

        while (true) {
            showMedia();
            borrowMedia();
        }
    }

    public void showMedia() {
        for (Medium media : allMediums) {
            System.out.println("Typ: " + media.getType() + " Titel: " + media.getName() + " Ausgeliehen: " + media.getBorrowed());
        }
    }

    public void borrowMedia() {
        System.out.println("Tippen Sie den Titel welchen Sie ausleihen möchten:");
        userStrInput = scan.nextLine();
        for (Medium media : allMediums) {
            if (media.getName().equals(userStrInput)) {
                media.setBorrowed(true);
            }
        }
    }

}
