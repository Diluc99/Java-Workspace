/*Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
 */

import java.util.Scanner;

public class W3Q14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=scn.nextInt();
        int result =1;
        while (num>=1) {
            result *=num;
            --num;
        }
        System.out.printf("Factorial : %d",result);
        
    }
}
