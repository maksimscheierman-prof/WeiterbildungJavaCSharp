package InterfacePoly_Aufgaben.Medium;

class Zeitschrift extends Medium {
    private int ausgabeNummer;

    public Zeitschrift(String titel, int ausgabeNummer) {
        super(titel);
        this.ausgabeNummer = ausgabeNummer;
    }

    @Override
    public void zeigeInfo() {
        System.out.println("Zeitschrift: " + titel + ", Ausgabe " + ausgabeNummer);
    }
}
