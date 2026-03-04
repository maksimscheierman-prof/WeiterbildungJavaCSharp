package A09_Objekte.BibliothekMaksim;

import java.util.ArrayList;

public class Medium {
    //Attributes
    public enum Typ {
        BUCH,
        FILM,
        MUSIK
    }
    private Typ type;
    private String name;
    private Boolean isBorrowed = false;

    //Getter & Setter

    public Typ getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public Boolean getBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(Boolean borrowed) {
        if(!isBorrowed){
        isBorrowed = borrowed;}
        else{
            System.out.println("Der Titel ist schon ausgeliehen!");
        }
    }
    //Constructor
    public Medium(Typ type, String name) {
        this.type = type;
        this.name = name;
    }

    //Methods
    public static void createInitialMedia(ArrayList<Medium> allMediums){
        allMediums.add(new Medium(Typ.BUCH,"Herr der Ringe"));
        allMediums.add(new Medium(Typ.BUCH,"Eragon"));
        allMediums.add(new Medium(Typ.BUCH,"Sakrileg"));
        allMediums.add(new Medium(Typ.MUSIK,"Linkin Park"));
        allMediums.add(new Medium(Typ.MUSIK,"Beatles"));
        allMediums.add(new Medium(Typ.MUSIK,"Coldplay"));
        allMediums.add(new Medium(Typ.FILM,"Die Hard"));
        allMediums.add(new Medium(Typ.BUCH,"Schule"));
        allMediums.add(new Medium(Typ.BUCH,"Super Bad"));

    }
}
