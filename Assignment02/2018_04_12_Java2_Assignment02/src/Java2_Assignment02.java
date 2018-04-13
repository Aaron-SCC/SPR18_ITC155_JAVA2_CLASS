// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 2018_04_13
// Aaron Lewis
// 
// Assignment 02:
// In Java, via Eclipse.
// Place on github.com
// Submit on CANVAS the URL of assignment on github.com 
// 
// 123456789 123456789 123456789 123456789 123456789 123456789
// 123456789 123456789 123456789 123456789 123456789 123456789 
// Write a jUnit test for your code
// Write a jUnit test for your code
// Write a jUnit test for your code
// Write a jUnit test for your code
//
// Write a method called    partition    that accepts a list of 
// integers and an integer value    E    as its parameter, and 
// rearranges (partitions) the list so that all the elements with 
// values less than    E    occur before all elements with values 
// greater than    E    .  The exact order of the elements is 
// unimportant, so long as all elements less than    E   appear before 
// all elements greater than    E   .    For example, for the linked 
// list [ 15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9  ], one acceptable 
// ordering of the list after a call of    partition(list, 5) would be 
// [ -1, 1, 2, 4, -3, 12, 8, 21, 6, 30, 15, 9 ].  You may assume that 
// the list contains no duplicates and does not contain the element 
// value    E   .
//
// Write a jUnit test for your code
// Write a jUnit test for your code
// Write a jUnit test for your code
// Write a jUnit test for your code
//
// 
// 

import java.util.*;

public class Java2_Assignment02 { // F-TAG
    public static void main(String[] args) { // E-TAG
        System.out.println("This program will re-arrange at set of " + 
                           "unordered integer numbers and return same " + 
        		           "set but with the numbers less than BreakPoint in the " +
                           "leftmost side of set and the numbers greater than  " +
        		           "BreakPoint in the rightmost side of set." 
                          );
        
        System.out.println();

        System.out.println("This program will re-arrange at set of " + 
                           "unordered integer numbers and return same " + 
		                   "set but with the numbers less than BreakPoint in the " +
                           "leftmost side of set and the numbers greater than  " +
		                   "BreakPoint in the rightmost side of set." 
                          );
        
        
        //int list[] = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9 } ;
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
        //System.out.println(list);)
        System.out.println(list.get(0));



        //sieve(list, breakPoint);
        partition(list, breakPoint);
        
        
    } // E-TAG

  // Returns a list of all prime numbers up to the given maximum
  // using the Sieve of Eratosthenes algorithm.
     public static LinkedList<Integer> partition(LinkedList<Integer> list, int breakPoint) { // D-TAG
    	 
    	 // declare beforeBP (BreakPoint) and afterBP 
    	 LinkedList<Integer> beforeBP = new LinkedList<Integer>();
    	 LinkedList<Integer>  afterBP = new LinkedList<Integer>();
    	 
    	 LinkedList<Integer> fullList = new LinkedList<Integer>();
    	    	 
    	 for (int i = 0; i < list.size(); i++) { // C-TAG
    		 System.out.println(list.get(i));
    		 if (list.get(i) < breakPoint){
    			 beforeBP.add(list.get(i));
    		 } else {     // > breakPoint
    			 afterBP.add(list.get(i));
    		 }
    	 } // C-TAG
    	 
    	 for (int i = 0; i <  beforeBP.size()  ; i++) { // CC-TAG
    		 fullList.add(beforeBP.get(i));
    		 } // CC-TAG
    	 
    	 for (int i = 0; i <  afterBP.size()  ; i++) { // CCC-TAG
    		 fullList.add(afterBP.get(i));
		 } // CCC-TAG
    	 
         return fullList;
     } // D-TAG
     
	
} // F-TAG





















