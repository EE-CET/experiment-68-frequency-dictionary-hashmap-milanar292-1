import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read full line of text
        String line = sc.nextLine();
        
        // Convert to lowercase (optional but useful)
        line = line.toLowerCase();
        
        // Split words using space
        String[] words = line.split("\\s+");
        
        // Create HashMap to store frequency
        HashMap<String, Integer> freqMap = new HashMap<>();
        
        // Count frequency of each word
        for (String word : words) {
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }
        
        // Print result
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}
