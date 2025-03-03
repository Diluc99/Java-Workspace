import java.util.Scanner;
public class W3Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int counter = scn.nextInt();
        System.out.println("Count down ");

        for (;counter>0;counter--) {
            System.out.println(counter);
        }
            
    }
}
