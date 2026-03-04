package A18_DungeonCrawl.game;

import A18_DungeonCrawl.archetypes.*;
import A18_DungeonCrawl.items.ItemFactory;
import A18_DungeonCrawl.races.*;
import A18_DungeonCrawl.units.*;
import A18_DungeonCrawl.weapons.Weapon;
import A18_DungeonCrawl.world.*;

import java.util.List;
import java.util.Scanner;

public class Game {
    private Hero hero;
    private List<Chapter> chapters;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Willkommen bei DUNGEON CRAWL!");
        setupHero();

        // Kapitel aus Factory laden
        chapters = ChapterFactory.createChapters();

        // Kapitel durchlaufen
        for (Chapter chapter : chapters) {
            playChapter(chapter);
        }

        System.out.println("\n✨ Du hast das Ende des Dungeons erreicht! ✨");
    }

    private void setupHero() {
        System.out.print("Wie heißt dein Held? ");
        String name = scanner.nextLine();

        System.out.println("Wähle deinen Archetyp: ");
        System.out.println("1. Warrior\n2. Mage\n3. Hunter");
        int choice = Integer.parseInt(scanner.nextLine());
        Archetype archetype = switch (choice) {
            case 1 -> new Warrior();
            case 2 -> new Mage();
            default -> new Hunter();
        };

        System.out.println("Wähle deine Rasse:");
        System.out.println("1. Human\n2. Orc\n3. Elf");
        int raceChoice = Integer.parseInt(scanner.nextLine());
        Race race = switch (raceChoice) {
            case 1 -> new Human();
            case 2 -> new Orc();
            default -> new Elf();
        };

        Weapon weapon = new Weapon("Melee", 1, 10.0);
        hero = new Hero(name, archetype, race, weapon, ItemFactory.createItems(1).get(0), 2);
        System.out.println("\nDein Held ist bereit: " + hero.getName());
    }

    // 🎬 Kapitelsteuerung
    private void playChapter(Chapter chapter) {
        System.out.println("\n===============================");
        System.out.println("Kapitel " + chapter.getNumber());
        System.out.println(chapter.getNarrative());
        System.out.println("===============================");

        if (chapter.getDecision() != null && !chapter.getDecision().isEmpty()) {
            System.out.println(chapter.getDecision());
            int choice = getChoice();
            switch (chapter.getNumber()) {
                case 1 -> handleChapter1Choice(choice);
                case 3 -> handleChapter3Choice(choice);
                case 4 -> handleChapter4Choice(choice);
                default -> System.out.println("Du schreitest weiter...");
            }
        }

        for (Room room : chapter.getRooms()) {
            boolean exitReached = room.enter(hero);
            if (exitReached) break;     // <— Raum verlassen = nächstes Kapitel
        }
    }


    private int getChoice() {
        try {
            System.out.print("Eingabe: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }

    // === Kapitel-spezifische Inhalte ===
    private void handleChapter1Choice(int choice) {
        if (choice == 1) {
            System.out.println("Du öffnest die Eisentür — ein Golem greift dich an!");
            startBattle(hero, MonsterFactory.createRandomMonster());
        } else if (choice == 2) {
            System.out.println("Hinter der hölzernen Tür wartet ein Rätsel...");
            startRiddle();
        }
    }

    private void handleChapter3Choice(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.println("Du betrittst die Tür der Schatten...");
                startBattle(hero, MonsterFactory.createRandomMonster());
                hero.restoreHealth(20);
            }
            case 2 -> startRiddle();
            case 3 -> {
                System.out.println("Ein Schattenwesen prüft dein Herz...");
                System.out.println("Es fragt: 'Was ist wichtiger? Macht oder Weisheit?' (1=Macht, 2=Weisheit)");
                int decision = getChoice();
                if (decision == 2)
                    System.out.println("Das Wesen gewährt dir einen Schutzzauber!");
                else
                    System.out.println("Das Wesen entzieht dir Kraft...");
            }
        }
    }

    private void handleChapter4Choice(int choice) {
        if (choice == 1) {
            System.out.println("Du nimmst das Artefakt. Macht durchströmt dich, doch du bist nun sein Wächter.");
            System.out.println("GAME OVER – Du bleibst für immer im Dungeon gefangen.");
            System.exit(0);
        } else {
            System.out.println("Du lässt das Artefakt zurück. Du entkommst mit reinem Gewissen.");
        }
    }

    // === Rätsel ===
    private void startRiddle() {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        System.out.println("Ein Rätsel erscheint: Was ist " + a + " + " + b + " ?");
        int answer = getChoice();
        if (answer == (a + b)) {
            System.out.println("Die Statue bewegt sich zur Seite. Du darfst weitergehen.");
        } else {
            System.out.println("Falsch! Du versuchst es erneut...");
            startRiddle();
        }
    }

    // === Kampf ===
    public void startBattle(Unit hero, Unit monster) {
        System.out.println("=== Kampf beginnt! ===");
        while (hero.getLifepoints() > 0 && monster.getLifepoints() > 0) {
            System.out.println(hero.getName() + " HP: " + hero.getLifepoints() + " | " +
                    monster.getName() + " HP: " + monster.getLifepoints());
            System.out.println("1. Angreifen  2. Fähigkeit");
            int choice = getChoice();

            if (choice == 2)
                hero.getRace().useAbility(hero, monster);
            else
                hero.fight(hero, monster);

            if (monster.getLifepoints() <= 0) break;
            monster.fight(monster, hero);
        }

        if (hero.getLifepoints() > 0)
            System.out.println("Du hast den Kampf gewonnen!");
        else {
            System.out.println("Du bist gestorben... Game Over!");
            System.exit(0);
        }
    }
}

