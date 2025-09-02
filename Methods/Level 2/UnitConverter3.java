import java.util.Scanner;

public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.print("Enter weight in pounds to convert to kilograms: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in kilograms to convert to pounds: ");
        double kilograms = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kilograms));

        System.out.print("Enter volume in gallons to convert to liters: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter volume in liters to convert to gallons: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
