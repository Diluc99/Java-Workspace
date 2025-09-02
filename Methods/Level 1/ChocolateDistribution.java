import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check for division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: Cannot divide chocolates among 0 children.");
            return;
        }

        // Calling the method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Displaying the result
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] {quotient, remainder};
    }
}
