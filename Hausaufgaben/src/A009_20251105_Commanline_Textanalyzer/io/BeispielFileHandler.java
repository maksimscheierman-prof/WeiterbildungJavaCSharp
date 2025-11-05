package A009_20251105_Commanline_Textanalyzer.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BeispielFileHandler {

    public static void readFile(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(File file, String text){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)); //das true, sagt, dass immer was angehangen werden soll
            bw.write(text);
            bw.newLine(); // fügt eine neue Zeile hinzu
            bw.close(); //notwendig, um Ressourcen zu schließen. Sonst lieber try-with-ressourcen
            System.out.println("Datei erfolgreich geschrieben!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //Den richtigen Pfad angeben.
        Path pfad = Paths.get("Hausaufgaben", "src", "A009_20251105_Commanline_Textanalyzer", "io", "beispiel.txt");
        readFile(pfad.toFile());
        writeToFile(pfad.toFile(), "Hallo");

    }
}
