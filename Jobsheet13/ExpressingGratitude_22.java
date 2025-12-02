package Jobsheet13;

import java.util.Scanner;

public class ExpressingGratitude_22 {
    public static String getGreetingRecipient(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet: ");
        String recipentName = scan.nextLine();
        scan.close();
        return recipentName;
    }
    public static void sayThankyou(){
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world. \n" + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }
    public static void sayAdditionalGreetings(String greeting){
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings("Wish you all the best!");
    }
}
