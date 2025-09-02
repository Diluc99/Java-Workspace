import java.util.*;

public class TextProcessor {
    // TO DO: Method to clean and validate input
    public static String cleanInput(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    // TO DO: Method to analyze text
    public static void analyzeText(String text) {
        String[] words = text.split(" ");
        System.out.println("Word count: " + words.length);
        System.out.println("Character count (no spaces): " + text.replace(" ", "").length());

        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println("Longest word: " + longest);
    }

    // TO DO: Method to create word array and sort alphabetically
    public static String[] getWordsSorted(String text) {
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split(" ");
        Arrays.sort(words);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO: Create a text processor that:
        // 1. Asks user for a paragraph of text
        // 2. Cleans and validates the input
        // 3. Analyzes the text (word count, character count, etc.)
        // 4. Shows the words in alphabetical order
        // 5. Allows user to search for specific words
        System.out.println("=== TEXT PROCESSOR ===");

        String input = scanner.nextLine();
        String cleaned = cleanInput(input);

        analyzeText(cleaned);

        String[] sorted = getWordsSorted(cleaned);
        System.out.println("\nSorted words: " + String.join(", ", sorted));

        System.out.print("\nEnter a word to search: ");
        String search = scanner.nextLine().toLowerCase();
        boolean found = Arrays.asList(sorted).contains(search);
        System.out.println(found ? "Word found!" : "Word not found!");

        scanner.close();
    }
}
