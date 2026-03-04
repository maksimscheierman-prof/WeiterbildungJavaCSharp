package A09_Objekte.KampkraftOriginalMaksim;

import java.util.Scanner;

public class Fight {

    //Variables
    Scanner scan = new Scanner(System.in);
    String userStrInput;
    Integer userIntInput;

    public void start() {
        Team A = new Team("A");
        Team B = new Team("B");

        fillTeam(A);
        fillTeam(B);
        fight(A, B);
        A.showTeam();
        B.showTeam();

    }

    public void fillTeam(Team team) {
        boolean done = false;
        while (!done) {
            System.out.println("Team: " + team.getName());
            System.out.println("Um Einheiten hinzufügen bitte ja eintippen!");
            userStrInput = scan.nextLine();
            if (userStrInput.equals("ja")) {
                System.out.println("Bitte Einheitnamen eingeben: ");
                userStrInput = scan.nextLine();
                System.out.println("Kampfkraft eingeben: ");
                userIntInput = scan.nextInt();
                scan.nextLine();
                team.addUnit(new Unit(userStrInput,userIntInput));
            }
            else{
                done = true;
            }
        }
    }

    public void fight(Team teamA, Team teamB){
        System.out.println("Es kämpfen Team: " + teamA.getName() + " und Team: " + teamB.getName());
        if(teamA.getPower() > teamB.getPower()){
            System.out.println("Team " + teamA.getName() + " gewinnt!");
        } else if (teamA.getPower() < teamB.getPower()) {
            System.out.println("Team " + teamB.getName() + " gewinnt!");
        }else{
            System.out.println("Unentschieden!");
        }
    }

}
