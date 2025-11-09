package Quiz;

import java.util.Scanner;

public class Quiz1_TiaraPashaRamadhani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double calories, duration, body_weight, average_speed, altitude, running = 0.05, cycling = 0.03, swimming = 0.04, coofficient, target_calorie;

        System.out.println("Target Calories: ");
        target_calorie = scan.nextDouble();

        System.out.println("Body Weight (kg): ");
        body_weight = scan.nextDouble();
        
        System.out.println("Duration (min): ");
        duration = scan.nextDouble();
        
        System.out.println("Average Speed (km/h): ");
        average_speed = scan.nextDouble();
        
        System.out.println("Coofficient: ");
        coofficient = scan.nextDouble();

        System.out.println("Altitude (m): ");
        altitude = scan.nextDouble();
        
        calories = (duration * coofficient * body_weight) + (average_speed * 0.5) + (altitude * 0.01);
        double total_calories =  calories * running * cycling * swimming ;
        double total_running = calories * running;
        double total_cycling = calories * cycling;
        double total_swimming = calories * swimming;
        double average_calories_per_minute = total_calories / duration;
        double percentage_daily_calories_target= (total_calories / target_calorie) * 100;
        
        System.out.println("==========================================");
        System.out.println("Running Calories Burned: " + total_running);
        System.out.println("Cycling Calories Burned: " + total_cycling);
        System.out.println("Swimming Calories Burned: " + total_swimming);
        System.out.println("==========================================");
        System.out.println("Total Calories Burned: " + total_calories);
        System.out.println("==========================================");
        System.out.println("Calories Burned per minutes: " +average_calories_per_minute );
        System.out.println("==========================================");
        System.out.println("Percentage of Calories Burned: " + percentage_daily_calories_target + "%");


    }
}
