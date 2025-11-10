package T33_StringBuilder;

public class Main {
    public static void main(String[] args) {
        String input = "ssapsthcamdnullootttsinereimmargorp";

        // 1. Umdrehen
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Umdrehen: " + sb);
        // programmierenistttoollundmachtspsass

        // 2. Dopplungen entfernen
        // ttt -> tt (das erste t behalten)
        sb.delete(sb.indexOf("ttt"),sb.indexOf("ttt")+1);

        // ooll -> oll (ein o zu viel)
        sb.delete(sb.indexOf("oo"),sb.indexOf("oo")+1);

        // spass -> spaß
        sb.replace(sb.length()-2,sb.length(),"ß");

        System.out.println("Bereinigt: " + sb);

        // Jetzt steht dort sauber: programmierenisttollundmachtspass

        // 3. Leerzeichen einfügen
        sb.insert(13, " ").
        insert(17, " ").
        insert(22, " ").
        insert(26, " ").
        insert(32, " ");

        // 4. Großschreibung
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.setCharAt(sb.length()-4, Character.toUpperCase(sb.charAt(sb.length()-4)));

        // 5. Ausrufezeichen
        sb.append("!");

        System.out.println("Formatiert: " + sb);
    }
}
