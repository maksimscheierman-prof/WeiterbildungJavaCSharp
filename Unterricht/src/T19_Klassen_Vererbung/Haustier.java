package T19_Klassen_Vererbung;

public class Haustier {


        /*
        Du bist hier:
        [ ] a_Info
        [x] Haustier
        [ ] Katze
        [ ] Hund
        [ ] MeineFarm
        [ ] Main
     */



    /** Wir wollen eine Klasse Haustier anlegen, aus der wir später viele Haustier Objekte anlegen können.*/

    /** ATTRIBUTE **/
    private String name;        // Alle Haustiere haben einen Namen
    private int alter;           // Alle Haustiere haben ein Alter
    private int anzahlBeine;        // Alle Haustiere haben eine Anzahl Beine


    /** KONSTRUKTOR **/

    public Haustier() {}
    public Haustier(String name, int alter, int anzahlBeine) {
        this.name = name;   // this. bezieht sich auf die Attribute der Klasse, ohne this beziehen wir uns auf die Parameter der Methode.
        this.alter = alter;
        this.anzahlBeine = anzahlBeine;
    }

    /** Getter & Setter **/
    public String getName() { return this.name; }   // Methode gibt nur den Namen zurück
    public int getSize() { return this.alter; }      // Methode gibt nur die größe zurück.

    public void setName(String name) { this.name = name; }
    public void setAlter(int alter) {     // Wir wollen nicht, dass ein Haustier eine negative größe haben kann.
        if(alter >0){                    // Deswegen prüfen wir ob auch eine positive Zahl eingegeben wurde.
            this.alter = alter;           // Wir behalten also die Kontrolle über die Variable.
        }
    }

    /** Methoden **/
    // Diese Methode kann jedes Tier aufrufen.
    public void vorstellen(){
        System.out.println("Hallo, ich bin: " + this.name + " und ich bin " + this.alter + " Jahre alt.");
        System.out.print("Ich habe " + anzahlBeine + " Beine.");
        if(anzahlBeine !=4){
            System.out.println(" Und so soll es sein.");
        }else{System.out.println();} // Enter
    }



}
