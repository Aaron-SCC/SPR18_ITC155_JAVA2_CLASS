import java.io.*;
import java.util.*;

public class commonWords {
	
	// CONSTANTS GO HERE

	public static void main(String[] args) throws FileNotFoundException {// B-FLAG
		// TODO Auto-generated method stub
		System.out.println("This program compares the vocabulary of two ");
		System.out.println("text files, reporting the number of words ");
		System.out.println("in common and the percent of overlap. ");
		System.out.println("");
		
		// read the book1 into a map
		String file1 = "mobydick.txt";
		Scanner in1 = new Scanner(new File(file1));

		// read the book2 into a map
		String file2 = "hamlet.txt";
		Scanner in2 = new Scanner(new File(file2));

		
		Map<String, Integer> wordCountMap1 = getCountMap(in1);
		Map<String, Integer> wordCountMap2 = getCountMap(in2);
		
		int overlap = 0;
		
		int size1 =wordCountMap1.size();
		int size2 =wordCountMap2.size();
		

		for (String word1: wordCountMap1.keySet() ) { // DD-FLAG
			if (wordCountMap2.containsKey(word1)) {
				overlap++;
			}
	
		} // DD-FLAG
		
		// have to convert int to float for percentage calc
		double size1f = size1; 
		double size2f = size2;
		
		double percent1 = ( overlap / size1f ) * 100.0 ;
		double percent2 = ( overlap / size2f ) * 100.0;

		
		
		System.out.println("file #1 name? " + file1);
		System.out.println("file #2 name? " + file2);
		System.out.println("");
		
		System.out.println("file #1 words = " + size1);
		System.out.println("file #2 words = " + size2);		
		System.out.println("common words  = " + overlap);
		System.out.println("% of file1 in overlap = " + percent1);
		System.out.println("% of file2 in overlap = " + percent2);		

		

		

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
