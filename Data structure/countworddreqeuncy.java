import java.util.*;

public class countworddreqeuncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine().toLowerCase();

        Map<String, Integer> wordCount = new HashMap<>();

        String word = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is alphabet or digit, keep building the word
            if (Character.isLetterOrDigit(ch)) { //!= ' '
                word += ch;
            } else { 
                // End of word -> add to HashMap
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    word = ""; // reset for next word
                }
            }
        }
        
        // Handle last word if string doesn't end with punctuation/space
        if (!word.isEmpty()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
