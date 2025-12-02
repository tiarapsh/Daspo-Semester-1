package Jobsheet13;

import java.util.Scanner;

public class Cube22 {
   public static void inputGrades(int[][] grades, String[] names) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Input grades for " + names[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    public static void displayGrades(int[][] grades, String[] names) {
        System.out.println("\n=== Students' Weekly Grades ===");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(names[i] + " : ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void highestWeek(int[][] grades) {
        int highestWeek = 0;
        int highestTotal = 0;

        for (int week = 0; week < grades[0].length; week++) {
            int weekTotal = 0;

            for (int student = 0; student < grades.length; student++) {
                weekTotal += grades[student][week];
            }

            if (weekTotal > highestTotal) {
                highestTotal = weekTotal;
                highestWeek = week;
            }
        }

        System.out.println("\nWeek with the highest total grade: Week " + (highestWeek + 1));
    }

    public static void highestStudent(int[][] grades, String[] names) {
        int highestStudentIndex = 0;
        int highestSum = 0;

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }

            if (sum > highestSum) {
                highestSum = sum;
                highestStudentIndex = i;
            }
        }

        System.out.println("\nStudent with the highest total grade: " + names[highestStudentIndex]);
        System.out.println("Grades: ");
        for (int g : grades[highestStudentIndex]) {
            System.out.print(g + " ");
        }
        System.out.println("\nTotal: " + highestSum);
    }


    public static void main(String[] args) {

        String[] names = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        int[][] grades = new int[5][7]; 

        inputGrades(grades, names);
        displayGrades(grades, names);
        highestWeek(grades);
        highestStudent(grades, names);
    }
}

