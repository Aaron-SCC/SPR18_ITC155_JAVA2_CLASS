import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;   // instead of  import org.junit.Test;

import java.util.*;


public class Java2_Assignment02Test {

	@Test
	public void testMain() {
		// I keep this testMain around as place holder in 
		// case of further debug, either MAIN code or TEST code
	}

	@Test
	public void testPartition() {
		// re-create MAIN stimulus
		int breakPoint = 5;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(-3);
        list.add(4);
        list.add(8);
        list.add(21);
        list.add(2);
        list.add(30);
        list.add(-1);
        list.add(9); // play around with this entry (9)
        
		LinkedList<Integer> fullList = Java2_Assignment02.partition(list, breakPoint);
		
		// test the size array should be 12
		assertEquals(12, fullList.size());
		
		// testing out each array value of the re-sorted list
		assertTrue("Value of n-th array value is correct ",  1 == fullList.get(0));
		assertTrue("Value of n-th array value is correct ", -3 == fullList.get(1));
		assertTrue("Value of n-th array value is correct ",  4 == fullList.get(2));
		assertTrue("Value of n-th array value is correct ",  2 == fullList.get(3));

		assertTrue("Value of n-th array value is correct ", -1 == fullList.get(4));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(5));
		assertTrue("Value of n-th array value is correct ",  6 == fullList.get(6));
		assertTrue("Value of n-th array value is correct ", 12 == fullList.get(7));

		assertTrue("Value of n-th array value is correct ",  8 == fullList.get(8));
		assertTrue("Value of n-th array value is correct ", 21 == fullList.get(9));
		assertTrue("Value of n-th array value is correct ", 30 == fullList.get(10));
		assertTrue("Value of n-th array value is correct ",  9 == fullList.get(11));
		
		
		//System.out.println(fullList);
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testPartition02() {
		// tweak stimulus with this one
		// array only 10 deep, remove 4 and 8, make 15 to -9
		int breakPoint = 5;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(-3);
        //list.add(4);
        //list.add(8);
        list.add(21);
        list.add(2);
        list.add(30);
        list.add(-1);
        list.add(-9); // play around with this entry (9)
        		
		LinkedList<Integer> fullList = Java2_Assignment02.partition(list, breakPoint);
		
		// test the size array should be 10
		assertEquals(10, fullList.size());
		
		// testing out each array value of the re-sorted list
		assertTrue("Value of n-th array value is correct ",  1 == fullList.get(0));
		assertTrue("Value of n-th array value is correct ", -3 == fullList.get(1));
		assertTrue("Value of n-th array value is correct ",  2 == fullList.get(2));
		assertTrue("Value of n-th array value is correct ", -1 == fullList.get(3));

		assertTrue("Value of n-th array value is correct ", -9 == fullList.get(4));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(5));
		assertTrue("Value of n-th array value is correct ",  6 == fullList.get(6));
		assertTrue("Value of n-th array value is correct ", 12 == fullList.get(7));
		
		assertTrue("Value of n-th array value is correct ", 21 == fullList.get(8));
		assertTrue("Value of n-th array value is correct ", 30 == fullList.get(9));


		
		
		//System.out.println(fullList);
		
		
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void testPartition03() {
		// tweak stimulus with this one
		// array only 17 deep, new random numbers
		// and 3 duplicate numbers
		// and new breaPoint of 17
		int breakPoint = 17;
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add( 16);
        list.add(-12);
        list.add(-17);
        list.add( -9);
        list.add( 44);
        
        list.add( 20);
        list.add( 15);
        list.add( 45);
        list.add( 66);
        list.add(-33);

        list.add(-69);
        list.add( 15);
        list.add( -5);
        list.add( 15);
        list.add( 10);

        list.add( 15);
        list.add(-13);
        
		LinkedList<Integer> fullList = Java2_Assignment02.partition(list, breakPoint);
		
		// test the size array should be 17
		assertEquals(17, fullList.size());
		
		// testing out each array value of the re-sorted list
		assertTrue("Value of n-th array value is correct ", 16 == fullList.get(0));
		assertTrue("Value of n-th array value is correct ",-12 == fullList.get(1));
		assertTrue("Value of n-th array value is correct ",-17 == fullList.get(2));
		assertTrue("Value of n-th array value is correct ", -9 == fullList.get(3));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(4));
		
		assertTrue("Value of n-th array value is correct ",-33 == fullList.get(5));
		assertTrue("Value of n-th array value is correct ",-69 == fullList.get(6));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(7));		
		assertTrue("Value of n-th array value is correct ", -5 == fullList.get(8));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(9));
		
		assertTrue("Value of n-th array value is correct ", 10 == fullList.get(10));
		assertTrue("Value of n-th array value is correct ", 15 == fullList.get(11));
		assertTrue("Value of n-th array value is correct ",-13 == fullList.get(12));		
		assertTrue("Value of n-th array value is correct ", 44 == fullList.get(13));
		assertTrue("Value of n-th array value is correct ", 20 == fullList.get(14));
		
		assertTrue("Value of n-th array value is correct ", 45 == fullList.get(15));
		assertTrue("Value of n-th array value is correct ", 66 == fullList.get(16));
		
		
		
		System.out.println(fullList);
		
		
		//fail("Not yet implemented");
	}	

}