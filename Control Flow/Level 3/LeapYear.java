/*Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=scn.nextInt();
        if (year>=1582){
            if ((year%4==0 && year%100!=0) || year%400==0){
                System.out.printf("%d is a leap year.",year);
            } else {
            System.out.printf("%d is not a leap year.",year);
            }
        } else{
            System.out.println("Year must be greater than 1582");
        }
        
    }
}
