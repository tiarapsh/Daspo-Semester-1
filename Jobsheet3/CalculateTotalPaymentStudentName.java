package Jobsheet3;

import java.util.Scanner;

public class CalculateTotalPaymentStudentName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price, discount, discountCode = 0.15, totalPayment;

        System.out.println("Enter the price of the clotes (Rp):");
        price = scan.nextDouble();

        discount = price * discountCode;
        totalPayment = price - discount;

        System.out.println("Original Price: Rp" + price);
        System.out.println("Discount (15%): Rp" + discount);
        System.out.println("Total to be paid: Rp" + totalPayment);
    }
}
