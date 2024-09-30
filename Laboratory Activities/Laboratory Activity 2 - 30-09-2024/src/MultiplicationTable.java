import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] get_mtable(int maxsize) {
        int[][] mtable = new int[maxsize + 1][maxsize + 1];

        for (int i = 1; i <= maxsize; i++) {
            for (int j = 1; j <= maxsize; j++) {
                mtable[i][j] = i * j;
            }
        }
        return mtable;
    }

    public static void print_mtable(int[][] mtable, int maxsize) {
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxsize; i++) {
            for (int j = 1; j <= maxsize; j++) {
                System.out.printf("%4d", mtable[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int maxsize = userinput.nextInt();
        userinput.close();

        int[][] mtable = get_mtable(maxsize);
        print_mtable(mtable, maxsize);
    }
}
