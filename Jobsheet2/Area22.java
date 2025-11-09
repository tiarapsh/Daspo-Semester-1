package Jobsheet2;

public class Area22 {
    public static void main(String[] args) {
        double width= 50, length= 100, diameter=2, side=2;

       double landArea = width * length;
        double poolArea = 2 * (Math.PI * Math.pow(diameter / 2, 2)) + 2 * (side * side);
        double grassArea = landArea - poolArea;

        System.out.println("Land Area: " + landArea  + " m^2");
        System.out.println("Pool Area: " + poolArea + " m^2");
        System.out.println("Grass Area: " + grassArea + " m^2");
    }
}
