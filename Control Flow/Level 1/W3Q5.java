import java.util.Scanner;
public class W3Q5 {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scn.nextInt();
        if (age>=18){
            System.out.println("The person can vote.");
        } else{
        System.out.println("The person can not vote.");
    }
}
}
