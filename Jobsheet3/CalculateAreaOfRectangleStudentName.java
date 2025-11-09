package Jobsheet3;

import java.util.Scanner;
public class CalculateAreaOfRectangleStudentName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length;
        int width;
        int area;

        System.out.println("Enter the length of the rectangle:");
        length = scan.nextInt();

        System.out.println("Enter the width of the rectangle:");
        width = scan.nextInt();
        
        area = length*width;

        System.out.println("The area of the rectangle is " + area);
        scan.close();
    }
}
