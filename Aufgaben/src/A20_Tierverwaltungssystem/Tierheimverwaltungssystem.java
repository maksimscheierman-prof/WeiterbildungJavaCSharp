package A20_Tierverwaltungssystem;

import A20_Tierverwaltungssystem.console.ConsoleApp;
import A20_Tierverwaltungssystem.service.AnimalService;


public class Tierheimverwaltungssystem {

    private static final AnimalService service = new AnimalService();

    public static void main(String[] args) {
        ConsoleApp consoleApp = new ConsoleApp(service);
        consoleApp.run();
    }
}
