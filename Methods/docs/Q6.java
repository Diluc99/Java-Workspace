/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false  */
import java .util.Scanner;
public class Q6 {
    public static boolean check_season(int month, int date){
        if(month>=03&&date>=20|| month<=06&& date<=20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter month(no.) and date ");
    int month = scn.nextInt();
    int date = scn.nextInt();
    boolean isSpringSeason=check_season(month, date);
    System.out.println("Spring Season: "+isSpringSeason);
    }
    
}
