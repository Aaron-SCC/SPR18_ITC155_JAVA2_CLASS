// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 2018_04_23
// Aaron Lewis
// 
// Assignment 03:
// In Java, via Eclipse.
// Place on github.com
// Submit on CANVAS the URL of assignment on github.com 
// 
// 123456789 123456789 123456789 123456789 123456789 123456789
// 123456789 123456789 123456789 123456789 123456789 123456789 
//
// Assignment:
// Write a jUnit test for your code. 
// Write a jUnit test for your code. 
// Write a jUnit test for your code. 
// 4th Ed of textbook Ch 11 p. 751, ex.13 ...Write a method isUnique ...
// Write a method    isUnique    that accepts a map whose keys 
// and values are strings as a parameter and returns    true    
// if no two keys map to the same value (and    false    
// if any two or more keys do map to the same value.)  For 
// example, if the map contains the following key/value pairs, 
// your method would return    true    :    {Marty=Stepp, 
// Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}    .  
// But calling it on the following map would return    false    ,    
// because of the mappings for    Perkins    and   Reges:  
// {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, 
// Bruce=Reges, Hal=Perkins}  
//
//

import java.io.*;
import java.util.*;


public class works {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// map views (key set and values)
		Map<String, String> nameMap = new TreeMap<String, String>();
		nameMap.put("Marty",     "Stepp"  ) ;
		nameMap.put("Stuart",    "Reges"  ) ;
		nameMap.put("Jessica",   "Miller" ) ;
		nameMap.put("Amanda",    "Camp"   ) ;
		nameMap.put("Hal",       "Perkins") ;
		
		System.out.println("Set # 01 : \t" + nameMap);
		System.out.println("Set # 01 is UNIQUE?  " + isUnique(nameMap));
		System.out.println();

		
		// map views (key set and values)
		Map<String, String> nameMap2 = new TreeMap<String, String>();
		nameMap2.put("Kendrick", "Perkins") ;
		nameMap2.put("Stuart",   "Reges"  ) ;
		nameMap2.put("Jessica",  "Miller" ) ;
		nameMap2.put("Bruce",    "Reges"  ) ;
		nameMap2.put("Hal",      "Perkins") ;
		
		System.out.println("Set # 02 : \t" + nameMap2);		
		System.out.println("Set # 02 is UNIQUE?  " + isUnique(nameMap2));
		System.out.println();
		

		// map views (key set and values)
		Map<String, String> nameMap3 = new TreeMap<String, String>();
		nameMap3.put("Kendrick", "Lamar") ;
		nameMap3.put("Reggie",   "Bush"  ) ;
		nameMap3.put("Jessica",  "Miller" ) ;
		nameMap3.put("Bruce",    "Reges"  ) ;
		nameMap3.put("Hal",      "Perkins") ;
		
		System.out.println("Set # 03 : \t" + nameMap3);		
		System.out.println("Set # 03 is UNIQUE?  " + isUnique(nameMap3));
		System.out.println();
		
		
		// map views (key set and values)
		Map<String, String> nameMap4 = new TreeMap<String, String>();
		nameMap4.put("Kendrick", "Lamar") ;
		nameMap4.put("Reggie",   "Miller"  ) ;
		nameMap4.put("Jessica",  "Miller" ) ;
		nameMap4.put("Bruce",    "Reges"  ) ;
		nameMap4.put("Hal",      "Perkins") ;		

		System.out.println("Set # 04 : \t" + nameMap4);
		System.out.println("Set # 04 is UNIQUE?  " + isUnique(nameMap4));
		System.out.println();


		// map views (key set and values)
		Map<String, String> nameMap5 = new TreeMap<String, String>();
		nameMap5.put("Kendrick", "Lamar") ;
		nameMap5.put("Reggie",   "Bush"  ) ;
		nameMap5.put("Jessica",  "Miller" ) ;
		nameMap5.put("Bruce",    "Reges"  ) ;
		nameMap5.put("Hal",      "Lamar") ;		

		System.out.println("Set # 05 : \t" + nameMap5);
		System.out.println("Set # 05 is UNIQUE?  " + isUnique(nameMap5));
		System.out.println();
				


	} // B-FLAG
	
	public static boolean isUnique(Map<String, String> inPut) { // C-FLAG
		boolean isThisUnique = true;

		for(String name1 : inPut.keySet()){// FOR-FLAG
			for(String name2 : inPut.keySet()){
				if (name2==name1){
					// do nothing same KEY					
				} else { // different KEY
					if (inPut.get(name1) == inPut.get(name2) ){
						isThisUnique = false;
					}
				}
			}
		}// FOR-FLAG
		
		return isThisUnique;
		
	} // C-FLAG	
	
	
}
