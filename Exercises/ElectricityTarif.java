package Exercises;

import java.util.Scanner;

public class ElectricityTarif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double monthly_charged = 50000, tarif_per_kwh = 1500, vat = 0.1;

        System.out.print("Electricity used (kWh):");
        double electricity_used = scan.nextDouble();

        double total_before_tax = (monthly_charged + (tarif_per_kwh * electricity_used));
        double vat_amount = total_before_tax * vat;
        double total_cost = total_before_tax + vat_amount;

        System.out.println("Total Cost: Rp " + total_cost);
    }
}
