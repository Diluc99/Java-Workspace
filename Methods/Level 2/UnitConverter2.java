import java.util.Scanner;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in yards to convert to feet: ");
        double yards = sc.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));

        System.out.print("Enter value in feet to convert to yards: ");
        double feet = sc.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));

        System.out.print("Enter value in meters to convert to inches: ");
        double meters = sc.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));

        System.out.print("Enter value in inches to convert to meters: ");
        double inches = sc.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));

        System.out.print("Enter value in inches to convert to centimeters: ");
        double inches2 = sc.nextDouble();
        System.out.println("Centimeters: " + convertInchesToCentimeters(inches2));
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
