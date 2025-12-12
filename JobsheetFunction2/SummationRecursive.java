package JobsheetFunction2;

import java.util.Scanner;

public class SummationRecursive {
     static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scan.nextInt();

        int result = sum(n);

        printSeries(n);
        System.out.println(" = " + result);
    }
}
