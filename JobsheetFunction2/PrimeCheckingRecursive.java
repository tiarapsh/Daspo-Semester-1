package JobsheetFunction2;

import java.util.Scanner;

public class PrimeCheckingRecursive {
     static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false; 
        }
        if (divisor == 1) {
            return true; 
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1); 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = scan.nextInt();

        boolean result = isPrime(n, n - 1);

        if (result) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }
}
