public class StringArrays {
    // TO DO: Create a method that takes a string array of names
    // and returns the longest name
    public static String findLongestName(String[] names) {
        String longest = names[0];
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    // TO DO: Create a method that counts how many names
    // start with a given letter (case-insensitive)
    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        char target = Character.toLowerCase(letter);
        for (String name : names) {
            if (Character.toLowerCase(name.charAt(0)) == target) {
                count++;
            }
        }
        return count;
    }

    // TO DO: Create a method that formats all names to "Last, First" format
    // Assume names are given as "First Last"
    public static String[] formatNames(String[] names) {
        String[] formatted = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            if (parts.length == 2) {
                formatted[i] = parts[1] + ", " + parts[0];
            } else {
                formatted[i] = names[i]; // leave unchanged if not in "First Last" format
            }
        }
        return formatted;
    }

    public static void main(String[] args) {
        Str
