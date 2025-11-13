package Jobsheet11;

import java.util.Scanner;

public class SumLoop {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                sum += j * j;
            }

            System.out.println("n = " + i + " => sum of squares = " + sum);
        }
        scan.close();
    }
}
