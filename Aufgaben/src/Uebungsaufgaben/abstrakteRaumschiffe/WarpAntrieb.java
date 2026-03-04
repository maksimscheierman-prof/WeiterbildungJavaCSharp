package Uebungsaufgaben.abstrakteRaumschiffe;

public class WarpAntrieb implements Antrieb {
    @Override
    public void sound() {
        System.out.println("Woooooosh! (Warp 9 engaged!)");
    }
}

