/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero */
import java.util.Scanner;
public class Q5 {
    public static int check_nature(int n){
        if(n>1){
        return 1;
    }
    else if (n<0) {
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        int nature = check_nature(num);
        System.out.println(nature);
    }
}
