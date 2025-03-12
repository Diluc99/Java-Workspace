import java.util.Scanner;
public class Oddeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number till where you want to print");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("even numbers is "+i);
            }else{
                System.out.println("odd numbers is "+i);
            }
        }
    }
}