package Jobsheet10;

import java.util.Scanner;

public class CinemaWithScanner22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [][] audience = new String[4][2];

        while (true){
            System.out.print("Enter name:");
            String name = scan.nextLine();
            System.out.print("Enter row number:");
            int row = scan.nextInt();
            System.out.print("Enter column number:");
            int column = scan.nextInt();
            scan.nextLine(); 

            audience[row-1][column-1] = name;
            System.out.print("Are there any other audiences to be added? (y/n):");
            String next = scan.nextLine();

            if(next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
