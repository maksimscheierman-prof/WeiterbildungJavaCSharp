package T25_WiederholungVererbung.mitarbeiter;

import java.util.ArrayList;

public class Mitarbeiter {
    void arbeitet() {
        System.out.println("Ich arbeite einfach");
    }

    public void faehrtZurArbeit(){
        System.out.println("Ich fahre zur Arbeit");
    }

    protected void faehrtBus() {
        System.out.println("Ich fahre Bus");
    }
}

class Abteilungsleiter extends Mitarbeiter {
    private Mitarbeiter[] untergebene;

    protected void arbeitet() {
        System.out.println("Ich leite eine Abteilung");
    }

    public void faehrtLambo() {
        System.out.println("Ich fahre Lambo");
    }

    public static void main(String[] args) {
        Mitarbeiter m = new Abteilungsleiter();    //Ein Objekt der Subklasse wird wie ein Objekt der Superklasse behandelt
        m.arbeitet();                             //Nur Methoden zur Compilerzeit sichtbar (d.h. von der Klasse, die die Variable trägt)
    }
}

class TestMitarbeiter{
    public static void main(String[] args) {
        Mitarbeiter abteilungsleiter = new Abteilungsleiter();
        Mitarbeiter mitarbeiter = new Mitarbeiter();

        ArrayList<Mitarbeiter> mitarbeiterArrayList = new ArrayList<>(); //Es werden alle Subklassen in die ArrayListe akzeptiert
        mitarbeiterArrayList.add(abteilungsleiter);
        mitarbeiterArrayList.add(mitarbeiter);

        for(Mitarbeiter m: mitarbeiterArrayList){
            //Mitarbeiter m = objekt xy;
            m.arbeitet();                               //zur Laufzeit wird die richtige Methode herausgefunden.
                                                        //Es ist nämlich zur Laufzeit bekannt, welches Objekt
                                                        //hinter der Variablen steckt.

            if(m instanceof Abteilungsleiter) {
                Abteilungsleiter a = (Abteilungsleiter) abteilungsleiter;
                //auch möglich: ((Abteilungsleiter)m).faehrtLambo();
                a.faehrtLambo();
            }
        }
    }
}
