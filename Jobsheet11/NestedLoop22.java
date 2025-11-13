package Jobsheet11;

import java.util.Scanner;

public class NestedLoop22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scan.nextDouble();
            }
            System.out.println();
        }

        System.out.println("=== Temperature Data (Using foreach) ===");
        int cityIndex = 0;
        for (double[] city : temps) {
            System.out.print("City " + cityIndex + ": ");
            for (double t : city) {
                System.out.print(t + " ");
            }
            System.out.println();
            cityIndex++;
        }

        System.out.println("\n=== Average Temperature per City ===");
        cityIndex = 0;
        for (double[] city : temps) {
            double total = 0;
            for (double t : city) {
                total += t;
            }
            double average = total / city.length;
            System.out.println("City " + cityIndex + " average: " + average);
            cityIndex++;
        }

        scan.close();
    }
}
