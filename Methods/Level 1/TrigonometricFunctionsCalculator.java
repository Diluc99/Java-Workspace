import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking angle input
        System.out.print("Enter angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        // Calculating trigonometric values
        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        // Displaying results
        System.out.printf("Sine(%.2f°) = %.4f\n", angleInDegrees, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angleInDegrees, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angleInDegrees, results[2]);
    }

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] {sine, cosine, tangent};
    }
}
