package Jobsheet9;

import java.util.Scanner;

public class arrayValue22 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        int [] finalScore = new int [10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = scan.nextInt();
        }

        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            } else {
                System.out.println("Student " + i + " Failed!");
            }
        }
    }
}
