import java.util.Scanner;
public class W3Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any natural number: ");
        int num = scn.nextInt();
        int sum=0;
        if (num>=0){
            for (int i=0;i<=num;i++){
                sum+=i;
            }
            System.out.printf("The sum of %d natural numbers is %d", num,sum);
        } else{
            System.out.printf("The number %d is not a natural number",num);
        }
    }
}
