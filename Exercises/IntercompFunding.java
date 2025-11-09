package Exercises;

import java.util.Scanner;

public class IntercompFunding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double publication_fee = 300000, decorations = 500000, meals = 500000, price = 4000000, operational = 500000, meals_per_person = 25000, judge_honor_per_title = 75000;

        double fixed_cost = publication_fee + decorations + meals + operational;

        System.out.println("Input fix teams:");
        int fix_teams = scan.nextInt();

        double participantMeals = fix_teams * 3 * meals_per_person;
        double judgeHonor = judge_honor_per_title * fix_teams;
        double cost = participantMeals + judgeHonor;
        
        double total_budget = fixed_cost + cost;
        double funding = 0.6 * total_budget;
        double registration = 50000 * fix_teams;
        double sponsorship = total_budget - (funding + registration);

        System.out.println("Total Budget: Rp " + total_budget);
        System.out.println("Funding: Rp " + funding);
        System.out.println("Registration: Rp " + registration);
        System.out.println("Sponsorship: Rp " + sponsorship);



    }
}
