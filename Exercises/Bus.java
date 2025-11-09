package Exercises;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance, gasoline_price_perliter = 10000, total_gasoline, tol_price = 50000, supir= 3000000, days, total_cost;

        System.out.println("Total Days: ");
        days = scan.nextDouble();

        System.out.println("Input distance (km): ");
        distance = scan.nextDouble();

        total_gasoline = distance * gasoline_price_perliter;
        total_cost = total_gasoline + tol_price + supir * days;
        
        System.out.println("Total Cost: " + total_cost);
    }

}
