import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Test;


public class Assignment04Test {

	@Test
	public void testMain() throws FileNotFoundException {
//		fail("Not yet implemented");
        // Creating a File object that represents the disk file.
        PrintStream o = new PrintStream(new File("results.txt"));
 
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
 
        // Assign o to output stream
        System.setOut(o);


		// below to test against book instructions
		for (int i = 1 ; i <= 10 ; i++ ){
			Assignment04.writeSequence(i);
			System.out.println();			
		}
		
		
		// ARGHHH  got stumped on output file text string 
		//  vs.  expected string testing...
		
	}

	@Test
	public void testWriteSequence() {
//		fail("Not yet implemented");
	}


}
