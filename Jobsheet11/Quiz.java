package Jobsheet11;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1 - 10):");
                int answer = scan.nextInt();
                scan.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.println("Congratulations! You guessed the number: " + number);
            System.out.print("Do you want to play again? (y/n):");
            menu = scan.next().charAt(0);
            scan.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}
