package chapter03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
        Map<String, Integer> wordCount = new HashMap<>();
        System.out.print("단어 ");
        String input = scan.nextLine();
        String[] words = input.split(" ");  
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
//        System.out.println(words.length + " words detected:");
        System.out.println(wordCount.size() + " distinct words detected:");
        System.out.println(wordCount);
        
        scan.close();
    }
}
