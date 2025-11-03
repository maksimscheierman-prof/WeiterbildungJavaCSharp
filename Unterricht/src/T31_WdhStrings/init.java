package T31_WdhStrings;

import java.util.Arrays;
import java.util.Scanner;

public class init {
    public static void main(String[] args) {
        String s = "Hallo";
        String s2 = "Hallo";
        //System.out.println(s == s2);  //true, wenn Literale gleich

        String s1 = new String("Hallo");
        s1.toLowerCase();
        String s3 = s1.toLowerCase();
        //System.out.println(s == s1.intern()); //intern verweist auf StringPool
        //System.out.println(s.equals(s1)); //vergleicht IMMER Inhalte


        Scanner sc = new Scanner(System.in);
        //String userInput = sc.nextLine();
        //System.out.println(s3 == userInput);  //Landet im Heap und nicht im Pool
        //System.out.println(s3.equals(userInput));

        String str1 = "Hallo Welt";
        System.out.println(str1.substring(3,10));

        String apfel = "Apfel";
        String apfel2 = "Apfelbaum";

        System.out.println(apfel.compareTo(apfel2));

        String poesie = "Das ist ein leckerer Apfelbaum, hab ich Hunger.";
        String[] poesieArray = poesie.split(" ");
        System.out.println(Arrays.toString(poesieArray));

        String result = "   Hallo, Java!   "
                .trim() //Hallo, Java!
                .replace("Java", "Welt")   //Hallo, Welt!
                .toUpperCase()  //HALLO, WELT!
                .substring(0, 10);
        System.out.println(result); // Gibt "HALLO, WEL" aus
    }
}
