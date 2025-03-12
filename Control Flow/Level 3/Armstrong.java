import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num: ");
        int UserInput = scn.nextInt();
        int num = UserInput;
        int sum = 0;
        while (num!=0) {
            int rem = num % 10;
            sum = sum+ (rem*rem*rem);
            num=num/10;
        }
        if (UserInput==sum) {
            System.out.printf("%d is Armstrong.",UserInput);
        }else{
            System.out.printf("%d is not Armstrong.",UserInput);
        }
    }
    
}
