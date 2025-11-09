package Exercises;

import java.util.Scanner;

public class Execise2Loop {
    public static void main(String[] args) {
        Scanner scan = new java.util.Scanner(System.in);
        
        while (true) {
            System.out.print("Enter hours worked (negative to exit): ");
            int hoursWorked = scan.nextInt();
            if (hoursWorked < 0) {
                System.out.println("Exiting program.");
                break; 
            }
            System.out.print("Enter daily salary: ");
            double dailySalary = scan.nextDouble();
            
            double bonus = 0;
            if (hoursWorked > 8) {
                bonus = dailySalary * 0.2; 
            }
            
            System.out.println("Bonus for the day: $" + bonus);
        }
 
    }
    
}
