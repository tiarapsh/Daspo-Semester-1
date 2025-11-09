package Exercises;

import java.util.Scanner;

public class FreeWifi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userType;
        int credits;

        System.out.println("Input user type:");
        userType = scan.nextLine();

        if (userType.equalsIgnoreCase("lecturer")){
            System.out.println("WiFi access granted (lecturer)");
        } else if (userType.equalsIgnoreCase("student")) {
            System.out.println("Input number of credits taken:");
            credits = scan.nextInt();
                if (credits >= 12 ) {
                System.out.println("WiFi access granted (active student)");
                    } else if( credits < 12) {
                        System.out.println("Access denied, credits less than 12");
                    }
        }else {
            System.out.println("Access denied");
        }
    }
}
