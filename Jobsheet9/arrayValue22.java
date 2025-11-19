package Jobsheet9;

import java.util.Scanner;

public class arrayValue22 {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        int [] finalScore = new int [10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter Final Score " + i+ ": ");
            finalScore[i]= scan.nextInt();
        }
        for (int i= 0; i < 10; i++){
            System.out.println("Student " + i + " is " + finalScore[i]);
        }
    }
}
