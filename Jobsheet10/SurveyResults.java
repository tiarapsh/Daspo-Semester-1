package Jobsheet10;

import java.util.Scanner;

public class SurveyResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   
           int respondents = 10;
           int questions = 6;
   
           int[][] survey = new int[respondents][questions];
   
           System.out.println("=== Enter Survey Results (1–5) ===");
           for (int i = 0; i < respondents; i++) {
               System.out.println("\nRespondent #" + (i + 1));
               for (int j = 0; j < questions; j++) {
                   System.out.print("Answer for Question " + (j + 1) + ": ");
                   survey[i][j] = scan.nextInt();
               }
           }
   
           System.out.println("\n=== Average Score for Each Respondent ===");
           for (int i = 0; i < respondents; i++) {
               double sum = 0;
               for (int j = 0; j < questions; j++) {
                   sum += survey[i][j];
               }
               System.out.println("Respondent #" + (i + 1) + ": " + (sum / questions));
           }
   
           System.out.println("\n=== Average Score for Each Question ===");
           for (int j = 0; j < questions; j++) {
               double sum = 0;
               for (int i = 0; i < respondents; i++) {
                   sum += survey[i][j];
               }
               System.out.println("Question #" + (j + 1) + ": " + (sum / respondents));
           }
   
           double total = 0;
           int totalAnswers = respondents * questions;
   
           for (int i = 0; i < respondents; i++) {
               for (int j = 0; j < questions; j++) {
                   total += survey[i][j];
               }
           }
   
           System.out.println("\n=== Overall Average Score ===");
           System.out.println("Overall Average: " + (total / totalAnswers));
   
           scan.close();
       }
   }
    
