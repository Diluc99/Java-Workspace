/*Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
 */
import java.util.Scanner;
public class W3Q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num= scn.nextInt();
        int result =1;
        for (;num>1;num--){
            result*=num;
        }
        System.out.printf("Factorial: %d",result);
    }
}
