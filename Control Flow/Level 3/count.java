/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
 */
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter num: ");
            int num = scn.nextInt();
            int UserInput=num;
            int count = 0;
            for (;num!=0;num/=10){
                 count++;
            }
            System.out.printf("Number of digits in %d is %d",UserInput,count);
    }
}
