import java.util.Scanner;

public class TriangleRun {

    // Method to calculate the number of rounds needed to complete 5 km
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c; // in meters
        double totalDistance = 5000;  // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the 3 sides of the triangle
        System.out.print("Enter length of side A (in meters): ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter length of side B (in meters): ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter length of side C (in meters): ");
        double sideC = scanner.nextDouble();

        // Calculate and display the number of rounds
        double rounds = calculateRounds(sideA, sideB, sideC);
        System.out.printf("The athlete must complete %.2f rounds to complete a 5 km run.%n", rounds);

        scanner.close();
    }
}