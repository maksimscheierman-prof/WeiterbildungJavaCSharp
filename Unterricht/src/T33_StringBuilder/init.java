package T33_StringBuilder;

import java.time.LocalDate;

public class init {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("Hallo");
        StringBuilder c = b.append(" mein Name ist");
        b = b.append(" Anita").append(" !");
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(b.equals(c));

        StringBuilder d = new StringBuilder("Hallo mein Name ist Anita !");
        System.out.println(b.equals(d));


        /*c = c.append("Ich ändere mich nochmal");
        System.out.println(b);
        System.out.println(c);

        StringBuilder d = new StringBuilder(c);
        d.append("Abc");
        System.out.println(c);
        System.out.println(d);*/
        StringBuilder sb = new StringBuilder(5);
        System.out.println(sb.length());
        String s = "";

    }

}
