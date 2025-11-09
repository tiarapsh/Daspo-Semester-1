package MidTerm;

import java.util.Scanner;

public class MidTerm_TiaraPashaRamadhani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //membuat objek baruu agar bisa membaca input
        String score = "";
        String score2 = "";
        String score3 = "";
        String status1 = ""; // deklarasi variabel
        String status2 = "";
        String status3 = "";
        String StatusSemester = "";

        System.out.println("=====STUDENT DATA INPUT=====");
        System.out.print("Enter Name: ");
        String nama = scan.nextLine();
        System.out.print("Enter NIM: "); // input NIM dan nama
        String nim = scan.nextLine();

        System.out.println("\n--- Course 1: Algorithms and Programming ---");
        System.out.print("Enter UTS Score:");
        double uts1 = scan.nextDouble();
        System.out.print("Enter UAS Score:"); // input nilai UTS, UAS, dan task matkul 1
        double uas1 = scan.nextDouble();
        System.out.print("Enter Assignment Score:");
        double task1 = scan.nextDouble();

        System.out.println("\n--- Course 2: Data Structures ---");
        System.out.print("Enter UTS Score:");
        double uts2 = scan.nextDouble();
        System.out.print("Enter UAS Score:"); // input nilai UTS, UAS, dan task matkul 2
        double uas2 = scan.nextDouble();
        System.out.print("Enter Assignment Score:");
        double task2 = scan.nextDouble();

        System.out.println("\n--- Course 3: Basic English ---");
        System.out.print("Enter UTS Score:");
        double uts3 = scan.nextDouble();
        System.out.print("Enter UAS Score:"); // input nilai UTS, UAS, dan task matkul 2
        double uas3 = scan.nextDouble();
        System.out.print("Enter Assignment Score:");
        double task3 = scan.nextDouble();

        double FinalScore1 = (uts1 * 0.3) + (uas1 * 0.4) + (task1 * 0.3);
        double FinalScore2 = (uts2 * 0.3) + (uas2 * 0.4) + (task2 * 0.3);       // hitung final score dikali dengan masing masing bobot
        double FinalScore3 = (uts3 * 0.3) + (uas3 * 0.4) + (task3 * 0.3);

        if (FinalScore1 > 80 && FinalScore1 <= 100) {
            score = "A";
        } else if (FinalScore1 > 73 && FinalScore1 <= 80) {
            score = "B+";
        } else if (FinalScore1 > 65 && FinalScore1 <= 73) {
            score = "B";
        } else if (FinalScore1 > 60 && FinalScore1 <= 65) {        // menentukan grade berdasarkan final score matkul 1
            score = "C+";
        } else if (FinalScore1 > 50 && FinalScore1 <= 60) {
            score = "C";
        } else if (FinalScore1 > 39 && FinalScore1 <= 50) {
            score = "D";
        } else if (FinalScore1 <= 39) {
            score = "E";
        }

        if (FinalScore2 > 80 && FinalScore2 <= 100) {
            score2 = "A";
        } else if (FinalScore2 > 73 && FinalScore2 <= 80) {
            score2 = "B+";
        } else if (FinalScore2 > 65 && FinalScore2 <= 73) {
            score2 = "B";
        } else if (FinalScore2 > 60 && FinalScore2 <= 65) {       // menentukan grade berdasarkan final score matkul 2
            score2 = "C+";
        } else if (FinalScore2 > 50 && FinalScore2 <= 60) {
            score2 = "C";
        } else if (FinalScore2 > 39 && FinalScore2 <= 50) {
            score2 = "D";
        } else if (FinalScore2 <= 39) {
            score2 = "E";

        }if (FinalScore3 > 80 && FinalScore3 <= 100) {
            score3 = "A";
        } else if (FinalScore3 > 73 && FinalScore3 <= 80) {
            score3 = "B+";
        } else if (FinalScore3 > 65 && FinalScore3 <= 73) {
            score3 = "B";
        } else if (FinalScore3 > 60 && FinalScore3 <= 65) {       // menentukan grade berdasarkan final score matkul 3
            score3 = "C+";
        } else if (FinalScore3 > 50 && FinalScore3 <= 60) {
            score3 = "C";
        } else if (FinalScore3 > 39 && FinalScore3 <= 50) {
            score3 = "D";
        } else if (FinalScore3 <= 39) {
            score3 = "E";
        }

        if (FinalScore1 <= 60) {
            status1 = "NOT PASSED";
        } else if (FinalScore1 >= 60) {                            // menentukan status berdasarkan final score matkul 1
            status1 = "PASS";
        }

        if (FinalScore2 <= 60) {
            status2 = "NOT PASSED";
        } else if (FinalScore2 >= 60) {                          // menentukan status berdasarkan final score matkul 2
            status2 = "PASS";
        }

        if (FinalScore3 <= 60) {
            status3 = "NOT PASSED";
        } else if (FinalScore3 >= 60) {                          // menentukan status berdasarkan final score matkul 3
            status3 = "PASS";
        }

        double AverageScore = (FinalScore1 + FinalScore2 + FinalScore3) / 3;

        if (status1.equals("PASS") && status2.equals("PASS") && status3.equals("PASS")) {
            if (AverageScore >= 70) {
                StatusSemester = "PASSED";          // menentukan status semester berdasarkan status matkul dan average score
            } else {
                StatusSemester = "NOT PASSED";
            }
        } else {
            StatusSemester = "NOT PASSED";
        }

        System.out.println("\n==================================== ACADEMIC ASSESSMENT RESULTS =====================================");
        System.out.println("Name : " + nama);
        System.out.println("NIM : " + nim);
        System.out.printf("%-28s %-15s %-12s %-12s %-14s %-8s %-8s%n", "Course", "Mid Term Exam", "Final Exam", "Assignment", "Final Score", "Grade", "Status");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-28s %-15.0f %-12.0f %-12.0f %-14.2f %-8s %-8s%n", "Algorithms and Programming", uts1, uas1, task1, FinalScore1, score,status1);
        System.out.printf("%-28s %-15.0f %-12.0f %-12.0f %-14.2f %-8s %-8s%n","Data Structures", uts2, uas2, task2, FinalScore2, score2, status2);
        System.out.printf("%-28s %-15.0f %-12.0f %-12.0f %-14.2f %-8s %-8s%n","Basic English", uts3, uas3, task3, FinalScore3, score3, status3);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Average Final Score : " + AverageScore);
        System.out.println("Semester Status     : " + StatusSemester);
        System.out.println("==========================================================================");

    }
}
