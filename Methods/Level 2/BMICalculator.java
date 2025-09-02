import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();
        }

        calculateBMI(people);
        String[] status = getBMIStatus(people);

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " -> Weight: " + people[i][0] + " kg, Height: " + people[i][1] + " cm, BMI: " + String.format("%.2f", people[i][2]) + ", Status: " + status[i]);
        }
    }

    public static void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double heightInMeters = people[i][1] / 100;
            double bmi = people[i][0] / (heightInMeters * heightInMeters);
            people[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] people) {
        String[] status = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            double bmi = people[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
