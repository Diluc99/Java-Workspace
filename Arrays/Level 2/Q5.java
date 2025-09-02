import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Find the count of digits
        int count = (number == 0) ? 1 : (int) Math.log10(number) + 1;
        int[] digits = new int[count];
        
        // Store digits in the array
        int index = 0;
        while (number > 0) {
            digits[index++] = (int) (number % 10);
            number /= 10;
        }
        
        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        
        System.out.println();
        scanner.close();
    }
}