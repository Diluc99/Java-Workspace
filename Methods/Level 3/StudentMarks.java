import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }

    public static int[][] generateMarks(int n) {
        int[][] data = new int[n][3];
        for (int i = 0; i < n; i++) {
            data[i][0] = 40 + (int)(Math.random() * 60);
            data[i][1] = 40 + (int)(Math.random() * 60);
            data[i][2] = 40 + (int)(Math.random() * 60);
        }
        return data;
    }

    public static double[][] calculateResults(int[][] data) {
        int n = data.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = data[i][0] + data[i][1] + data[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Stu\tPhysics\tChem\tMaths\tTotal\tAvg\t%\n");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}
