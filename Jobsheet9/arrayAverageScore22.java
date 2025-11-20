package Jobsheet9;

import java.util.Scanner;

public class arrayAverageScore22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double total = 0;
        double average;
        int passedCount = 0;
        int failedCount = 0;
        double totalPassed = 0;
        double totalFailed = 0;
        
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        int[] score = new int[numStudents];

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + i + ":");
            score[i] = scan.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                // System.out.println("Student " + i + " Passed!");
                passedCount++;
                totalPassed += score[i];
            } else {
                // System.out.println("Student " + i + " Failed!");
                failedCount++;
                totalFailed += score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total / score.length;
        double averagePassed = totalPassed / passedCount;
        double averageFailed = totalFailed / failedCount;
        
        System.out.println("The average of students who passed is : " + averagePassed);
        System.out.println("The average of students who failed is : " + averageFailed);
    }
}
