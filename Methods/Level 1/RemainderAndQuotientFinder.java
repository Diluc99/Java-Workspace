import java.util.Scanner;

public class RemainderAndQuotientFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Calling the method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] {quotient, remainder};
    }
}
