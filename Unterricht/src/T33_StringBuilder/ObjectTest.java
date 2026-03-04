package T33_StringBuilder;

public class ObjectTest {
    public static void main(String[] args) {

        /*
        String str1 = "Hallo Welt";
        String str2 = "Hallo Welt";
        String str3 = new String("Hallo Welt");

        System.out.println("str1 == str2:       " + (str1 == str2));
        System.out.println("str1.equals(str2):  " + str1.equals(str2));

        System.out.println("str1 == str3:       " + (str1 == str3));
        System.out.println("str1.equals(str3):  " + str1.equals(str3));




        StringBuilder sb1 = new StringBuilder("Hallo Welt");
        StringBuilder sb2 = new StringBuilder("Hallo Welt");
        StringBuilder sb3 = sb1.append("");

        // optional wie im Bild:
        // StringBuilder sb3 = sb1.append(" !");

        System.out.println("sb1                                  " + sb1);
        System.out.println("sb2                                  " + sb2);
        System.out.println("sb3                                  " + sb3);
        System.out.println("sb1 == sb2:                          " + (sb1 == sb2));
        System.out.println("sb1.equals(sb2):                     " + sb1.equals(sb2));
        System.out.println("sb1.compareTo(sb2):                  " + (sb1.compareTo(sb2) == 0));
        System.out.println("sb1.toString().equals(sb2.toString())" + sb1.toString().equals(sb2.toString()));
        System.out.println("sb1.equals(sb3):                     " + sb1.equals(sb3));
        System.out.println("sb1 == sb3:                          " + (sb1 == sb3));
*/
     StringBuilder sb = new StringBuilder("1234-5678-9101-1213");
     String x = "xxxx-xxxx-xxxx-";
        sb.substring(15,19);

     System.out.println(x + sb);
    }
}

