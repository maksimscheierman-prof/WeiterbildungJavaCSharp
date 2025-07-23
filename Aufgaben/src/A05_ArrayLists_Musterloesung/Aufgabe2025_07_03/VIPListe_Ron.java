package A05_ArrayLists_Musterloesung.Aufgabe2025_07_03;

import java.util.ArrayList;
import java.util.Scanner;

public class VIPListe_Ron {


        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vipListe = new ArrayList<>();
        System.out.println("\nWelcome to the VIP List\n");

                while (true) {
                        System.out.println("Please choose an option:");
                        System.out.println("1. Add VIP");
                        System.out.println("2. Remove VIP");
                        System.out.println("3. Show VIP List");
                        System.out.println("4. Search VIP");
                        System.out.println("5. Exit");
                        int choice = sc.nextInt();
                        sc.nextLine(); // Clear buffer

                        switch (choice) {
                                case 1:
                                        System.out.println("Enter the name of the VIP to add:");
                                        String vipToAdd = sc.nextLine();
                                        vipListe.add(vipToAdd);
                                        System.out.println(vipToAdd + " has been added to the VIP list.");
                                        break;
                                case 2:
                                        System.out.println("Enter the name of the VIP to remove:");
                                        String vipToRemove = sc.nextLine();
                                        if (vipListe.remove(vipToRemove)) {
                                                System.out.println(vipToRemove + " has been removed from the VIP list.");
                                        } else {
                                                System.out.println(vipToRemove + " is not in the VIP list.");
                                        }
                                        break;
                                case 3:
                                        System.out.println("Current VIP List:");
                                        for (String vip : vipListe) {
                                                System.out.println("- " + vip);
                                        }
                                        break;
                                case 4:
                                        System.out.println("Enter the name of the VIP to search:");
                                        String vipToSearch = sc.nextLine();
                                        if (vipListe.contains(vipToSearch)) {
                                                System.out.println(vipToSearch + " is in the VIP list.");
                                        } else {
                                                System.out.println(vipToSearch + " is not in the VIP list.");
                                        }
                                        break;
                                case 5:
                                        System.out.println("Exiting VIP List.");
                                        sc.close();
                                        return;
                                default:
                                        System.out.println("Invalid choice. Please select 1, 2, 3, 4, or 5.");
                        }
                }
        }
}