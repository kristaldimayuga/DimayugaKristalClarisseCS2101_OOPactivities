import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int maxsize = scanner.nextInt();
        int[][] mtable = new int[maxsize + 1][maxsize + 1];
        print_mtable(mtable, maxsize);
    }

    public static void print_mtable(int[][] mtable, int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                mtable[i][j] = i * j;
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.printf("%4d", mtable[i][j]);
            }
            System.out.println();
        }
    }
}
