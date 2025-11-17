package A20_Tierverwaltungssystem.io;

import A20_Tierverwaltungssystem.model.Animal;
import A20_Tierverwaltungssystem.model.Cat;
import A20_Tierverwaltungssystem.model.Dog;
import A20_Tierverwaltungssystem.model.Parrot;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private File file;

    public FileHandler() {
        Path path = Paths.get("Aufgaben", "src", "A20_Tierverwaltungssystem", "io", "animals.txt");
        this.file = path.toFile();
    }

    public ArrayList<Animal> readFile() {
        ArrayList<Animal> animals = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            String row;
            while ((row = br.readLine()) != null) {
                String[] splitRow = row.split(";");
                String species = splitRow[0];
                String name = splitRow[1];
                int age = Integer.parseInt(splitRow[2]);
                LocalDate registrationDate = LocalDate.parse(splitRow[3]);
                LocalTime registrationTime = LocalTime.parse(splitRow[4]);
                LocalDateTime lastCheckup = LocalDateTime.parse(splitRow[5]);
                Animal animal = switch (species) {
                    case "hund" -> new Dog(name, species, age, registrationDate, registrationTime, lastCheckup);
                    case "katze" -> new Cat(name, species, age, registrationDate, registrationTime, lastCheckup);
                    case "papagei" -> new Parrot(name, species, age, registrationDate, registrationTime, lastCheckup);
                    default -> new Animal(name, species, age, registrationDate, registrationTime, lastCheckup) {
                    };
                };
                animals.add(animal);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return animals;
    }

    public void writeToFile(List<Animal> animals) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) { //das true, sagt, dass immer was angehangen werden soll
            for (Animal animal : animals) {
                bw.write(animal.toString());
                bw.newLine(); // fügt eine neue Zeile hinzu
                System.out.println("Datei erfolgreich geschrieben!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
