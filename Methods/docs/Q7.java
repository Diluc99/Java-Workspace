/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop  */
import java.util.Scanner;
public class Q7 {
    public static int calc_sum(int n){
        int result = 0;
        for(int i=0;i<=n;i++){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num =scn.nextInt();
        int sum=calc_sum(num);
        System.out.printf("The sum of first %d natural no.s is %d",num,sum);
    }
    
}
