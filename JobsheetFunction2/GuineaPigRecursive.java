package JobsheetFunction2;

import java.util.Scanner;

public class GuineaPigRecursive {
       static int fibonacci(int month) {
        if (month <= 2) {
            return 1; 
        }
        return fibonacci(month - 1) + fibonacci(month - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input month (e.g., 12): ");
        int month = scan.nextInt();

        int totalPairs = fibonacci(month);

        System.out.println("Total pairs of guinea pigs at month " + month + " = " + totalPairs);
    }
}
