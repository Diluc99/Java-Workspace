import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        String grade;
        if (average >= 80) grade = "A (Level 4, above agency-normalized standards)";
        else if (average >= 70) grade = "B (Level 3, at agency-normalized standards)";
        else if (average >= 60) grade = "C (Level 2, below, but approaching standards)";
        else if (average >= 50) grade = "D (Level 1, well below standards)";
        else if (average >= 40) grade = "E (Level 1-, too below standards)";
        else grade = "R (Remedial standards)";
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}