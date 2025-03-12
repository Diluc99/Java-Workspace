/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
 */
import java.util.Scanner;
 public class Youngest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
     System.out.println("Enter ages of Amar, Akbar, and Anthony respectively: ");   
        int ageAmar=scn.nextInt();
        int ageAkbar=scn.nextInt();
        int ageAnthony=scn.nextInt();
     System.out.println("Enter heights of Amar, Akbar, and Anthony respectively: ");   
        int heightAmar=scn.nextInt();
        int heightAkbar=scn.nextInt();
        int heightAnthony=scn.nextInt();
        if (ageAmar<ageAkbar&&ageAmar<ageAnthony){
            System.out.println("Amar is the youngest amongst all.");
        }
        else if (ageAkbar<ageAmar&&ageAkbar<ageAnthony){
            System.out.println("Akbar is the youngest amongst all.");
        }else{
            System.out.println("Anthony is the youngest amongst all.");
        }
        if (heightAmar>heightAkbar&&heightAmar>heightAnthony){
            System.out.println("Amar is the tallest amongst all.");
        }
        else if (heightAkbar>heightAmar&&heightAkbar>heightAnthony){
            System.out.println("Akbar is the tallest amongst all.");
        }else{
            System.out.println("Anthony is the tallest amongst all.");
        }

    }
    
}
