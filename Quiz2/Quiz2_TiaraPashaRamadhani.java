package Quiz2;

import java.util.Scanner;

public class Quiz2_TiaraPashaRamadhani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] sales = {
                { 2, 3, 4, 6 },
                { 3, 3, 3, 2 },
                { 4, 4, 5, 5 },
                { 1, 3, 3, 8 },
                { 2, 2, 2, 2 }
        };
        String[] employees = { "Sito", "Semi", "Risma", "Vero", "Barri" };
        String[] month = { "January ", "February ", "March ", "April " };
        int bikePrice = 1000000;
        double febDiscount = 0.95;

        int menu = 0;
        while (menu != 3) {
            System.out.println("Menu:");
            System.out.println("1. Show sales summary");
            System.out.println("2. Show total sales per month");
            System.out.println("3. Exit");
            System.out.print("Enter menu: ");
            menu = scan.nextInt();
            scan.nextLine();

            if (menu == 1) {
                System.out.println("\nSales Summary:");
                System.out.printf("%21s %10s %7s %7s%n", month);
                for (int i = 0; i < employees.length; i++) {
                    System.out.printf("%10s", employees[i]);
                    for (int j = 0; j < sales[0].length; j++) {
                        double price = bikePrice;
                        if (j == 1) {
                            price *= febDiscount;
                        }
                        double monthlySales = sales[i][j] * price;

                        System.out.printf("%10.0f", monthlySales);
                    }
                    System.out.println();
                }
            } else if (menu == 2) {
                System.out.println("\nTotal Sales per Month:");
                for (int j = 0; j < sales[0].length; j++) {
                    double totalSales = 0;
                    for (int i = 0; i < sales.length; i++) {
                        double price = bikePrice;
                        if (j == 1) {
                            price *= febDiscount;
                        }
                        totalSales += sales[i][j] * price;
                    }
                    System.out.printf("%-10s : %.0f%n", month[j], totalSales);
                }
            } else if (menu == 3) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid menu choice. Please try again.");
            }
        }
        scan.close();
    }
}
