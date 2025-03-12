import java.util.Scanner;
public class Bonusemployee{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int salary;
        System.out.print("enter salary");
        salary=sc.nextInt();
        System.out.print("enter year of service");
        int a=sc.nextInt();
        double newsalary;
        if(a>5){
            System.out.print("you got 5% bonus");
            newsalary =salary* 0.05;
            System.out.println("your bonus amount is  "+ newsalary);
        }else{
            System.out.print("your year of service is less than 5 years");
        }

    }
}