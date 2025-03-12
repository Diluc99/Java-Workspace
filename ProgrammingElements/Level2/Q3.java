import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter perimeter of square: ");
        double perimeter=scn.nextDouble();
        double side=perimeter/4;
        System.out.println("Side of square is: " +side);

    }
}