package Jobsheet2;
public class BasicSalary22 {
    public static void main(String[] args) {
        int number_of_children = 3, child_allowance = 1500000;
        double pension_percentage = 0.05, basic_salary= 3000000;

        double total_allowance = child_allowance * number_of_children;
        double pension_deduction = basic_salary * pension_percentage;
        double net_salary = (basic_salary + total_allowance - pension_deduction);

        System.out.println("============================================");
        System.out.println("Child Allowance: " + total_allowance);
        System.out.println("Pension Deduction: " + pension_deduction);
        System.out.println("Net salary: " + net_salary);
    }
}
