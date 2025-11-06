package A009_20251105_Commanline_Textanalyzer.textanalyzer;

public class StringPoolDemo {

    public static void demonstrate() {
        System.out.println("--- String-Pool-Demo ---");

        String a = "Hallo";           // im String-Pool
        String b = "Hallo";           // gleiches Literal → selbes Objekt
        String c = new String("Hallo"); // neues Objekt
        String d = ("Hal" + "lo");    // compile-time Konstante → im Pool
        String e = ("Hal" + getSuffix()); // runtime → neues Objekt

        System.out.println("a == b : " + (a == b));         // true
        System.out.println("a == c : " + (a == c));         // false
        System.out.println("a.equals(c) : " + a.equals(c)); // true
        System.out.println("a == d : " + (a == d));         // true
        System.out.println("a == e : " + (a == e));         // false
        System.out.println("a.intern() == e.intern() : " + (a.intern() == e.intern())); // true
    }

    private static String getSuffix() {
        return "lo";
    }
}

