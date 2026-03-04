package Präsentationen.Lambdas;

import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap {

    public static void main(String[] args) {

        Map<String, Runnable> commands = new HashMap<>();

        commands.put("start", () -> System.out.println("Start!"));
        commands.put("stop",  () -> System.out.println("Stop!"));

        commands.get("start").run();
        commands.get("stop").run();

        commands.put("pause", () -> System.out.println("Pause!")); // Aufgabe
        commands.get("pause").run();


    }
}

