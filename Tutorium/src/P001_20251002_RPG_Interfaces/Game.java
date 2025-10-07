package P001_20251002_RPG_Interfaces;

import java.util.Scanner;

public class Game {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== RPG Character Creation ===");

        System.out.print("Choose your type (Human/Orc): ");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter your character name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Choose your role (Fighter, Mage, Both): ");
        String role = scanner.nextLine().trim().toLowerCase();

        PlayerCharacter playerCharacter;

        // --- Charaktertyp erstellen (Human oder Orc) ---
        if (type.equals("orc")) {
            playerCharacter = new OrcCharacter(name);
        } else {
            playerCharacter = new HumanCharacter(name);
        }

        // --- Grundverhalten des Charakters ---
        playerCharacter.run();
        playerCharacter.jump();

        // --- Je nach Auswahl werden Interface-Fähigkeiten zugewiesen ---
        if (role.equals("fighter")) {
            createFighter(playerCharacter);
        } else if (role.equals("mage")) {
            createMage(playerCharacter);
        } else if (role.equals("both")) {
            createFighter(playerCharacter);
            createMage(playerCharacter);
        } else {
            System.out.println("Unknown role. " + name + " just lives peacefully.");
        }

        scanner.close();
    }

    /**
     * Erstellt ein Fighter-Verhalten für den gegebenen Spieler.
     *
     * Hier wird KEINE eigene Klasse wie "OrcFighter" oder "HumanFighter" definiert,
     * sondern ein sogenanntes "anonymes Objekt", dass das Interface Fighter direkt implementiert.
     *
     * → Das ist nützlich, wenn man ein Verhalten nur einmal oder dynamisch braucht.
     * → Der Code ist kompakter und wir sparen viele Klassen.
     */
    private void createFighter(PlayerCharacter playerCharacter) {
        Fighter fighter = new Fighter() {
            @Override
            public void fight() {
                System.out.println(playerCharacter.getName() + " attacks fiercely and deals " + (playerCharacter.getStrength() * 2) + " damage!");
            }

            @Override
            public void block() {
                System.out.println(playerCharacter.getName() + " blocks the attack bravely!");
            }
        };

        fighter.fight();
        fighter.block();
    }

    /**
     * Erstellt ein Mage-Verhalten für den gegebenen Spieler.
     *
     * Auch hier wird ein anonymes Objekt verwendet, dass das Interface "Mage" implementiert.
     * Das erlaubt uns, die Magie-Fähigkeiten direkt hier zu definieren,
     * ohne dafür eigene Unterklassen zu schreiben (z. B. "HumanMage" oder "OrcMage").
     */
    private void createMage(PlayerCharacter playerCharacter) {
        Mage mage = new Mage() {
            @Override
            public void summon() {
                System.out.println(playerCharacter.getName() + " summons a magical creature!");
            }

            @Override
            public void castFireball() {
                System.out.println(playerCharacter.getName() + " casts Fireball dealing " + (playerCharacter.getWillpower() * 3) + " fire damage!");
            }
        };

        mage.summon();
        mage.castFireball();
    }
}

