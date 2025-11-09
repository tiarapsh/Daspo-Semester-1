package Exercises;

import java.util.Scanner;

public class CloudStorage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gigabyte, terabyte = 1000, ppn = 0.11, total_price, convert, tarif = 50000, base_price;

        System.out.println("Input Gigabyte use (GB):");
        gigabyte = scan.nextDouble();

        convert = gigabyte / terabyte;
        base_price = convert * tarif;
        total_price = base_price + (base_price * ppn);   
        System.out.println("Total Price: Rp" + total_price);
    }
}
