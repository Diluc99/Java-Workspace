import java.util.Scanner;
public class square {
    public static int sq(int n){
        int sum =0;
        while (n!=0){
            int digit=n%10;
            sum = sum + (digit * digit);
            n/=10;
        }
            return sum;
        }
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter no.: ");
     int num = scn.nextInt(); 
      
     int result= sq(num);
        System.out.printf("Sum of square of digits: %d",result);
    }
}
