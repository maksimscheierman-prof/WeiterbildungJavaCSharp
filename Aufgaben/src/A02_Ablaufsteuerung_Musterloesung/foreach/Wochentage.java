package A02_Ablaufsteuerung_Musterloesung.foreach;

public class Wochentage
{
    public static void main(String[] args) {

        String[] wochentage = new String[]{"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};



        System.out.println("Ausgabe OHNE Schleife:");
        System.out.println(wochentage[0]);
        System.out.println(wochentage[1]);
        System.out.println(wochentage[2]);
        System.out.println(wochentage[3]);
        System.out.println(wochentage[4]);
        System.out.println(wochentage[5]);
        System.out.println(wochentage[6]);

        System.out.println("\nAusgabe mit FOR-Schleife:");
        for(int i = 0; i < wochentage.length; i++)
        {
            System.out.println(wochentage[i]);
        }

        System.out.println("\nAusgabe mit FOREACH-Schleife:");
        for(String element : wochentage)
        {
            System.out.println(element);
        }

    }

}
