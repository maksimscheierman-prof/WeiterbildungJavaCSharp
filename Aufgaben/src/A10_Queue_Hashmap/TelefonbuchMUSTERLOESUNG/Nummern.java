package A10_Queue_Hashmap.TelefonbuchMUSTERLOESUNG;

public class Nummern {
    private String name;
    private String nummer;

    public Nummern(String name, String nummer){
        this.name = name;
        this.nummer = nummer;
        }

    public String getName() {return name;}
    public String getNummer() {return nummer;}
    public void setName(String name) {this.name = name;}
    public void setNummer(String nummer) {this.nummer = nummer;}
}
