/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
 */
import java.util.Scanner;
public class Q1 {
    public static double simpleInterest(double principal,double rate,double time){
        double simpInt= (principal*rate*time)/100;
        return simpInt;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
   
     System.out.println("Enter Principal: ");
        Double Principal=scn.nextDouble();
        System.out.println("Enter Rate of interest: ");
        Double Rate=scn.nextDouble();
        System.out.println("Enter Time period(in years): ");
        Double Time=scn.nextDouble();
        
        double SI= simpleInterest(Principal,Rate,Time);
        System.out.printf("The Simple Interest is  %f for Principal %f, Rate of Interest %f and Time %f",SI,Principal,Rate,Time);
    }
}