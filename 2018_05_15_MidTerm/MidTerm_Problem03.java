import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

public class MidTerm_Problem03 {
// UGHHHHHHHHHHH THE MONSTER PROBLEM    UGHHHHHHHHH
	// UGHHHHHHHHHHH THE MONSTER PROBLEM    UGHHHHHHHHH
	// UGHHHHHHHHHHH THE MONSTER PROBLEM    UGHHHHHHHHH
	// UGHHHHHHHHHHH THE MONSTER PROBLEM    UGHHHHHHHHH
	// UGHHHHHHHHHHH THE MONSTER PROBLEM    UGHHHHHHHHH
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THIS IS A TEMPLATE MidTerm Problem #03 \n\n");
		
		Scanner console = new Scanner(System.in);
		
		System.out.println(digitMatch(1072503891,62530841   ) + "\n");
		System.out.println(digitMatch(      38,           34) + "\n");
		System.out.println(digitMatch(       5,         5552) + "\n");
		System.out.println(digitMatch(     892,          892) + "\n");
		System.out.println(digitMatch(  298892,         7892) + "\n");
		System.out.println(digitMatch(     380,            0) + "\n");
		System.out.println(digitMatch(  123456,       654321) + "\n");
		System.out.println(digitMatch( 1234567,           67) + "\n");
		
		// TEST EXCEPTIONS
//		System.out.println(digitMatch( 1234567,           -1) + "\n");
//		System.out.println(digitMatch(-1234567,           67) + "\n");
//		System.out.println(digitMatch(   -6696,        -6696) + "\n");
//		
	}
	
	
	// PETER's CODE
//		public static int digitMatch(int n1, int n2) {// FLAG 0A
//			if (n1 < 0  ||  n2 < 0) { // FLAG 0B
//				throw new IllegalArgumentException("Both arguments must be nonnegative: " + n1 + ", " + n2);
//			} // FLAG 0B
//			
//			if (n1 == 0  ||  n2 == 0) {  // FLAG 0B
//				return 0;
//			} else if (n1 % 10  ==  n2 % 10) {
//				return 1 + digitMatch(n1 / 10, n2 / 10);
//			} else {
//				return digitMatch(n1 / 10, n2 / 10);
//			}
//			
//		}// FLAG 0A	
	
	
	
	// AARON'S CODE
	public static int digitMatch(int n1, int n2) {
	    if(n1 < 0 || n2 < 0) {
                                            	    	throw new IllegalArgumentException("DUDES!!!   You cannot passes a NEGATIVE NUMBER!!!   DUDES!!!");
	    }
	        
	    
	        
	    if(n1 < 10 || n2 < 10)
	        return n1 % 10 == n2 % 10 ? 1 : 0;
	        
	    if(n1 % 10 == n2 % 10)
	        return 1 + digitMatch(n1/10, n2/10);
	        
	    return digitMatch(n1/10, n2/10);
	}

}
