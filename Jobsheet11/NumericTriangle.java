package Jobsheet11;

import java.util.Scanner;

public class NumericTriangle {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N;

        while (true) {
            System.out.print("Input N (minimum 3): ");
             N = scan.nextInt();

            if (N <= 3) {
                System.out.println("N must be at least 3, please input other value.");
                continue; 
            }
            break;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
