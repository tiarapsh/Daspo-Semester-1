package Jobsheet11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Enter the value of N:");
        int n = scan.nextInt();
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
}

}
