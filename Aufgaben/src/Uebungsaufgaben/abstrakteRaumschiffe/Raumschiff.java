package Uebungsaufgaben.abstrakteRaumschiffe;

public abstract class Raumschiff {

    protected String name;
    protected Antrieb antrieb;

    public Raumschiff(String name, Antrieb antrieb) {
        this.name = name;
        this.antrieb = antrieb;
    }

    public void fliegen() {
        System.out.println(name + " startet den Antrieb:");
        antrieb.sound();
        System.out.println(name + " fliegt durch den Weltraum!\n");
    }
}

