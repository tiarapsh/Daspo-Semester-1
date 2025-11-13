package Jobsheet11;

import java.util.Scanner;

public class NestedLoop22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temps[][] = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println("Day " + (j + 1) + ": ");
                temps[i][j] = scan.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println(temps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
