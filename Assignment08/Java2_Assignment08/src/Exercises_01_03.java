// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 
// Aaron Lewis
// 
// Assignment 08:
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
//
// Each of the following exercises is a method to be added to 
// the     ArrayIntList    class from this chapter.  [See 
// lecture code notes from 2018_05_31 JAVA2 Class Google 
// Drive.]
//
// 4th Ed of textbook Ch 15
// page 961
// Exercise (1)
// Write a method called    lastIndexOf    that accepts an 
// integer as a parameter and returns the index in the list of 
// the last occurrence of that value, or    -1    if the value 
// is not found in the list.  For example, if the list stores 
// [1, 18, 2, 7, 18, 39, 18, 40], then the last index of 18 is 
// 6 and the last index of 3 is -1.
//
//
// 123456789 123456789 123456789 123456789 123456789 123456789 
//
// 4th Ed of textbook Ch 15
// page 961
// Exercise (3)
//
// Write a method called    replaceAll    that accepts two 
// integer calues as parameters and replaces all ocurrences of 
// the first value in the list with the second value.  For 
// example, if a variable called    list    stores 
// [11, -7, 3, 42, 3, 0, 14, 3],    the call of    
//     list.replaceAll(3,999);    should change the list to 
// store    [11, -7, 999, 42, 999, 0, 14, 999].
//
//
//

import java.util.*;
import java.io.*;


public class Exercises_01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercise (1) BELOW
		// Exercise (1) BELOW
		// Exercise (1) BELOW
		System.out.println();
		
		int[] data = {1, 18, 2, 7, 18, 39, 18, 40};
		
		ArrayIntList list = new ArrayIntList(); // or  new ArrayIntList(600);
		
		for(int n : data ){
			list.add(n);
		}
		
		System.out.println(list.toString());
		System.out.println();
		
		System.out.println(list.lastIndexOf(list, 18));
		System.out.println();
		// Exercise (1) ABOVE
		// Exercise (1) ABOVE
		// Exercise (1) ABOVE
		
		
		
		// Exercise (3) BELOW
		// Exercise (3) BELOW
		// Exercise (3) BELOW
		System.out.println();
		
		int[] data1 = {11, -7, 3, 42, 3, 0, 14, 3};
		
		ArrayIntList list1 = new ArrayIntList(); // or  new ArrayIntList(600);
		
		for(int n : data1 ){
			list1.add(n);
		}
		
		System.out.println(list1.toString());
		System.out.println();
		
		list1.replaceAll(3, 999);
		System.out.println(list1.toString());
		
		
	}

}










