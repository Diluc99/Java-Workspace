/* Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break; */

import java.util.Scanner;;
public class W3Q11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        double total=0.00;
        System.out.println("Enter num: ");
        double num= scn.nextDouble();
        while (true) {
            if (num<=0){
                break;
            }
            else{
                total+=num;
            
                System.out.println("Enter num: ");
                num=scn.nextDouble();
            }
            
        }
        System.out.printf("Total: %f",total);
    }
}
