import java.util.*;
public class StringManipulation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence with mixed formatting, numbers, and punctuation:");
String input = scanner.nextLine();
// 1. trim()
String trimmed = input.trim();
System.out.println("Trimmed: " + trimmed);
// 2. replace() - Replace all spaces with underscores
String underscored = trimmed.replace(" ", "_");
System.out.println("Underscored: " + underscored);

// 3. replaceAll() - Remove all digits using regex
String noDigits = trimmed.replaceAll("\\d", "");
System.out.println("No Digits: " + noDigits);
// 4. split() - Split into words
String[] words = noDigits.split("\\s+");
System.out.println("Words Array: " + Arrays.toString(words));
// 5. join() - Rejoin with " | "
String rejoined = String.join(" | ", words);
System.out.println("Rejoined with '|': " + rejoined);
// Additional Processing
String noPunctuation = removePunctuation(trimmed);
System.out.println("No Punctuation: " + noPunctuation);
String capitalized = capitalizeWords(noPunctuation);
System.out.println("Capitalized Words: " + capitalized);
String reversed = reverseWordOrder(trimmed);
System.out.println("Reversed Word Order: " + reversed);
System.out.println("Word Frequency:");
countWordFrequency(trimmed);
scanner.close();
}
// Remove all punctuation
public static String removePunctuation(String text) {
return text.replaceAll("\\p{Punct}", "");
}
// Capitalize first letter of each word
public static String capitalizeWords(String text) {
String[] words = text.toLowerCase().split("\\s+");
StringBuilder sb = new StringBuilder();
for (String word : words) {
if (!word.isEmpty()) {
sb.append(Character.toUpperCase(word.charAt(0)))
.append(word.substring(1)).append(" ");
}
}
return sb.toString().trim();

}
// Reverse the order of words
public static String reverseWordOrder(String text) {
String[] words = text.trim().split("\\s+");
List<String> wordList = Arrays.asList(words);
Collections.reverse(wordList);
return String.join(" ", wordList);
}
// Count word frequency
public static void countWordFrequency(String text) {
String cleaned = text.toLowerCase().replaceAll("\\p{Punct}", "");
String[] words = cleaned.split("\\s+");
Map<String, Integer> frequency = new HashMap<>();
for (String word : words) {
frequency.put(word, frequency.getOrDefault(word, 0) + 1);
}
for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}