package A18_DungeonCrawl.world;

import A18_DungeonCrawl.game.Game;
import A18_DungeonCrawl.game.Quest;
import A18_DungeonCrawl.items.ItemFactory;
import A18_DungeonCrawl.units.Hero;
import A18_DungeonCrawl.units.Monster;
import A18_DungeonCrawl.units.MonsterFactory;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Room {
    private char[][] map;
    private int playerX, playerY;
    private List<Monster> monsters;
    private List<A18_DungeonCrawl.items.Item> items;
    private final Random random = new Random();
    private Quest quest;

    // ===================== ENTER =====================
    public boolean enter(Hero hero) {
        initializeMap();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        boolean exitReached = false;

        System.out.println("\n--- Du betrittst einen neuen Raum ---");
        if (quest != null) {
            System.out.println("Quest: " + quest.getRequirement());
        }

        while (running) {
            printMap();
            System.out.println("Bewege dich mit (W/A/S/D) oder 'Q' zum Verlassen:");
            char input = scanner.nextLine().toLowerCase().charAt(0);

            switch (input) {
                case 'q' -> running = false;
                case 'w', 'a', 's', 'd' -> {
                    exitReached = move(input, hero);
                    if (exitReached) running = false;
                }
                default -> System.out.println("Ungültige Eingabe!");
            }
        }
        leave();
        return exitReached; // Meldet, ob der Spieler den Ausgang erreicht hat
    }

    // ===================== QUEST ACCESSORS =====================
    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    // ===================== LEAVE =====================
    public void leave() {
        System.out.println("Du verlässt den Raum...");
    }

    // ===================== MAP SETUP =====================
    private void initializeMap() {
        map = new char[10][20];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = '.';
            }
        }

        // Spieler in Mitte
        playerX = map.length / 2;
        playerY = map[0].length / 2;
        map[playerX][playerY] = '@';

        // Gegner & Items platzieren
        for (int i = 0; i < 4; i++) map[random.nextInt(9)][random.nextInt(19)] = 'M';
        for (int i = 0; i < 3; i++) map[random.nextInt(9)][random.nextInt(19)] = 'I';
        map[random.nextInt(9)][random.nextInt(19)] = 'E';
    }

    private void printMap() {
        for (char[] row : map) {
            for (char c : row) System.out.print(c);
            System.out.println();
        }
    }

    // ===================== MOVEMENT =====================
    private boolean move(char dir, Hero hero) {
        int newX = playerX, newY = playerY;
        switch (dir) {
            case 'w' -> newX--;
            case 's' -> newX++;
            case 'a' -> newY--;
            case 'd' -> newY++;
            default -> { return false; }
        }

        if (newX < 0 || newX >= map.length || newY < 0 || newY >= map[0].length) {
            System.out.println("Du kannst dort nicht hin.");
            return false;
        }

        char target = map[newX][newY];
        switch (target) {
            case '.' -> movePlayer(newX, newY);
            case 'M' -> handleMonster(hero, newX, newY);
            case 'I' -> handleItem(hero, newX, newY);
            case 'E' -> {
                if (quest != null && !quest.getQuestCleared()) {
                    System.out.println("Der Ausgang ist versperrt! " +
                            "Eine mächtige Präsenz blockiert den Weg...");
                    return false;
                } else {
                    System.out.println("Du hast den Ausgang gefunden!");
                    return true;
                }
            }
        }
        return false;
    }

    // ===================== PLAYER & ACTIONS =====================
    private void movePlayer(int newX, int newY) {
        map[playerX][playerY] = '.';
        playerX = newX;
        playerY = newY;
        map[playerX][playerY] = '@';
    }

    private void handleMonster(Hero hero, int newX, int newY) {
        Monster m;

        // Falls es eine Quest gibt, z. B. den Feuerdrachen
        if (quest != null && quest.getRequirement().toLowerCase().contains("feuerdrache")) {
            // 20 % Chance, dass der Drache erscheint
            if (Math.random() < 0.2) {
                System.out.println("🔥 Der Feuerdrache erscheint! 🔥");
                m = new Monster(
                        "Feuerdrache",
                        new A18_DungeonCrawl.archetypes.Warrior(),
                        new A18_DungeonCrawl.races.Orc(),
                        new A18_DungeonCrawl.weapons.Weapon("Melee", 1, 20.0),
                        A18_DungeonCrawl.items.ItemFactory.createItems(1).get(0),
                        10, 150.0
                );
            } else {
                System.out.println("Ein Monster erscheint!");
                m = MonsterFactory.createRandomMonster();
            }
        } else {
            System.out.println("Ein Monster erscheint!");
            m = MonsterFactory.createRandomMonster();
        }

        new Game().startBattle(hero, m);
        map[newX][newY] = '.';
        movePlayer(newX, newY);

        // Quest prüfen
        if (quest != null && m.getName().equals("Feuerdrache") && m.getLifepoints() <= 0) {
            quest.clearQuest(true);
            System.out.println("✅ Quest erfüllt: " + quest.getRequirement());
        }
    }

    private void handleItem(Hero hero, int newX, int newY) {
        System.out.println("Du findest ein Item!");
        hero.addItem(ItemFactory.createItems(1).get(0));
        map[newX][newY] = '.';
        movePlayer(newX, newY);
    }
}
