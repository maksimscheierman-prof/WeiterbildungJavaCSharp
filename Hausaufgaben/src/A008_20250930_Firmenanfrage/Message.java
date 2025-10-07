package A008_20250930_Firmenanfrage;


public abstract class Message {
    protected String text;

    public Message(String text) {
        this.text = text;
    }


    public abstract String send();


    public abstract void display();


    public void preview(int n) {
        if (text.length() <= n) {
            System.out.println("Vorschau: " + text);
        }
        else {
            System.out.println("Vorschau: " + text.substring(0, n) + "...");
        }
    }
}