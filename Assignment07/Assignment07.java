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
//For Assignment 07
//
// Assignment:
// 4th Ed of textbook Ch 13...Code a solution and a test for 
// Ch 13 p. 881 ex. 18 Write a modified version of the selection
// sort... 
//
// Chapter 13, page 881
// Exercise 18
// Write a modified version of the selection sort algorithm that 
// selects the largest element each time and moves its to the 
// end of the array, rather than selecting the smallest element 
// and moving it to the beginning.  
//
// QUESTION:  Will this algorithm be faster than the standard 
//   selection sort?
// ANSWER:    NO; same a regular SelectionSort
//
//
// QUESTION:  What will its complexity class (big-Oh) be?
// ANSWER:    O(N^2)  ; same a regular SelectionSort
//
//
//
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




