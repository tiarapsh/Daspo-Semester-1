package Jobsheet9;

import java.util.Scanner;

public class linearSearch22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = 0;
        int result = -1;

        System.out.print("Enter the number of array elements: ");
        int arrayElements = scan.nextInt();
        int[] elements = new int[arrayElements];

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Enter the array element " + i + ":");
            elements[i] = scan.nextInt();
        }
        System.out.print("Enter the key you want to search for:");
        key = scan.nextInt();

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == key) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("The key is located at index: " + result);
        }
    }
}
