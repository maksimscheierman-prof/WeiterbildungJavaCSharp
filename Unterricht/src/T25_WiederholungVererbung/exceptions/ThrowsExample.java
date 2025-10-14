package T25_WiederholungVererbung.exceptions;

import java.io.File;
import java.io.IOException;

public class ThrowsExample {

    public void createFile() throws IOException{
        File file = new File("AbC");
        file.createNewFile();       //fordert mich auf, die Exception zu behandeln

        //Fall 1: Ich möchte die Exception direkt behandeln:
//        try{
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Fall 2: Der Aufrufer soll die Fehlerbehandlung übernehmen. Dann schreibe ich das im Methodenkopf
    }
}

class FileTester{
    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        //example.createFile(); //Aufforderung: Behandle mich!! Oder: wieder weiterschmeißen

        try{
            example.createFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}