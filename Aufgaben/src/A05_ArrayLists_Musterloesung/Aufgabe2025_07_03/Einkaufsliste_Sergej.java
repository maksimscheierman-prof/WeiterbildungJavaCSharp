package A05_ArrayLists_Musterloesung.Aufgabe2025_07_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Einkaufsliste_Sergej {

    public static final String ORANGE = "\u001B[38;5;214m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Brot");
        list.add("Milch");
        list.add("Eier");

        Scanner sc = new Scanner(System.in);

        String startMessage = "Tippe " + ORANGE + "h Milch" + RESET + " um z.B. Milch hinzuzufügen\nTippe " + ORANGE + "l 1" + RESET + " um die erste Position zu löschen\nTippe " + ORANGE + "a 1 Brot" + RESET + " um die erste Position zu ändern\nTippe " + ORANGE + "q" + RESET + " zu beenden";

        System.out.println("Willkommen in der Einkaufsliste");
        System.out.println("Es ist die Zeit, etwas einzukaufen!");
        System.out.println(startMessage);

        while (true) {

            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%2d: %s\n", (i + 1), list.get(i));
            }

            System.out.println();

            System.out.print("Dein Befehl: ");
            String s = sc.nextLine().trim();

            if (s.isEmpty()) {
                System.out.println("Nicht verstanden\n" + startMessage);
            } else if (s.charAt(0) == 'h') {
                if (s.length() > 2) {
                    list.add(s.substring(2));
                } else {
                    System.out.println("Nicht verstanden\n" + startMessage);
                }
            } else if (s.charAt(0) == 'l') {
                try {
                    String[] n = s.split(" ");
                    int i = Integer.parseInt(n[1]);
                    list.remove((i - 1));
                } catch (Exception e) {
                    System.out.println("Nicht verstanden\n" + startMessage);
                }
            } else if (s.charAt(0) == 'a') {
                try {
                    String[] n = s.split(" ", 3);
                    int i = Integer.parseInt(n[1]);
                    list.set((i - 1), n[2]);
                } catch (Exception e) {
                    System.out.println("Nicht verstanden\n" + startMessage);
                }
            } else if (s.charAt(0) == 'q') {
                break;
            } else {
                System.out.println("Nicht verstanden\n" + startMessage);
            }

        }

    }
}
