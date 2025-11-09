package Jobsheet11;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);

    System.out.print("Enter the value of N:");
    int n = scan.nextInt();

    
    for ( int iOuter = 1; iOuter <=n; iOuter++){
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    
}