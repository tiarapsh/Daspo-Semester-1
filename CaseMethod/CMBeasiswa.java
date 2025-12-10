package CaseMethod;

import java.util.Scanner;

public class CMBeasiswa {
    static int applicant = 0;
    static String[] name = new String[100];
    static String[] id = new String[100];
    static double[] gpa = new double[100];
    static String[] type = new String[100];
    static int[] income = new int[100];
    static Scanner scan = new Scanner(System.in);

    static void showMenu() {
        System.out.println("\n===================================");
        System.out.println("     SCHOLARSHIP REGISTRATION     ");
        System.out.println("===================================");
        System.out.println("1. Add new applicant");
        System.out.println("2. Show all applicants");
        System.out.println("3. Search applicants by scholarship type");
        System.out.println("4. Calculate average GPA per scholarship type");
        System.out.println("0. Exit");
    }

    static void addNew() {
        System.out.println("\n=== Add New Scholarship Applicant ===");

        System.out.print("Student Name : ");
        name[applicant] = scan.nextLine();

        System.out.print("Student ID : ");
        id[applicant] = scan.nextLine();

        do {
            System.out.print("Latest GPA (0.0 - 4.0): ");
            gpa[applicant] = scan.nextDouble();
            scan.nextLine();
            if (gpa[applicant] < 0 || gpa[applicant] > 4) {
                System.out.println("Error: GPA must be between 0.0 and 4.0!");
            }
        } while (gpa[applicant] < 0 || gpa[applicant] > 4);

        int typeChoice;
        do {
            System.out.println("Choose scholarship type:");
            System.out.println("1. Regular");
            System.out.println("2. Excellence");
            System.out.println("3. Research");
            System.out.print("Input your choice (1-3): ");
            typeChoice = scan.nextInt();
            scan.nextLine();

            switch (typeChoice) {
                case 1:
                    type[applicant] = "Regular";
                    break;
                case 2:
                    type[applicant] = "Excellence";
                    break;
                case 3:
                    type[applicant] = "Research";
                    break;
                default:
                    System.out.println("Error: Invalid choice! Please enter 1-3.");
                    typeChoice = 0;
            }
        } while (typeChoice < 1 || typeChoice > 3);

        do {
            System.out.print("Parent's income (max 2000000): Rp ");
            income[applicant] = scan.nextInt();
            scan.nextLine();
            if (income[applicant] < 0 || income[applicant] > 2000000) {
                System.out.println("Error: Income must be between 0 and 2000000!");
            }
        } while (income[applicant] < 0 || income[applicant] > 2000000);

        applicant++;
        System.out.println("\nApplicant data has been added successfully!");
    }

    static void showData() {
        if (applicant == 0) {
            System.out.println("\nNo applicant data yet!");
            return;
        }

        System.out.println("\n=== List of All Scholarship Applicants ===");
        System.out.printf("%-5s %-20s %-12s %-6s %-18s %-15s%n",
                "No", "Name", "Student ID", "GPA", "Scholarship Type", "Income");
        System.out
                .println("==========================================================================================");

        for (int i = 0; i < applicant; i++) {
            String displayName = name[i];
            if (displayName.length() > 18) {
                displayName = displayName.substring(0, 15) + "...";
            }

            System.out.printf("%-5d %-20s %-12s %-6.2f %-18s %-12d%n",
                    i + 1,
                    displayName,
                    id[i],
                    gpa[i],
                    type[i],
                    income[i]);
        }
        System.out.println("Total applicants: " + applicant);
    }

    static void searchData() {
        if (applicant == 0) {
            System.out.println("\nNo data yet!");
            return;
        }

        System.out.println("\n=== Search Applicants by Scholarship Type ===");
        int searchChoice;
        String searchType = "";

        do {
            System.out.println("Choose scholarship type to search:");
            System.out.println("1. Regular");
            System.out.println("2. Excellence");
            System.out.println("3. Research");
            System.out.print("Input your choice (1-3): ");
            searchChoice = scan.nextInt();
            scan.nextLine();

            switch (searchChoice) {
                case 1:
                    searchType = "Regular";
                    break;
                case 2:
                    searchType = "Excellence";
                    break;
                case 3:
                    searchType = "Research";
                    break;
                default:
                    System.out.println("Error: Invalid choice! Please enter 1-3.");
                    searchChoice = 0;
            }
        } while (searchChoice < 1 || searchChoice > 3);

        System.out.println("\n=== Search Results for " + searchType + " Scholarship ===");
        boolean found = false;
        int count = 0;

        for (int i = 0; i < applicant; i++) {
            if (type[i].equalsIgnoreCase(searchType)) {
                if (!found) {
                    System.out.println("-------------------");
                    found = true;
                }
                System.out.println(" Name        : " + name[i]);
                System.out.println(" Student ID  : " + id[i]);
                System.out.println(" GPA         : " + String.format("%.2f", gpa[i]));
                System.out.println(" Income      : " + String.format("%d", income[i]));
                System.out.println("-------------------");
            }
        }
        if (!found) {
            System.out.println("No applicants found for " + searchType + " scholarship.");
        }
    }

    static void averageGPA() {
        if (applicant == 0) {
            System.out.println("\nNo data yet!");
            return;
        }

        double totalRegular = 0, totalExcellence = 0, totalResearch = 0;
        int countRegular = 0, countExcellence = 0, countResearch = 0;

        for (int i = 0; i < applicant; i++) {
            if (type[i].equalsIgnoreCase("Regular")) {
                totalRegular += gpa[i];
                countRegular++;
            } else if (type[i].equalsIgnoreCase("Excellence")) {
                totalExcellence += gpa[i];
                countExcellence++;
            } else if (type[i].equalsIgnoreCase("Research")) {
                totalResearch += gpa[i];
                countResearch++;
            }
        }

        System.out.println("\n=== Average GPA per Scholarship Type ===");

        if (countRegular == 0) {
            System.out.println("No applicant for Regular Scholarship.");
        } else {
            System.out.println("Average GPA for Regular Scholarship: " +
                    String.format("%.1f", totalRegular / countRegular));
        }

        if (countExcellence == 0) {
            System.out.println("No applicant for Excellence Scholarship.");
        } else {
            System.out.println("Average GPA for Excellence Scholarship: " +
                    String.format("%.1f", totalExcellence / countExcellence));
        }

        if (countResearch == 0) {
            System.out.println("No applicant for Research Scholarship.");
        } else {
            System.out.println("Average GPA for Research Scholarship: " +
                    String.format("%.1f", totalResearch / countResearch));
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("\nYour choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    searchData();
                    break;
                case 4:
                    averageGPA();
                    break;
                case 0:
                    System.out.println("Thank you. Program finished.");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please enter 0-4.");
            }
        } while (choice != 0);

        scan.close();
    }

}
