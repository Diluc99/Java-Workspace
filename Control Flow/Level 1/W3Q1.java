import java.util.Scanner;

public class W3Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        if (num%5==0){
            System.out.printf("Is the number %d divisible by 5? Yes",num);
        }else{       
        System.out.printf("Is the number %d divisible by 5? No",num);
    }
    
}
}
