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
// 
// Java2 Class
// Assignment 04
// create a Junit test
// create a Junit test
// create a Junit test
// create a Junit test
// 
// 123456789 123456789 123456789 123456789 123456789 123456789 
//     4th Ed of textbook Ch 12...Code a solution and a test 
//     for p.822 ex.3 writeSequence ...
// Chapter 12, page 822
// Exercise 3.
// Assignment:
// Write a method called    writeSequence   that accepts an integer
//     n   as a parameter and prints to the console a symmetric 
// sequence of   n    numbers composed of descending integers 
// that ends in 1, followed by a sequence of ascending integers 
// that begins with 1.  The following table indicates the output 
// that should be produced for various values of    n    :
// 
// Method call                Output produced
// ----------------------------------------------
// writeSequence(1);          1
// writeSequence(2);          1 1
// writeSequence(3);          2 1 2
// writeSequence(4);          2 1 1 2
// writeSequence(5);          3 2 1 2 3
// writeSequence(6);          3 2 1 1 2 3
// writeSequence(7);          4 3 2 1 2 3 4
// writeSequence(8);          4 3 2 1 1 2 3 4
// writeSequence(9);          5 4 3 2 1 2 3 4 5
// writeSequence(10);         5 4 3 2 1 1 2 3 4 5
// 
// Notice that when    n   is odd the sequence has a single 
//     1   in the middle, whereas for even values it has two 
//     1s    in the middle.  Your method should throw an 
//     IllegalArgumentException    if it is passed a value 
// less than    1.
// create a Junit test
// create a Junit test
// create a Junit test
// create a Junit test
// 
import java.io.*;
import java.util.*;



public class Assignment04 {
	
	
	
	public static String lowerHalf   = "";
	public static String centerPiece = " 1 ";
	public static String upperHalf   = "";
	
	public static String entireString = "";

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(writeSequence(5));
		
	}
	
	
	
	// new recursion approach
	public static String writeSequence(int n){ // D-FLAG
		
		int firstTime = 0;

	
		
		// base casees;
		if (n<=0) { // E-FLAG
			// Throw Exception if int N is < ONE
			throw new IllegalArgumentException("Need to enter a number greater than or equal to ONE.");
		} else if (n==1){
			// no-op  for DEBUG PURPOSES
			
		} else if (n%2 == 1 ) { // E-FLAG  // odd

			lowerHalf    = lowerHalf + " " +  Integer.toString( (n/2 + n%2) ) ;
			upperHalf    =                    Integer.toString( (n/2 + n%2) ) + " " + upperHalf ;
			entireString = lowerHalf + centerPiece + upperHalf ;
			
			writeSequence(n-1);
			
			

		} else if (n/n == 1 && n%2==0 && firstTime = 0) {
			centerPiece = " 1 1 ";
			System.out.println("DEBUG " + centerPiece + n);
			writeSequence(n-1);
		} else {
			System.out.println("DEBUG  "  + n );
			writeSequence(n-1);

			
		}
		// E-FLAG
		
		return entireString ;
			
	} // D-FLAG
	

	
	
	

}