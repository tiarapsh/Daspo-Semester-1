package Exercises;

public class AbjadLoop {
    public static void main(String[] args) {
        //Buatlah flowchart untuk menampilkan deret huruf berikut
        // a
        //bcd
        //efghi
        //jklmnop
        //qrstuvwxyz

        char huruf = 'a';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }



    }
}
