package Jobsheet2;
import java.util.Scanner;

public class Salary22 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int number_of_children, child_allowance;
        double pension_percentage = 0.05, basic_salary;

        System.out.print("Input basic salary: ");
        basic_salary = scan.nextDouble();

        System.out.print("Input child allowance: ");
        child_allowance = scan.nextInt();

        System.out.print("Input number of children: ");
        number_of_children = scan.nextInt();
        

        double total_allowance = child_allowance * number_of_children;
        double pension_deduction = basic_salary * pension_percentage;
        double net_salary = (basic_salary + total_allowance - pension_deduction);

        System.out.println("============================================");
        System.out.println("Child Allowance: " + total_allowance);
        System.out.println("Pension Deduction: " + pension_deduction);
        System.out.println("Net salary: " + net_salary);
    }
}
