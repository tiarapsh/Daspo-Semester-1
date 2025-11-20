package Jobsheet9;

import java.util.Scanner;

public class orderCafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int numOrders = scan.nextInt();
        scan.nextLine(); 

        String[] orderNames = new String[numOrders];
        int[] orderPrices = new int[numOrders];
        int totalCost = 0;

        for (int i = 0; i < numOrders; i++) {
            System.out.print("Enter name of food/drink for order " + i + ": ");
            orderNames[i] = scan.nextLine();

            System.out.print("Enter price for " + orderNames[i] + ": ");
            orderPrices[i] = scan.nextInt();
            scan.nextLine(); 

            totalCost += orderPrices[i];
        }

        System.out.println("\n=== Order List ===");
        for (int i = 0; i < numOrders; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp" + orderPrices[i]);
        }

        System.out.println("\nTotal cost of all orders: Rp" + totalCost);
    }
}
