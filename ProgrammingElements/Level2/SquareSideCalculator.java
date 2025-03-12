import java.util.Scanner; 
 
public class SquareSideCalculator { 
    public static void main(String[] args) { 
        // Create a Scanner object to read input from the user 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user to enter the perimeter of the square
                 System.out.print("Enter the perimeter of the square: ");         
                 double perimeter = scanner.nextDouble(); 
 
        // Calculate the side length  
         double sideLength = perimeter / 4; 
 
        // Display the result 
        System.out.printf("The length of the side is %.2f units whose perimeter is %.2f units.%n", sideLength, perimeter); 
 
        // Close the scanner        
         scanner.close(); 
    } 
} 
