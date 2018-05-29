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


public class EC_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Template");
        
        // THIS SECTION to TEST the known method
        int[] nums = {12, 123,1,28,183,16};
        System.out.println(Arrays.toString(nums));
        
        System.out.println(Arrays.toString(SelectionSortRegular(nums)));
        System.out.println();

        
        // THIS SECTION to TEST the assignment BubbleSort METHOD        
        int numsL[] = {12, 123,1,28,183,16};
        System.out.println(Arrays.toString(numsL));
        
        System.out.println(Arrays.toString(BubbleSort(numsL)));
        System.out.println();
        
        // THIS SECTION to TEST the assignment ShellSort METHOD        
        int numsS[] = {12, 123,1,28,183,16};
        System.out.println(Arrays.toString(numsS));
        
        System.out.println(Arrays.toString(ShellSort(numsS)));
        System.out.println();
        
        
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
	// BubbleSort
    // BubbleSort is a O(N^2) complexity
    // instead of swapping one (smallest or largest) of entire 
    // array sweep like SelectionSort, it does in situ, two at 
    // a time
    //     FOR A MORE DETAILED DESCRIPTION
    // FROM https://brilliant.org/wiki/sorting-algorithms/
    // Bubble sort is a comparison-based algorithm that 
    // compares each pair of elements in an array and 
    // swaps them if they are out of order until the entire 
    // array is sorted. For each element in the list, the 
    // algorithm compares every pair of elements.
    //
    public static int[] BubbleSort(int[] data){
    	  int lenD = data.length;
    	  int tmp = 0;
    	  for(int i = 0; i < lenD ; i++){
    	    for(int j = (lenD-1) ; j >= (i+1) ; j--){
    	      if(data[j]<data[j-1]){
    	        tmp       = data[j];
    	        data[j]   = data[j-1];
    	        data[j-1] = tmp;
    	      }
    	    }
    	  }
    	  return data;
    	}
    
//    public static int[] BubbleSort(int[] a){
//        for (int i = a.length -1; i > 0 ; i--){        // THIS ONE and ...
//            // find index of largest element
//            int largest = i;
//            //for(int j = a.length - 1; j > 0 ; j--){
//            for(int j = i - 1; j >= 0 ; j--){         // THIS ONE esp. were tough to nail down
//                if(a[j] > a[largest]){                // had to reverse engineer the book example
//                    largest = j;                      // ... wait for... in reverse 
//                }
//            }
//            
//            swap(a, i, largest); // swap largest to back end of index
//        }
//        return a;
//    }
    
    
    // BELOW is the heart of the assignment 
	// ShellSort
    // ShellSort is a O(N^2) complexity
    //     FOR A MORE DETAILED DESCRIPTION
    // FROM https://en.wikipedia.org/wiki/Shellsort
    // Shellsort, also known as Shell sort or Shell's 
    // method, is an in-place comparison sort. It can 
    // be seen as either a generalization of sorting by 
    // exchange (bubble sort) or sorting by insertion 
    // (insertion sort).[3] The method starts by sorting 
    // pairs of elements far apart from each other, then 
    // progressively reducing the gap between elements 
    // to be compared. Starting with far apart elements, 
    // it can move some out-of-place elements into 
    // position faster than a simple nearest neighbor 
    // exchange. Donald Shell published the first 
    // version of this sort in 1959.[4][5] The running 
    // time of Shellsort is heavily dependent on the gap 
    // sequence it uses. For many practical variants, 
    // determining their time complexity remains an open 
    // problem.
    //
    public static int[] ShellSort(int[] data){
    	  int lenD = data.length;
    	  int inc = lenD / 2;
    	  while(inc > 0){
    	    for(int i = inc ; i < lenD ; i++){
    	      int tmp = data[i];
    	      int j = i;
    	      while( j >= inc && data[j-inc] > tmp){
    	        data[j] = data[j-inc];
    	        j = j - inc;
    	      }
    	      data[j] = tmp;
    	    }
    	    inc = (inc / 2);
    	  }
    	  return data;
    	}
    
    
//    public static int[] ShellSort(int[] a){
//        for (int i = a.length -1; i > 0 ; i--){        // THIS ONE and ...
//            // find index of largest element
//            int largest = i;
//            //for(int j = a.length - 1; j > 0 ; j--){
//            for(int j = i - 1; j >= 0 ; j--){         // THIS ONE esp. were tough to nail down
//                if(a[j] > a[largest]){                // had to reverse engineer the book example
//                    largest = j;                      // ... wait for... in reverse 
//                }
//            }
//            
//            swap(a, i, largest); // swap largest to back end of index
//        }
//        return a;
//    }
    

    
    // the helper method to swap array entries
    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i]  = list[j];
        list[j]  = temp;
    }

}
