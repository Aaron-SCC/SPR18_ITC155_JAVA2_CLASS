// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 
// Aaron Lewis
// 
// Assignment 07:
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


public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Template");
        
        // THIS SECTION to TEST the known method
        int[] nums = {12, 123,1,28,183,16};
        System.out.println(Arrays.toString(nums));
        
        System.out.println(Arrays.toString(SelectionSortRegular(nums)));

        
        // THIS SECTION to TEST the assignment METHOD        
        int numsL[] = {12, 123,1,28,183,16};
        System.out.println(Arrays.toString(numsL));
        
        System.out.println(Arrays.toString(SelectionSortL(numsL)));
        

        
    }

    // use SelectionSort regular to build the reverse 
	// SelectionSortL for Largest
    public static int[] SelectionSortRegular(int[] a){
        for (int i = 0; i < a.length -1 ; i++){
            // find index of largest element
            int smallest = i;
            for(int j = j = i + 1; j < a.length ; j++){
                if(a[j] < a[smallest]){
                    smallest = j;
                }
            }
            
            swap(a, i, smallest); // swap largest to back end of index
        }
        return a;
    }
    
    
    // BELOW is the heart of the assignment 
	// SelectionSortL for Largest
    public static int[] SelectionSortL(int[] a){
        for (int i = a.length -1; i > 0 ; i--){        // THIS ONE and ...
            // find index of largest element
            int largest = i;
            //for(int j = a.length - 1; j > 0 ; j--){
            for(int j = i - 1; j >= 0 ; j--){         // THIS ONE esp. were tough to nail down
                if(a[j] > a[largest]){                // had to reverse engineer the book example
                    largest = j;                      // ... wait for... in reverse 
                }
            }
            
            swap(a, i, largest); // swap largest to back end of index
        }
        return a;
    }
    
    // the helper method to swap array entries
    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i]  = list[j];
        list[j]  = temp;
    }
        
}




