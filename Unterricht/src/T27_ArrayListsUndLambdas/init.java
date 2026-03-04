package T27_ArrayListsUndLambdas;

import java.util.ArrayList;
import java.util.List;

public class init {
    public static void main(String[] args) {
        //Zahlen kleiner als 10
        List<Integer> zahlen = new ArrayList<>(List.of(5,12,8,20,3,15,10));

        zahlen.removeIf(zahl -> zahl < 10);
        System.out.println(zahlen);

        //Namen alle Groß
        List<String> namen = new ArrayList<>(List.of("anna","bob","charlie","david"));
        namen.replaceAll(String::toUpperCase);
        System.out.println(namen);

        //Alle ausgeben
        List<String> staedte = new ArrayList<>(List.of("Berlin","Hamburg","München","Stuttgart"));
        staedte.forEach(System.out::println);
    }
}
