/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
 */
import java.util.Scanner;
import java.util.Arrays;
public class Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = scn.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = scn.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter element at position ["+i+"]["+j+"] : ");
                matrix[i][j] = scn.nextInt();
            }
        }
        int[] array = new int[rows*columns];
        int index = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("2D Array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("1D Array : "+Arrays.toString(array));
    }
}
