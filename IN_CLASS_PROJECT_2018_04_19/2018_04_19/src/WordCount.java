import java.io.*;
import java.util.*;

public class WordCount {// A-FLAG
	
	static final int OCCURRENCES = 100;

	public static void main(String[] args) throws FileNotFoundException {// B-FLAG
		// TODO Auto-generated method stub
		
		// minimum number of occurances needed to be printed
		System.out.println("This program displays the most ");
		System.out.println("frequently occuring words from ");
		System.out.println("the book Moby Dick ");
		
		// read the book into a map
		Scanner in = new Scanner(new File("hamlet.txt"));
		//System.out.println(in);
		
		Map<String, Integer> wordCountMap = getCountMap(in);
		
		
		for (String word: wordCountMap.keySet() ) {
			int count = wordCountMap.get(word);
			if (count > OCCURRENCES ) {
				System.out.println(word + " occurs " + count + " times. ");
				
			}
			
		}

	}// B-FLAG
	
	// reads the text and return a map from words to counts
	public static Map<String, Integer> getCountMap(Scanner in) { // C-FLAG
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>() ;
		
		while (in.hasNext()) { // D-FLAG
			String word = in.next().toLowerCase();
			if(!wordCountMap.containsKey(word)){ // E-FLAG
				// this is a new word
				wordCountMap.put(word, 1);
				
			} else { // E-FLAG
				// get the count (value) for the word (key)
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);
			} // E-FLAG
			
		} // D-FLAG
		
		return wordCountMap;
		
	} // C-FLAG
	
	
	

}// A-FLAG

























