package T33_StringBuilder;

import java.util.*;

public class Hangman {

    private static final String[] HANGMAN_PICS = {
            """
              +---+
              |   |
                  |
                  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
                  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
              |   |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|   |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
                  |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
             /    |
                  |
            =========
            """,
            """
              +---+
              |   |
              O   |
             /|\\  |
             / \\  |
                  |
            =========
            GAME OVER!
            """
    };

    private static final String[] WORDS = {
            "programmieren","entwicklung","java","katze","hund","computer","website","internet","schule","lehrer",
            "tastatur","maus","bildschirm","fenster","garten","kamera","sonne","regen","wolke","sturm",
            "feuer","wasser","erde","luft","papier","stift","ordnung","arbeit","urlaub","ferien",
            "schokolade","kaffee","tee","musik","gitarre","klavier","auto","bus","bahn","flugzeug",
            "telefon","handy","fahrrad","schiff","stern","galaxie","universum","planet","rakete","roboter",
            "spiel","konsole","code","python","algorithmus","datenbank","server","cloud","kabel","energie",
            "flug","reise","strand","hotel","zimmer","wüste","insel","dschungel","vulkan","wildnis",
            "wald","berg","tal","fluss","see","meer","blume","baum","gras","feld",
            "pizza","pasta","salat","brot","suppe","kuchen","zucker","salz","pfeffer","öl",
            "motor","maschine","technik","physik","chemie","biologie","mathematik","sprache","sport","gesundheit"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        String word = WORDS[rand.nextInt(WORDS.length)];

        Set<Character> guessed = new HashSet<>();
        int fails = 0;
        final int MAX_FAILS = HANGMAN_PICS.length - 1;

        char[] display = new char[word.length()];
        Arrays.fill(display, '_');

        System.out.println("=== Hangman ===");
        System.out.println("Ein zufälliges Wort wurde gewählt!");

        while (fails < MAX_FAILS) {
            System.out.println(HANGMAN_PICS[fails]);
            System.out.println("Wort: " + String.valueOf(display));

            // ✅ Anzeige der bereits geratenen Buchstaben
            List<Character> sortedGuessed = new ArrayList<>(guessed);
            Collections.sort(sortedGuessed);
            System.out.println("Bereits geraten: " + sortedGuessed);

            System.out.print("Buchstabe raten: ");
            String input = sc.nextLine().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Bitte genau einen gültigen Buchstaben eingeben!");
                continue;
            }

            char guess = input.charAt(0);

            if (guessed.contains(guess)) {
                System.out.println("Diesen Buchstaben hast du schon probiert!");
                continue;
            }

            guessed.add(guess);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Richtig!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        display[i] = guess;
                    }
                }

                if (String.valueOf(display).equals(word)) {
                    System.out.println("\n" + String.valueOf(display));
                    System.out.println("✅ Glückwunsch! Du hast das Wort erraten!");
                    break;
                }

            } else {
                System.out.println("Falsch!");
                fails++;
            }
        }

        if (fails == MAX_FAILS) {
            System.out.println(HANGMAN_PICS[fails]);
            System.out.println("❌ Das Wort war: " + word);
        }
    }
}
