package T16_Queue_HashMap.Aufgaben;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Muster_Programm3 {


    /**
     *  Programm 3 :
     *  Kindergarten Telefonservice
     *  A) Lege ein Telefonbuch an.
     *  b) Lege eine Anrufliste an in der alle Personen aus dem Telefonbuch namentlich eingefügt werden.
     *  c) Lasse dir Alphabetisch ausgeben wer angerufen werden muss, lass dir gleich auch die
     *  Nummer mit ausgeben.
     *
     *  p
     * */

    public static void main(String[] args) {
        HashMap<String,Integer> telefonbuch = new HashMap<String,Integer>();
        Queue<String> Anrufliste = new PriorityQueue<>();

        Scanner scan = new Scanner(System.in);

        telefonbuch.put("Max",01234);
        telefonbuch.put("Tim",2334);
        telefonbuch.put("Tom",2434235);
        telefonbuch.put("Jim",3542334);
        telefonbuch.put("Jan",4562334);
        telefonbuch.put("John",6782334);
        telefonbuch.put("Jane",7892334);

        Anrufliste.add("Max");
        Anrufliste.add("Tim");
        Anrufliste.add("Tom");
        Anrufliste.add("Max");
        Anrufliste.add("Tim");
        Anrufliste.add("Tom");
        Anrufliste.add("Jane");
        Anrufliste.add("John");

        while(!Anrufliste.isEmpty()) {
            String nextInLine= Anrufliste.poll();
            System.out.println(nextInLine + " " + telefonbuch.get(nextInLine));
        }


    }
}