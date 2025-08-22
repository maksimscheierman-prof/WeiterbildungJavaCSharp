package T16_Queue_HashMap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class b_QueueExamples {
    public static void main(String[] args) {
        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *
         *  Eine Queue kann aus verschiedenen Implementierungen bestehen.
         *  Wir schauen uns zwei Varianten an.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *              LinkedList Queue
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        // In der LinkedList werden die Elemente einfach der Reihe nach eingefügt.
        //
        System.out.println("LinkedListQueue: ");
        Queue<Integer> myLinkedListQueue = new LinkedList<>();
        myLinkedListQueue.add(7);
        myLinkedListQueue.add(3);
        myLinkedListQueue.add(9);
        System.out.println(myLinkedListQueue.poll());   // Gibt das erste Element (7) aus.


        /*** * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         *              PriorityList Queue
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

        // In einer PriorityList Queue ist das einfügen der Elemente nicht restriktiert.
        // Anders als bei der LinkedList, werden die Elemente nach ihrer "natürlichen Reihenfolge" sortiert.
        // (Streng genommen handelt es sich hier nicht mehr um ein FIFO Prinzip)
        System.out.println("PriorityQueue:");
        Queue<Integer> zahlenQueue = new PriorityQueue<>();
        zahlenQueue.add(7);
        zahlenQueue.add(3);
        zahlenQueue.add(9);
        System.out.println(zahlenQueue.poll()); // Gibt die erste Zahl der natürlichen Reihenfolge aus (3)



    }

}