package T25_WiederholungVererbung.exceptions;

import java.io.File;
import java.io.IOException;

public class ThrowsExample {

    private File file;

    public void createFile() throws IOException {
        file = new File("AbC");
        file.createNewFile();       //fordert mich auf, die Exception zu behandeln

        //Fall 1: Ich möchte die Exception direkt behandeln:
//        try{
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Fall 2: Der Aufrufer soll die Fehlerbehandlung übernehmen. Dann schreibe ich das im Methodenkopf
    }

    public void writeToFile(){
        throw new RuntimeException("Die File existiert nicht");
    }
}

class FileTester {
    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        //example.createFile(); //Aufforderung: Behandle mich!! Oder: wieder weiterschmeißen

        example.writeToFile();
        try {
            example.createFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}