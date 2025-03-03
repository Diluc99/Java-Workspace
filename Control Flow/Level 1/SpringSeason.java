import java.util.Scanner;
public class SpringSeason{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month =scn.nextInt();
        System.out.println("Enter date: ");
    int date =scn.nextInt();

    if(month>=3&&date>=20&&month<=6&&date<=20){
        
        System.out.println("It's a spring Season");
    }
    else{
        System.out.println("Not a spring Season");

    }
    }
}



    