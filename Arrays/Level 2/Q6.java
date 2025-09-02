import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();
        
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            
            // Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            
            // Determine weight status
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results
        System.out.println("\nPerson Details:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmiValues[i], weightStatus[i]);
        }
        
        scanner.close();
    }
}