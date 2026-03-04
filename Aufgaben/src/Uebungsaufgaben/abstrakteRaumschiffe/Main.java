package Uebungsaufgaben.abstrakteRaumschiffe;

public class Main {
    public static void main(String[] args) {

        Raumschiff enterprise = new Enterprise(new WarpAntrieb());
        Raumschiff falcon = new MillenniumFalcon(new HyperAntrieb());
        Raumschiff galactica = new Galactica(new DieselAntrieb());

        enterprise.fliegen();
        falcon.fliegen();
        galactica.fliegen();
    }
}

