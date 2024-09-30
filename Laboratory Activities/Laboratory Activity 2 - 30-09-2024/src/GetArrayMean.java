import java.util.Scanner;

public class GetArrayMean {
    // Function to calculate the mean of an integer array
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = userinput.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = userinput.nextInt();
        }

        double mean = getArrayMean(numbers);
        System.out.println("Mean of array is: " + mean);
    }
}
