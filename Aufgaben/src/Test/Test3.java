package Test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {


    ArrayList list = new ArrayList();
    String[] array;
    try {
        for (;;) {
            list.add("String");
        }
    } catch (RuntimeException re) {
        System.out.println("RuntimeException");
    } catch (Exception e) {
        System.out.println("Exception");
    }
    System.out.println("Ready");
}
}
