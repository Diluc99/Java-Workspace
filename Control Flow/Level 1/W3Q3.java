
import java.util.Scanner;

public class W3Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter Num1: ");
        int num1 = scn.nextInt();
        System.err.println("Enter Num2: ");
        int num2 = scn.nextInt();
        System.err.println("Enter Num3: ");
        int num3 = scn.nextInt();
        if ((num1>num2)&&(num1>num3)){
System.err.println("Is the First number the largest? Yes. ");
}else if (num2>num3){
    System.err.println("Is the Second number the largest? Yes. ");
    
}
else{
System.err.println("Is the Third number the largest? Yes. ");
    }
}
}
