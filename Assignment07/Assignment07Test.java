import static org.junit.Assert.*;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;




import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//import org.junit.jupiter.api.Test;

// NOTE:  the base test framework and code 
// comes from fellow student from Stani's 
// presentation in class
// Thanks Tom E. Brady [for proper CREDIT]
// see https://canvas.seattlecentral.edu/courses/1589921/discussion_topics/7828181


public class Assignment07Test {

	@Test
	public void testSelectionSortL_01() {
		Assignment07 test = new Assignment07();
		
		//test for correct output
	    //ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    //System.setOut(new PrintStream(outContent));
	    
	    int[] nums = {12,123,1,28,183,16};
	    System.out.println(Arrays.toString(nums));
	    int[] numsExpected = {1, 12, 16, 28, 123, 183};
	    
	    // print to console to be captured by PrintStream
		int[] numsTested = (test.SelectionSortL(nums));
		
		System.out.println("something");
        
		System.out.println(Arrays.toString(numsExpected));
        System.out.println(Arrays.toString(test.SelectionSortL(numsTested)));
		
		// get expected output
		//String expOutput = "{1,12,16,28,123,183}";
		
		// test expected output vs. print to console
		assertEquals(numsTested[0],numsExpected[0]);
		assertEquals(numsTested[1],numsExpected[1]);
		assertEquals(numsTested[2],numsExpected[2]);
		assertEquals(numsTested[3],numsExpected[3]);
		assertEquals(numsTested[4],numsExpected[4]);
		assertEquals(numsTested[5],numsExpected[5]);
	}

	
	@Test
	public void testSelectionSortL_02() {
		Assignment07 test = new Assignment07();
		
	    // lets do 20 random integers
		//    ahhh  with one set of duplicates 
		// 6	25	36	37	81
		// 66	58	17	69	71
		// 37	30	44	67	10
		// 1	52	8	2	83
	    int[] nums = {6, 25, 36, 37, 81, 37, 30, 44, 67, 10, 1, 52, 8, 2, 83, 66, 58, 17, 69, 71};
	    System.out.println(Arrays.toString(nums));
	    int[] numsExpected = {1, 2, 6, 8, 10, 17, 25, 30, 36, 37, 37, 44, 52, 58, 66, 67, 69, 71, 81, 83};
	    
		int[] numsTested = (test.SelectionSortL(nums));
		
		System.out.println("something");
        
		System.out.println(Arrays.toString(numsExpected));
        System.out.println(Arrays.toString(test.SelectionSortL(numsTested)));
		
		// get expected output
		//String expOutput = "{1,12,16,28,123,183}";
		
		// test expected output vs. print to console
		assertEquals(numsTested[0],numsExpected[0]);
		assertEquals(numsTested[1],numsExpected[1]);
		assertEquals(numsTested[2],numsExpected[2]);
		assertEquals(numsTested[3],numsExpected[3]);
		assertEquals(numsTested[4],numsExpected[4]);
		
		assertEquals(numsTested[5],numsExpected[5]);
		assertEquals(numsTested[6],numsExpected[6]);
		assertEquals(numsTested[7],numsExpected[7]);
		assertEquals(numsTested[8],numsExpected[8]);
		assertEquals(numsTested[9],numsExpected[9]);
		
		assertEquals(numsTested[10],numsExpected[10]);
		assertEquals(numsTested[11],numsExpected[11]);
		assertEquals(numsTested[12],numsExpected[12]);
		assertEquals(numsTested[13],numsExpected[13]);
		assertEquals(numsTested[14],numsExpected[14]);
		
		assertEquals(numsTested[15],numsExpected[15]);
		assertEquals(numsTested[16],numsExpected[16]);
		assertEquals(numsTested[17],numsExpected[17]);
		assertEquals(numsTested[18],numsExpected[18]);
		assertEquals(numsTested[19],numsExpected[19]);
	}
	

}
