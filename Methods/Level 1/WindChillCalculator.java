import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking temperature input
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        // Taking wind speed input
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        // Check for valid conditions
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Note: Wind chill is only defined for temperatures at or below 50°F and wind speeds above 3 mph.");
        }

        // Calculating wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying result
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
    }

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
