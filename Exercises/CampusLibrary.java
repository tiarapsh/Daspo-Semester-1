package Exercises;

import java.util.Scanner;

public class CampusLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String confirmStudentID, confirmRegistered;

        System.out.println("Are you bring Student ID?:");
        confirmStudentID = scan.nextLine();

        System.out.println("Are you registered online?:");
        confirmRegistered = scan.nextLine();

        if (confirmStudentID.equalsIgnoreCase("Yes") || confirmRegistered.equalsIgnoreCase("Yes")) {
            System.out.println("You are allowed to enter");
        } else {
            System.out.println("You are not allowed to enter");
        }

    }
}
