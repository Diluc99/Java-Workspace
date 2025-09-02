/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

 */
import java.util.Scanner;
public class Q4 {
    public static int round(int perimeter){
        int round= 5000/perimeter;
        return round;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three sides of triangle (in meters): ");
        int side1= scn.nextInt();
        int side2= scn.nextInt();
        int side3= scn.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds=round(perimeter);
        System.out.printf("The athelete has to complete %d rounds to complete a 5km run.",rounds);
        
    }
}
