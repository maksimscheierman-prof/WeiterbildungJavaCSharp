package T25_WiederholungVererbung.uebungMedium;

public class Medium {
    private String title;

    public Medium(String title){
        this.title = title;
    }

    public void zeigeInfo(){
        System.out.println("Medium: " + this.title);
    }

    public String getTitle() {
        return title;
    }
}
