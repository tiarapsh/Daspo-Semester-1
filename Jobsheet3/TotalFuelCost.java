package Jobsheet3;

import java.util.Scanner;

public class TotalFuelCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance;
        double gasoline_consumption = 2.0; 
        double gasoline_price_perliter = 10000;       
        double total_gasoline, total_gasoline_price;

        System.out.print("Input distance (km): ");
        distance = scan.nextInt();

        total_gasoline = distance / gasoline_consumption;
        total_gasoline_price = gasoline_price_perliter * total_gasoline;

        System.out.println("\n --- Gasoline ---");
        System.out.println("Total gasoline used: " + total_gasoline + " liters");
        System.out.println("Total gasoline price: Rp " + total_gasoline_price);
    }
}
