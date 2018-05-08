import static org.junit.Assert.*;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//import org.junit.jupiter.api.Test;

// NOTE:  the base test framework and code 
// comes from fellow student from Stani's 
// presentation in class
// Thanks Tom E. Brady [for proper CREDIT]
// see https://canvas.seattlecentral.edu/courses/1589921/discussion_topics/7828181


//STANI AND TOM
//I could not get the testIllegalArugementException 
//testing to work.  
//Eclipse was not recognizing the following of 
//TOM's special imports....
////import static org.junit.jupiter.api.Assertions.*;
////import org.junit.jupiter.api.Test;
//



public class Assignment05Test {

// have TEN TEST CASES PER BOOK EXAMPLE
	@Test
	public void testWriteChars_01() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(1);
		
		// get expected output
		String expOutput = "*";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_02() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(2);
		
		// get expected output
		String expOutput = "**";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_03() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(3);
		
		// get expected output
		String expOutput = "<*>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_04() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(4);
		
		// get expected output
		String expOutput = "<**>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_05() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(5);
		
		// get expected output
		String expOutput = "<<*>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_06() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(6);
		
		// get expected output
		String expOutput = "<<**>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_07() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(7);
		
		// get expected output
		String expOutput = "<<<*>>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_08() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(8);
		
		// get expected output
		String expOutput = "<<<**>>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_09() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(9);
		
		// get expected output
		String expOutput = "<<<<*>>>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	@Test
	public void testWriteChars_10() {
		Assignment05 test = new Assignment05();
		
		//test for correct output
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    // print to console to be captured by PrintStream
		test.writeChars(10);
		
		// get expected output
		String expOutput = "<<<<**>>>>";
		
		// test expected output vs. print to console
		assertEquals(outContent.toString(),expOutput);
	}
	
	
	
// STANI AND TOM
//     I could not get the testIllegalArugementException 
//     testing to work.  
//     Eclipse was not recognizing the following of 
//     TOM's special imports....
//	//import static org.junit.jupiter.api.Assertions.*;
//	//import org.junit.jupiter.api.Test;
//	
//	@Test 
//	void testIllegalArugmentException(){
//		Assignment05 test1 = new Assignment05();
//	
//		//test for illegal argument exception case of n=0
//		assertThrows(IllegalArgumentException.class,
//				()->{test1.writeChars(0);});
//
//      //test for illegal argument exception case of n=-1		
//	    assertThrows(IllegalArgumentException.class,
//			()->{test1.writeChars(-1);});
//	
//      //test for illegal argument exception case of n=-2		
//		assertThrows(IllegalArgumentException.class,
//				()->{test1.writeChars(-2);});
//		
//	}


}
