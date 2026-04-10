import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   // create scanner
        
        String line = sc.nextLine();           // read full line
        line = line.toLowerCase();             // optional normalization
        
        String[] words = line.split("\\s+");   // split words
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        
        // print result
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}
