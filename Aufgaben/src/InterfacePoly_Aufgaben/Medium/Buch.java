package InterfacePoly_Aufgaben.Medium;

class Buch extends Medium {
    private String autor;

    public Buch(String titel, String autor) {
        super(titel);
        this.autor = autor;
    }

    @Override
    public void zeigeInfo() {
        System.out.println("Buch: " + titel + " von " + autor);
    }

    public String getAutor() {
        return autor;
    }
}
