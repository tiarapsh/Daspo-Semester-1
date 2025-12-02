package Jobsheet13;

public class Experiment5_22 {
    static void show (String str, int...a){
        System.out.println("String: " + str);
        System.out.println("Number of arguments/parameters:" +a.length);

        for (int i:a){
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show("Programming Fundamentals 2023", 100,200);
        show("Information Technology", 1,2,3,4,5);
        show("Informatics");
    }
}
