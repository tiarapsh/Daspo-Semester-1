package Exercises;

public class Exercise1Loop {
    public static void main(String[] args) {
        
//         Create a flowchart to track students' study time at home. Each day, students enter their daily study hours. The program should calculate and display the total study hours for the week. If a student studies more than 10 hours in a day, the program should ignore the input and ask for re-entering, as it is considered impossible.
// Note: Loops can be for, while, or do-while. Add break or continue loops if necessary.

        int totalStudyHours = 0;
        int days = 7;
        int i = 1;

        while (i <= days) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter study hours for day " + i + ": ");
            int dailyHours = scanner.nextInt();
            
            if (dailyHours > 10) {
                System.out.println("Input exceeds maximum allowed hours. Please re-enter.");
                continue; 
            }
            
            totalStudyHours += dailyHours;
            i++;
        }
        
        System.out.println("Total study hours for the week: " + totalStudyHours);
    }
}
