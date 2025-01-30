public class ExtractSubstring {
    public static void main(String[] args) {
        // Predefined input string
        String input = "Hello, World!";
        
        // Define the start and end indices for the substring
        int startIndex = 7; // Start extracting from the 7th character
        int endIndex = 12;  // Extract up to the 12th character (exclusive)
        
        // Extract the substring
        String substring = extractSubstring(input, startIndex, endIndex);
        
        // Print the original string and the extracted substring
        System.out.println("Original string: " + input);
        System.out.println("Extracted substring: " + substring);
    }
    public static String extractSubstring(String str, int start, int end) {
        // Use the substring() method of the String class
        return str.substring(start, end);
    }
}

