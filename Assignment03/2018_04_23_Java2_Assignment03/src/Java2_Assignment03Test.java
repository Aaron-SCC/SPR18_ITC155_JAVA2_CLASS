import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;


public class Java2_Assignment03Test {

	@Test
	public void testMain() {
//		fail("Not yet implemented");
		// I keep this testMain around as place holder in 
		// case of further debug, either MAIN code or TEST code
	}

	@Test
	public void testIsUnique() {
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Marty",     "Stepp"  ) ;
		nameMap.put("Stuart",    "Reges"  ) ;
		nameMap.put("Jessica",   "Miller" ) ;
		nameMap.put("Amanda",    "Camp"   ) ;
		nameMap.put("Hal",       "Perkins") ;
		
		
		boolean isThisUnique = Java2_Assignment03.isUnique(nameMap);
		assertTrue("Value of n-th array value is correct ",  isThisUnique == true);
	}

	@Test
	public void testIsUnique2() {
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Kendrick", "Perkins") ;
		nameMap.put("Stuart",   "Reges"  ) ;
		nameMap.put("Jessica",  "Miller" ) ;
		nameMap.put("Bruce",    "Reges"  ) ;
		nameMap.put("Hal",      "Perkins") ;		
		
		boolean isThisUnique = Java2_Assignment03.isUnique(nameMap);
		assertTrue("Value of n-th array value is correct ",  isThisUnique == false);
	}

	@Test
	public void testIsUnique3() {
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Kendrick", "Lamar") ;
		nameMap.put("Reggie",   "Bush"  ) ;
		nameMap.put("Jessica",  "Miller" ) ;
		nameMap.put("Bruce",    "Reges"  ) ;
		nameMap.put("Hal",      "Perkins") ;		
		
		boolean isThisUnique = Java2_Assignment03.isUnique(nameMap);
		assertTrue("Value of n-th array value is correct ",  isThisUnique == true);
	}

	@Test
	public void testIsUnique4() {
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Kendrick", "Lamar") ;
		nameMap.put("Reggie",   "Miller"  ) ;
		nameMap.put("Jessica",  "Miller" ) ;
		nameMap.put("Bruce",    "Reges"  ) ;
		nameMap.put("Hal",      "Perkins") ;		
		
		
		boolean isThisUnique = Java2_Assignment03.isUnique(nameMap);
		assertTrue("Value of n-th array value is correct ",  isThisUnique == false);
	}
	
	@Test
	public void testIsUnique5() {
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Kendrick", "Lamar") ;
		nameMap.put("Reggie",   "BushyTail"  ) ;
		nameMap.put("Jessica",  "Miller" ) ;
		nameMap.put("Bruce",    "Reges"  ) ;
		nameMap.put("Hal",      "Lamar") ;		
		
		
		boolean isThisUnique = Java2_Assignment03.isUnique(nameMap);
		assertTrue("Value of n-th array value is correct ",  isThisUnique == false);
	}
	
	

}
