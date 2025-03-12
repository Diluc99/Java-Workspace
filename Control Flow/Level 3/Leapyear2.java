import java.util.Scanner;
public class Leapyear2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.print("ENTER THE YEAR");
        year=sc.nextInt();
        if(year>=1582){
            if((year%400==0)  || ((year%4==0) && (year%100 !=0 ))){
                System.out.printf(" %d IT IS THE LEAP YEAR",year);
            }else{
                System.out.printf("%d IT IS NOT THE LEAP YEAR ",year);
            }
        }else{
            System.out.print("ENTER YEAR GREATER THAN 1582");
        }
    }
}