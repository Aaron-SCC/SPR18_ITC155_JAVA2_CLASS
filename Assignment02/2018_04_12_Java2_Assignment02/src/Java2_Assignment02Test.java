import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;   // instead of  import org.junit.Test;

import java.util.*;


public class Java2_Assignment02Test {

	@Test
	public void testMain() {
		//Java2_Assignment02 list = new Java2_Assignment02();
		//System.out.println(list);
		//fail("Not yet implemented");
		//assertEquals(4, list.size());
		//assertEquals(17, list.get(2));
		//assertTrue(list.contains(-3));
		//assertFalse(list.isEmpty());
	}
//
	@Test
	public void testPartition() {
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
        list.add(9);
		assertEquals(12,Java2_Assignment02.partition(list, breakPoint).size());
		//fail("Not yet implemented");
	}
//
//	@Test
//	public void testObject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetClass() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEquals() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testClone() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testWait() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFinalize() {
//		fail("Not yet implemented");
//	}

}
