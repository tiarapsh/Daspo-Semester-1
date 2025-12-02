package Jobsheet13;

import java.util.Scanner;

public class Greetings_22 {
    public static String getGreetingRecipient(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipentName = scan.nextLine();
        scan.close();
        return recipentName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " May the force be with you!");
    }
}
