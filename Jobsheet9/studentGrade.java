package Jobsheet9;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        int[] scores = new int[numStudents];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + i + ": ");
            scores[i] = scan.nextInt();
        }
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) total / scores.length;
        System.out.println("\n=== Result Summary ===");
        System.out.println("All scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + ": " + scores[i]);
        }

        System.out.println("\nAverage score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

    }
}
