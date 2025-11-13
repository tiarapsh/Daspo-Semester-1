package Jobsheet11;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Input N (minimum 5): ");
            N = scan.nextInt();

            if (N <= 5) {
                System.out.println("N must be at least 5, please input other value.");
                continue; 
            }

            break; 
        }

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}