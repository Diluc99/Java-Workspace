/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
 */
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    System.out.println("Enter weight in kg : ");
    double weight = scn.nextDouble();
    System.out.println("Enter height in cm : ");
    double height_cm = scn.nextDouble();
    double height_m = height_cm/100;
    double BMI = weight / (height_m*height_m);
    System.err.printf("BMI: %f",BMI);
    if(BMI<=18.4){
        System.out.println("Status: Underweight");
    }
    else if(18.5<=BMI<=24.9){
        System.out.println("Status: Normal");
    }
    else if(25<=BMI<=39.9){
        System.out.println("Status: Overweight");
    }
    else{
    System.out.println("Status: Obese");
}
    }
}
