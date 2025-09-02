import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number > 0) {
            if (index == maxDigit) {
                // Increase maxDigit size by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                
                // Copy elements to new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                // Assign new array to digits
                digits = temp;
            }
            
            digits[index++] = (int) (number % 10);
            number /= 10;
        }
        
        // Find the largest and second-largest numbers
        if (index < 2) {
            System.out.println("Not enough digits to determine largest and second largest.");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        scanner.close();
    }
}