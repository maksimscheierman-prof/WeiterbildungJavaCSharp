package Uebungsaufgaben.abstrakteRaumschiffe;

public class DieselAntrieb implements Antrieb {
    @Override
    public void sound() {
        System.out.println("Tuck-tuck-tuck-tuck... (Diesel Engine Running)");
    }
}

