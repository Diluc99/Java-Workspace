public class StringManipulation{
public static void main(String[] args) {
// TO DO : Create the same string "Java Programming" using 3
//different methods:
// 1. String literal
String str1 = "Java Programming";
// 2. new String() constructor
String str2 = new String("Java Programming");
// 3. Character array
char charArr[]= {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
String str3 = new String(charArr);
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
// TO DO: Compare the strings using == and .equals()
System.out.println("str1==str2: " + (str1==str2));
System.out.println("str1==str3: " + (str1 == str3));
// == opeerator compares refrences(memory address) i.e if they point to the same object in memory
System.out.println("str1.equals(str2) : " + str1.equals(str2));
System.out.println("str1.equals(str3) : " + str1.equals(str3));
//  .equals() compares the actual content of the strings

// Print the results and explain the difference
// TO DO: Create a string with escape sequences that displays:
// Programming Quote:
// "Code is poetry" - Unknown
String quote = "Programming Quote:\n \"Code is poetry\" - Unknown";
System.out.println("\n" + quote);

}
}