package Test;

import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Test t = new Test();
        t.validateAge(sc);
        /*
        try {
            System.out.println("Gib zwei Zahlen ein!");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (Exception e){
            System.out.println("Fehler: " + e);
        }
        finally {
            System.out.println("Im Finale!");
        }

        // Beispiel 1: Liste von Strings
        List<String> words = new ArrayList<>(Arrays.asList("Apfel", "Banane", "Kiwi", "", "Birne", "Orange", ""));
        System.out.println("Vor removeIf: " + words);

        // Entfernt alle leeren Strings
        words.removeIf(x -> x.isEmpty());
        System.out.println("Nach removeIf(x -> x.isEmpty()): " + words);

        // Entfernt alle Strings, deren Länge > 5 ist
        words.removeIf(x -> x.length() > 5);
        System.out.println("Nach removeIf(x -> x.length() > 5): " + words);

 */
    }
    public void checkAge(int alter) throws Exception{
        if(alter < 0 || alter > 120) throw new Exception("Ungültiges Alter: " + alter);
    }

    public void validateAge(Scanner sc){
        try {
            System.out.println("Bitt Alter eingeben!\n");
            checkAge(sc.nextInt());
            System.out.println("Alter valide!");
        }
        catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
