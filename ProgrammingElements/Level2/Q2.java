import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter base:" );
        int base=scn.nextInt();
    System.out.println("Enter height:" );
        int height=scn.nextInt();
        double Area=0.5*base*height;
        System.out.println("Area of triangle is: "+Area);
}
}