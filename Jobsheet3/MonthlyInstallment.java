package Jobsheet3;

import java.util.Scanner;

public class MonthlyInstallment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int motorcycle_price, down_payment, loan_term, remaining_loan;
        double interest = 0.01, total_interest, total_payment, montly_installment;

        System.out.println("Input motorcycle price:");
        motorcycle_price = scan.nextInt();

        System.out.println("Input down payment:");
        down_payment = scan.nextInt();

        System.out.println("Input loan term (month):");
        loan_term = scan.nextInt();

        remaining_loan = motorcycle_price - down_payment;
        total_interest = interest * remaining_loan * loan_term;
        total_payment = remaining_loan + total_interest;
        montly_installment = total_payment / loan_term;

        System.out.println("--- Monthly Installment "+montly_installment + " ---"); 
    }
}
