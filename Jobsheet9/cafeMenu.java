package Jobsheet9;

import java.util.Scanner;

public class cafeMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] menu = {
            "Fried Rice", 
            "Fried Noodles", 
            "Toasted Bread", 
            "Fried Potatoes", 
            "Teh Tarik", 
            "Cappuccino", 
            "Chocolate Ice"
        };

        System.out.print("Enter the menu item you want to search for: ");
        String searchItem = scan.nextLine();

        boolean found = false;
        int indexFound = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) { 
                found = true;
                indexFound = i;
                break;
            }
        }

        if (found) {
            System.out.println("Item found! \"" + searchItem + "\" is available on the menu (index " + indexFound + ").");
        } else {
            System.out.println("Sorry, the item \"" + searchItem + "\" is NOT on the menu.");
        }
    }
}
