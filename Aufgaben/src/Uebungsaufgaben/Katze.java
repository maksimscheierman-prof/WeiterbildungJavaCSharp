package Uebungsaufgaben;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Katze {

    private static String farbe = "weiß";  // static → gehört der Klasse, nicht dem Objekt

    public static String getFarbe() {
        return farbe;
    }

    public static void setFarbe(String neueFarbe) {
        farbe = neueFarbe;
    }



        public static void main(String[] args) {
            List<String> list = Arrays.asList("A", "B", "C", "D");
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                String element = iterator.next();
                if (element.equals("C")) {
                    break;
                }
                System.out.print(element + " ");
            }
        }



}

