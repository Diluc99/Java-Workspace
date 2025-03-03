import java.util.Scanner;
public class W3Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int counter = scn.nextInt();
        System.out.println("Count down ");

        while (counter>0) {
            System.out.println(counter);
            counter--;
        }
        
        
    }
}
