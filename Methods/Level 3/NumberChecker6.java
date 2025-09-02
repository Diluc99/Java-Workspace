import java.util.Scanner;

public class NumberChecker6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Greatest factor: " + getGreatestFactor(factors));
        System.out.println("Sum of factors: " + getSum(factors));
        System.out.println("Product of factors: " + getProduct(factors));
        System.out.println("Product of cube of factors: " + getCubeProduct(factors));
        System.out.println("Is Perfect Number: " + isPerfect(num));
        System.out.println("Is Abundant Number: " + isAbundant(num));
        System.out.println("Is Deficient Number: " + isDeficient(num));
        System.out.println("Is Strong Number: " + isStrong(num));
    }

    static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    static int getGreatestFactor(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static int getProduct(int[] arr) {
        int product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    static double getCubeProduct(int[] arr) {
        double prod = 1;
        for (int x : arr) prod *= Math.pow(x, 3);
        return prod;
    }

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }
}
