import java.util.*;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = countDigits(num);
        int[] digits = getDigits(num, count);

        System.out.println("Sum of digits: " + getDigitSum(digits));
        System.out.println("Sum of squares: " + getDigitSquaresSum(digits));
        System.out.println("Is Harshad Number: " + isHarshad(num, digits));

        int[][] freq = getDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0) System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int getDigitSum(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static double getDigitSquaresSum(int[] digits) {
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % getDigitSum(digits) == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}
