import java.util.Scanner;
public class Leap_2 {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter year: ");
            int year=scn.nextInt();
            
                if (year>=1582 &&((year%4==0 && year%100!=0) || year%400==0)){
                    System.out.printf("%d is a leap year.",year);
                } else {
                System.out.printf("%d is not a leap year.",year);
                }
           
            
        }
    }
    