package JobsheetFunction2;

public class DescendingSequenceRecursive {
      static void printRecursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        printRecursive(n - 1); 
    }
    
    static void printIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Recursive:");
        printRecursive(n);

        System.out.println("\nIterative:");
        printIterative(n);
    }
}
