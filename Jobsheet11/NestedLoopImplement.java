package Jobsheet11;

public class NestedLoopImplement {
    public static void main(String[] args) {
        String[][] athletes = {
            {"Andi", "Budi", "Cici", "Dewi", "Eko"},      
            {"Rina", "Sinta", "Tono", "Umar", "Vina"},     
            {"Ali", "Bambang", "Clara", "Doni", "Elis"},   
            {"Wawan", "Xenia", "Yuli", "Zaki", "Bayu"}    
        };

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        for (int i = 0; i < sports.length; i++) { 
            System.out.println("Cabang: " + sports[i]);
            for (int j = 0; j < athletes[i].length; j++) { 
                System.out.println(" - " + athletes[i][j]);
            }
            System.out.println();
        }
    }
}

