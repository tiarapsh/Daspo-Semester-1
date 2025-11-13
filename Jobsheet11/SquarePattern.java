package Jobsheet11;

import java.util.Scanner;

public class SquarePattern {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        // Ulangi input sampai N >= 3
        while (true) {
            System.out.print("Enter N (minimum 3): ");
            N = input.nextInt();

            if (N <= 3) {
                System.out.println("N must be at least 3, please input other value.");
                continue; 
            }

            break;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.printf("%3d", N);
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println();
        }

        input.close();
    }
}