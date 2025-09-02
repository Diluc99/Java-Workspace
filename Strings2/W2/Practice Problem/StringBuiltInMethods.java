public class StringBuiltInMethods {
public static void main(String[] args) {
String sampleText = " Java Programming is Fun and Challenging! ";
// TODO: Use built-in methods to perform the following operations:
// 1. Display original string length including spaces
System.out.println(sampleText);
// 2. Remove leading and trailing spaces, show new length
String newString = sampleText.trim();
int newLen=newString.length();
System.out.println(newLen);
// 3. Find and display the character at index 5
char ch = newString.charAt(5);
System.out.println(ch);
// 4. Extract substring "Programming" from the text
System.out.println(newString.substring(5,16 ));

// 5. Find the index of the word "Fun"
System.out.println(newString.indexOf("Fun"));
// 6. Check if the string contains "Java" (case-sensitive)
//System.out.println(newString.contains("Java"));
// 7. Check if the string starts with "Java" (after trimming)

// 8. Check if the string ends with an exclamation mark
if (newString.charAt(newLen-1)=='!'){
    System.out.println("true");}
else{
        System.out.println("false");
    }
// 9. Convert the entire string to uppercase
System.out.println(newString.toUpperCase());
// 10. Convert the entire string to lowercase
System.out.println(newString.toLowerCase());
// TODO: Create a method that counts vowels using charAt()
int cnt =countVowels(newString);
System.out.println("Vowel count: "+cnt);
// TODO: Create a method that finds all occurrences of a character
// TODO: Display all results in a formatted manner
}
// TODO: Method to count vowels in a string
public static int countVowels(String text) {
 // Your code
int count =0;
String str= text.toLowerCase();
int len=str.length();
for(int i=0;i<len;i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
    count+=1;
}
return count;
}
// // TODO: Method to find all positions of a character
// public static void findAllOccurrences(String text, char target) {
// // Your code here
// }
}