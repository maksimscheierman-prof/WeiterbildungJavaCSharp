package T21_Instance_Initializer;

public class main {
    /**                                     INFO
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * Beispielausführung der Klasse Auto mit Instance Initializer
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */

    public static void main(String[] args){
        TimeLogger timer1 = new TimeLogger();       //Timer starten

        Auto meinAuto1 = new Auto();
        Auto meinAuto2 = new Auto("BMW","SN0002");

        System.out.println("Die Klasse Auto wurde " + Auto.getCreatedObjects() + " mal instanziiert.");


      System.out.println("Seit der Timer gestartet wurde sind: " + timer1.getLaufzeit() + " ms vergangen.");

    }
}
