public class q1 {
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int[] getDigitArray(int number) {
        int digits = countDigits(number);
        int[] digitArray = new int[digits];

        for (int i = digits - 1; i >= 0; i--) {
            digitArray[i] = number % 10;
            number /= 10;
        }

        return digitArray;
    }
    public static int sumOfDigits(int[] digitArray) {
        int sum = 0;
        for (int digit : digitArray) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 9000) + 1000;
        System.out.println("Generated 4-digit number: " + randomNumber);
        int[] digits = getDigitArray(randomNumber);
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);
    }
}

