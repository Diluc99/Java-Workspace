/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
 */
import java.util.Scanner;
public class Q2 {
    public static int handshakes(int n){
        int handshakes_max= (n*(n-1))/2;
        return handshakes_max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int std = scn.nextInt();
        int handshake=handshakes(std);
        System.out.printf("Maximum no of handshakes for %d students is %d",std,handshake);

        
    }
    
}
