package Exercises;

import java.util.Scanner;

public class Inch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double panjang, lebar, inci = 2.54, luas, cost, price;
        
        System.out.println("Price:");
        price = scan.nextDouble();
        
        System.out.println("Input Panjang (cm):");
        panjang = scan.nextDouble();

        System.out.println("Input Lebar (cm):");
        lebar = scan.nextDouble();

        luas = (panjang / inci) * (lebar / inci);
        cost = luas * price;
        System.out.printf("Luas foto adalah %.2f inch²%n", luas);
        System.out.printf("Total harga adalah Rp %.2f%n", cost);
    }
}
