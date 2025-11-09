package Jobsheet2;
import java.util.Scanner;

public class Triangle22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base,height;
        float area;

        System.out.print("Input base: ");
        base = scan.nextInt();
        System.out.print("Input height: ");
        height = scan.nextInt();

        area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
    }
}
