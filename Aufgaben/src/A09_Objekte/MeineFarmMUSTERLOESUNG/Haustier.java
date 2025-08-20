package A09_Objekte.MeineFarmMUSTERLOESUNG;

public class Haustier {

        /*
        Du bist hier:
        [ ] a_Info
        [x] Haustier
        [ ] MeineFarm
        [ ] Main
     */

    /** Wir wollen eine Klasse Haustier anlegen, aus der wir später viele Haustier Objekte anlegen können.*/

    /** ATTRIBUTE **/
    // Wir wollen dass die Attribute immer privat sind, also von anderen Klassen nicht sichtbar.
    // Das ist vor allem deshalb so, weil wir nicht wollen dass die Werte einfach unkontrolliert
    // Verändert werden können.
    private String name;
    private String Art;
    private int size;


    /** KONSTRUKTOR **/
    // Ein Objekt wird mit einem sogenannten Konstruktor erschaffen.
    // Wenn wir keinen eigenen anlegen gibt es immer den Standarkonstruktor der so aussieht:
    public Haustier() {}
    // Wir wollen aber einen Konstruktor der gleichzeitig die Parameter setzt.
    // In der Parameterliste schreiben wir die Attribute die wir zum erstellen unseres Haustierobjektes haben wollen.
    public Haustier(String name, String Art, int size) {
        this.name = name;   // this. bezieht sich auf die Attribute der Klasse, ohne this beziehen wir uns auf die Parameter der Methode.
        this.Art = Art;
        this.size = size;
    }

    /** Getter & Setter **/
    // Stattdessen wollen wir eine kontrollierten zugriff auf die Methoden ermöglichen.
    // Dies macht man mit sogenannten Gettern & Settern.
    // Prinzipiell sind dies einfach nur öffentliche Methoden, die dazu dienen die Werte zurückzugeben
    // oder zu verändern.
    public String getName() { return this.name; }   // Methode gibt nur den Namen zurück
    public String getArt() { return this.Art; }     // Methode gibt nur die Art zurück
    public int getSize() { return this.size; }      // Methode gibt nur die größe zurück.

    public void setName(String name) { this.name = name; }
    public void setArt(String art) { Art = art; }
    public void setSize(int size) {     // Wir wollen nicht, dass ein Haustier eine negative größe haben kann.
        if(size >0){                    // Deswegen prüfen wir ob auch eine positive Zahl eingegeben wurde.
            this.size = size;           // Wir behalten also die Kontrolle über die Variable.
        }
    }


    public void gibLaut(){
        if(Art.equals("Dog")){
            System.out.println("BELL");
        }
        else if(Art.equals("Cat")){
            System.out.println("MIAU");
        }
        else{
            System.out.println("Tiergeräusch");
        }
    }


}
