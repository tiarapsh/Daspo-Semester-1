package JobsheetFunction2;

import java.util.Scanner;

public class PowerRecursive22 {
         public static int calculatePower(int base, int power) {
        if (power == 0) {
            return 1;  
        }
        return base * calculatePower(base, power - 1);
    }

      public static void printSeries(int base, int power) {
        for (int i = 0; i < power; i++) {
            System.out.print(base + "x");
        }
        System.out.print("1"); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int base = input.nextInt();

        System.out.print("Power: ");
        int power = input.nextInt();

        System.out.print("Series: ");
        printSeries(base, power);

        int result = calculatePower(base, power);

        System.out.println(" = " + result);
    }
}
