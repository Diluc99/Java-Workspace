import java.util.*;

public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = countDigits(num);
        int[] digits = getDigits(num, count);

        System.out.println("Count of digits: " + count);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(num, digits));
        int[] maxTwo = findTwoLargest(digits);
        System.out.println("Largest: " + maxTwo[0] + ", Second Largest: " + maxTwo[1]);
        int[] minTwo = findTwoSmallest(digits);
        System.out.println("Smallest: " + minTwo[0] + ", Second Smallest: " + minTwo[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, digits.length);
        return sum == num;
    }

    public static int[] findTwoLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return new int[]{max, secondMax};
    }

    public static int[] findTwoSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return new int[]{min, secondMin};
    }
}
