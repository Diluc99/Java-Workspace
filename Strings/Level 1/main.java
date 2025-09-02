import java.util.Scanner;
class main {
   public static void main(String[] args) {       

      Scanner sc = new Scanner(System.in);


      // Take input from the user for the name and quote

      System.out.print("Enter your name and favorite quote: ");

      String name = sc.next();

      String quote = sc.nextLine().trim();


      // Display the name and quote

      System.out.println(name + " said, \"" + quote + "\"");

   }

}