import java.util.Scanner;
 public class HandshakeCalculator {

    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate and display the result
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum  of handshakes: " + handshakes);

        scanner.close();
    }
}