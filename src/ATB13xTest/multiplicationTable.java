package ATB13xTest;

public class multiplicationTable {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;

        System.out.println("Multiplication Table (1 to 10):\n");

        for (int i = 1; i <= rows; i++) {
            System.out.println("Table of "+i);
            for (int j = 1; j <= columns; j++) {
                System.out.println((i+" * "+j+" = "+i * j)); // Tab for alignment
            }
            System.out.println();

        }
    }
}
