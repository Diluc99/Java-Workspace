import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] salaryData = generateSalaryAndService();
        double[][] bonusData = calculateBonusAndNewSalary(salaryData);
        displaySummary(salaryData, bonusData);
    }

    public static double[][] generateSalaryAndService() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int service = (int) data[i][1];
            double bonus = service > 5 ? 0.05 * salary : 0.02 * salary;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void displaySummary(double[][] original, double[][] updated) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < 10; i++) {
            double oldSalary = original[i][0];
            int service = (int) original[i][1];
            double bonus = updated[i][1];
            double newSalary = updated[i][0];

            System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, service, bonus, newSalary);

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("\nTotal Old Salary: " + String.format("%.2f", totalOld));
        System.out.println("Total New Salary: " + String.format("%.2f", totalNew));
        System.out.println("Total Bonus Paid: " + String.format("%.2f", totalBonus));
    }
}
