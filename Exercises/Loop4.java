package Exercises;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                sum += j * j;
            }

            System.out.println("n = " + i + " => sum of squares = " + sum);
        }
        input.close();
    }
}
