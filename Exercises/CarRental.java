package Exercises;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double car_fee = 300000, driver_fee = 200000, fuel_fee = 1000, rental_period, distance, total_fuel, total_car_fee, total_driver_fee, total_cost;

        System.out.print("Input Rental Period:");
        rental_period = scan.nextDouble();

        System.out.print("Input Distance:");
        distance = scan.nextDouble();

        total_fuel =  fuel_fee * distance;
        total_car_fee = car_fee * rental_period;
        total_driver_fee = driver_fee * rental_period;
        total_cost = total_fuel + total_car_fee + total_driver_fee;

        System.out.println("Total Cost: Rp" +total_cost);

    }
}
