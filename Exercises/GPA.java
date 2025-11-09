package Exercises;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double quiz, uts, uas;

        System.out.println("Input Quiz Score: "); 
        quiz = scan.nextDouble();
        System.out.println("Input UTS Score: "); 
        uts = scan.nextDouble();
        System.out.println("Input UAS Score: "); 
        uas = scan.nextDouble();
        
        double totalAverage = (quiz * 0.3) + (uts * 0.3) + (uas * 0.4);
        System.out.println("Total Average: " + totalAverage);

    }
}
