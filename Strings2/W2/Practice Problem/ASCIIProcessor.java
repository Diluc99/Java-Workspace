import java.util.Scanner;
public class ASCIIProcessor {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
for (char ch : input.toCharArray()) {
int ascii = (int) ch;
System.out.println("Character: '" + ch + "' | ASCII: " + ascii);
System.out.println("Type: " + classifyCharacter(ch));
if (Character.isLetter(ch)) {
char toggled = toggleCase(ch);
System.out.println("Toggled case: '" + toggled + "' | ASCII: " + (int) toggled);

int diff = Math.abs(ch - toggled);
System.out.println("ASCII Difference: " + diff);
}
System.out.println("----------------------------");
}
// Caesar cipher example
System.out.print("Enter a string to encrypt with Caesar Cipher: ");
String caesarInput = scanner.nextLine();
System.out.print("Enter shift amount: ");
int shift = scanner.nextInt();
scanner.nextLine(); // consume leftover newline
String encrypted = caesarCipher(caesarInput, shift);
System.out.println("Encrypted (Caesar Cipher): " + encrypted);
// Display ASCII table
displayASCIITable(32, 126); // Printable characters
// Convert string to ASCII array
int[] asciiArray = stringToASCII(caesarInput);
System.out.println("ASCII Array: ");
for (int code : asciiArray) {
System.out.print(code + " ");
}
// Convert ASCII array back to string
System.out.println("\nConverted back to String: " + asciiToString(asciiArray));
scanner.close();
}
// Method to classify character type
public static String classifyCharacter(char ch) {
if (Character.isUpperCase(ch)) return "Uppercase Letter";
else if (Character.isLowerCase(ch)) return "Lowercase Letter";
else if (Character.isDigit(ch)) return "Digit";
else return "Special Character";
}
// Method to toggle case using ASCII
public static char toggleCase(char ch) {
if (Character.isUpperCase(ch)) return (char) (ch + 32);

else if (Character.isLowerCase(ch)) return (char) (ch - 32);
else return ch;
}
// Method to implement Caesar cipher
public static String caesarCipher(String text, int shift) {
StringBuilder result = new StringBuilder();
for (char ch : text.toCharArray()) {
if (Character.isLetter(ch)) {
char base = Character.isUpperCase(ch) ? 'A' : 'a';
result.append((char) ((ch - base + shift + 26) % 26 + base));
} else {
result.append(ch);
}
}
return result.toString();
}
// Method to display ASCII table
public static void displayASCIITable(int start, int end) {
System.out.println("\nASCII Table:");
for (int i = start; i <= end; i++) {
System.out.println(i + " = '" + (char) i + "'");
}
}
// Convert string to ASCII array
public static int[] stringToASCII(String text) {
int[] ascii = new int[text.length()];
for (int i = 0; i < text.length(); i++) {
ascii[i] = (int) text.charAt(i);
}
return ascii;
}
// Convert ASCII array back to string
public static String asciiToString(int[] asciiValues) {
StringBuilder sb = new StringBuilder();
for (int code : asciiValues) {
sb.append((char) code);
}
return sb.toString();

}
}