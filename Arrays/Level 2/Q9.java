import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] marks = new int[numStudents][3]; // Stores marks for Physics, Chemistry, Maths
        double[][] studentData = new double[numStudents][2]; // Stores percentage and grade index
        String[] grades = {"F", "D", "C", "B", "A"};
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks must be a positive value.");
                    }
                } while (marks[i][j] < 0);
            }
            
            // Calculate percentage
            studentData[i][0] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            // Determine grade index
            if (studentData[i][0] >= 90) {
                studentData[i][1] = 4;
            } else if (studentData[i][0] >= 80) {
                studentData[i][1] = 3;
            } else if (studentData[i][0] >= 70) {
                studentData[i][1] = 2;
            } else if (studentData[i][0] >= 60) {
                studentData[i][1] = 1;
            } else {
                studentData[i][1] = 0;
            }
        }
        
        // Display results
        System.out.println("\nStudent Details:");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s\n", marks[i][0], marks[i][1], marks[i][2], studentData[i][0], grades[(int) studentData[i][1]]);
        }
        
        scanner.close();
    }
}
