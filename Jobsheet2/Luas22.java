package Jobsheet2;
import java.util.Scanner;
public class Luas22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width, length, diameter, side;

        System.out.println("Input wide of land (m): ");
        width = scan.nextDouble();

        System.out.println("Input length of land (m): ");
        length = scan.nextDouble();

        System.out.println("Input diameter of tree (m): ");
        diameter = scan.nextDouble();

        System.out.println("Input number of sides of tree: ");
        side = scan.nextDouble();

       double landArea = width * length;
        double poolArea = 2 * (Math.PI * Math.pow(diameter / 2, 2)) + 2 * (side * side);
        double grassArea = landArea - poolArea;

        System.out.println("Land Area: " + landArea  + " m^2");
        System.out.println("Pool Area: " + poolArea + " m^2");
        System.out.println("Grass Area: " + grassArea + " m^2");
    }
}
