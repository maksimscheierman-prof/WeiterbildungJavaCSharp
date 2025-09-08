package A10_Queue_Hashmap.TelefonbuchMUSTERLOESUNG;

public class Kontakt {
    private String name;
    private String number;
    private String email;
    private String notizen;

    // Konstruktor
    public Kontakt(String name, String number, String email, String notizen) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.notizen = notizen;
    }


    public void printInfos(){
        System.out.println(
                "Name: " + this.name +
                        "Nummer: " + this.number +
                        "E-Mail: " + this.email +
                        "Notizen: " + this.notizen
        );
    }

}
