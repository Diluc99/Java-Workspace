import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for n
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Calling the method
        int sum = calculateSum(n);

        // Displaying the result
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    // Method to calculate sum using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
