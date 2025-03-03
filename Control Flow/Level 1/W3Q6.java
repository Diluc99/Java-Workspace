import java.util.Scanner;
public class W3Q6 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number: " );
        int num = scn.nextInt();
        if (num<0){
            System.out.println("negative");
        }else if (num>0) {
            
            System.out.println("positive");
        } else{
            System.out.println("zero");
        }
    }
}
