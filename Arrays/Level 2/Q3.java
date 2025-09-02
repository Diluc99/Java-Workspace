import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Define an array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Get last digit
            number /= 10; // Remove last digit
            index++;
        }

        // If no digits were extracted, return early
        if (index == 0) {
            System.out.println("No digits found!");
            return;
        }

        // Find largest and second largest digit
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != 0 ? secondLargest : "None"));
    }
}
