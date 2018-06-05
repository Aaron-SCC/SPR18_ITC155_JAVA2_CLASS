import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class Exercises_01_03Test {

	@Test
	public void testMain00() { // EXERCISE (1)
		Exercises_01_03 test = new Exercises_01_03();
		

	    
		System.out.println();
		
		int[] data = {1, 18, 2, 7, 18, 39, 18, 40};
		System.out.println();
		
		ArrayIntList list = new ArrayIntList(); // or  new ArrayIntList(600);
		
		for(int n : data ){
			list.add(n);
		}
		System.out.println(list);


	    // Value not in list TEST
		int testOutput = list.lastIndexOf(list, 3);
		System.out.println(testOutput + "  Value not in list TEST ");
		
		// get expected output
		int expOutput = -1;
		
		// test expected output vs. print to console
		assertEquals(testOutput,expOutput);
		System.out.println();

		
	    // Value 1 TEST
		testOutput = list.lastIndexOf(list, 1);
		System.out.println(testOutput + "  Value 1 TEST ");
		
		// get expected output
		expOutput = 0;
		
		// test expected output vs. print to console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 1st 18 TEST
		testOutput = list.lastIndexOf(list, 18);
		System.out.println(testOutput + "  Value 1st 18 TEST ");
		
		// get expected output
		expOutput = 6;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 2 TEST
		testOutput = list.lastIndexOf(list, 2);
		System.out.println(testOutput + "  Value 2 TEST ");
		
		// get expected output
		expOutput = 2;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 7 TEST
		testOutput = list.lastIndexOf(list, 7);
		System.out.println(testOutput + "  Value 7 TEST ");
		
		// get expected output
		expOutput = 3;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 2nd 18 TEST
		testOutput = list.lastIndexOf(list, 18);
		System.out.println(testOutput + "  Value 2nd 18 TEST ");
		
		// get expected output
		expOutput = 6;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 39 TEST
		testOutput = list.lastIndexOf(list, 39);
		System.out.println(testOutput + "  Value 39 TEST ");
		
		// get expected output
		expOutput = 5;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 3rd 18 TEST
		testOutput = list.lastIndexOf(list, 18);
		System.out.println(testOutput + "  Value 3rd 18 TEST ");
		
		// get expected output
		expOutput = 6;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
	    // Value 40 TEST
		testOutput = list.lastIndexOf(list, 40);
		System.out.println(testOutput + "  Value 40 TEST ");
		
		// get expected output
		expOutput = 7;
		
		// test expected output vs. prto console
		assertEquals(testOutput,expOutput);
		System.out.println();
		
		
		

	}
	
	
	
	
	@Test
	public void testMain01() { // EXERCISE (1)
		Exercises_01_03 test = new Exercises_01_03();

		
		System.out.println();
		
		int[] data1 = {11, -7, 3, 42, 3, 0, 14, 3};
		
		ArrayIntList test1Array = new ArrayIntList(); // or  new ArrayIntList(600);
		
		for(int n : data1 ){
			test1Array.add(n);
		}
		
		for (int i = 0 ; i < test1Array.size() ; i++ ){
			System.out.println(test1Array.get(i));
		}
		


	    // Value not in list TEST
		test1Array.replaceAll(3, 999);
		for (int i = 0 ; i < test1Array.size() ; i++ ){
			System.out.println(test1Array.get(i));
		}
		
		
		ArrayIntList expArray = new ArrayIntList(); // or  new ArrayIntList(600);
		int[] expData1 = {11, -7, 999, 42, 999, 0, 14, 999};
		for(int n : expData1 ){
			expArray.add(n);
		}

			
		for (int i = 0 ; i < test1Array.size() ; i++ ){
			assertEquals(test1Array.get(i),expArray.get(i));
		}
		
		
//		// get expected output
//		int expOutput = -1;
//		
//		// test expected output vs. print to console
//		assertEquals(testOutput,expOutput);
//		System.out.println();


		
		

	}



}
