package Jobsheet10;

import java.util.Scanner;

public class CinemaWithScanner22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int row = 0;
        int column = 0;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience data");
            System.out.println("3. Exit");
            System.out.print("Choose an menu: ");
            int menu = scan.nextInt();
            scan.nextLine();

            if (menu == 1) {
                System.out.print("Enter name:");
                String name = scan.nextLine();

                while (true){

                    System.out.print("Enter row number (1-4):");
                    row = scan.nextInt();
                    System.out.print("Enter column number(1-2):");
                    column = scan.nextInt();
                    scan.nextLine();

                    if (row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("Invalid seat position! Please enter a valid row (1-4) and column (1-2).");
                        continue;
                    } 

                    if (audience[row - 1][column - 1] != null) {
                        System.out.println("Seat already taken! Please choose another seat.");
                        continue;
                }
                    break;
                }

                audience[row - 1][column - 1] = name;
                System.out.println("Audience Added!");

            } else if (menu == 2) {
                System.out.println("\n=== Audience List ===");
                for (int i = 0; i < audience.length; i++) {
                    System.out.print("Row " + (i + 1) + ": ");
                    for (int j = 0; j < audience[i].length; j++) {
                        System.out.print((audience[i][j] != null ? audience[i][j] : "***") + " ");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid menu choice. Please try again.");
            }
        }
        scan.close();
    }
}
