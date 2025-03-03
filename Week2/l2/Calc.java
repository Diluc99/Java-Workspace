import java.util.Scanner;
class Calc{
   
   public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
     int num1 = scn.nextInt();
     int num2= scn.nextInt();
System.out.println("Addition = " + (num1+num2));
System.out.println("Subtraction = " + (num1-num2));
System.out.println("Division = " + (num1*num2));
System.out.println("Multipliction = " + (num1/num2));

}
}