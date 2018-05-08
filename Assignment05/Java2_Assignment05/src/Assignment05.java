// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 
// Aaron Lewis
// 
// Assignment 05:
// In Java, via Eclipse.
// Place on github.com
// Submit on CANVAS the URL of assignment on github.com 
// 
// 
// create a Junit test
// create a Junit test
// create a Junit test
// create a Junit test
// 
// 123456789 123456789 123456789 123456789 123456789 123456789
// Assignment:
//     4th Ed of textbook Ch 12...Code a solution and a test 
//     for p. 823 ex. 7 Write a recursive method called 
//     writeChars...
//
// Chapter 12, page 823, 
// Exercise 7.
// 
// Write a method called    writeChars   that accepts an 
// integer parameter    n    and that prints out a total of 
//     n    characters.  The middle character of the output 
// should always be an asterisk ( "*" ).  If you are asked to 
// write out an even number of characters, then there will be 
// two asterisks in the middle ( "**" ).  Before the 
// asterisk(s) you should write out less-than characters 
// ( "<" ).  After the asterisk(s) you should write out 
// greater-than characters ( ">" ).  Your method should throw 
// an    IllegalArgumentException   if it is passed a value 
// less than 1.  For example, the following calls produce the 
// following output:
//
//
// Method call                Output produced
// ----------------------------------------------
// wrtieChars(1);          *
// wrtieChars(2);          **
// wrtieChars(3);          <*>
// wrtieChars(4);          <**>
// wrtieChars(5);          <<*>>
// wrtieChars(6);          <<**>>
// wrtieChars(7);          <<<*>>>
// wrtieChars(8);          <<<**>>>
// wrtieChars(9);          <<<<*>>>>
// wrtieChars(10);         <<<<**>>>>
// 
// Notice that when    n   is odd the sequence has a single 
//     *   in the middle, whereas for even values it has two 
//     *s    in the middle.  Your method should throw an 
//     IllegalArgumentException    if it is passed a value 
// less than    1.
// create a Junit test
// create a Junit test
// create a Junit test
// create a Junit test
// 

import java.io.*;
import java.util.*;


public class Assignment05 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		
	
		
		// below to test against book instructions
		for (int i = 1 ; i <= 10 ; i++ ){
			writeChars(i);
			System.out.println();			
		}
		
		
	}
	
	
	
	// new recursion approach
	public static void writeChars(int n){ // D-FLAG
		
		// base case n < 1 for Illegally n-parameter of less than ONE
	    if (n < 1) throw new IllegalArgumentException("Must enter in integer value greater than or equal to ONE");
	    
	    // base case n == 1 for ODD cases
	    if (n == 1) {
	    	System.out.print("*");    // for ODD cases
	    
	    // base case n == 2 for EVEN cases
	    } else if (n == 2) {
	        System.out.print("**");  // for EVEN cases
	        	        
	    // NON-base cases 
	    // i.e. "the rest of the story"... like Paul Harvey
	    } else {
	        String lowerHalf = "<";
	        
	        System.out.print(lowerHalf);
	        
	        writeChars(n - 2);     // ARGHH took this one FOREVER
	            // for -2 part and the placement.... UGH
	        
	        String upperHalf = ">";
	        
	        System.out.print(upperHalf);
	      
	    }
	    

			
	} // D-FLAG
	

		
	
	
}
