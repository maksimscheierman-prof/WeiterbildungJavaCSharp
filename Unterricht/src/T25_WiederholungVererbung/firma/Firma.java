package T25_WiederholungVererbung.firma;


import T25_WiederholungVererbung.mitarbeiter.Mitarbeiter;

public class Firma extends Mitarbeiter {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter();
        mitarbeiter.faehrtZurArbeit();  //sichtbar weil public
        //mitarbeiter.faehrtBus();    nicht sichtbar, weil in einem anderen Package (protected)
        //mitarbeiter.arbeitet();     nicht sichtbar, weil in einem anderen Package (package-private)

        Firma firma = new Firma();
        firma.faehrtBus();           //nur sichtbar, weil durch protected kann man mit Hilfe von Vererbung zugreifen
        //GANZ WICHTIG: Nur über ein Firma-Objekt ist es möglich, faehrtBus aufzurufen, weil Firma von
        //Mitarbeiter erbt!! Aber auch nur, wenn die Variable firma vom Datentyp Firma ist!!

        Mitarbeiter firma2 = new Firma();
        //firma2.faehrtBus();       //wieder nicht sichtbar, weil zur Compilerzeit nur ein Mitarbeiter-Objekt!!
    }
}
