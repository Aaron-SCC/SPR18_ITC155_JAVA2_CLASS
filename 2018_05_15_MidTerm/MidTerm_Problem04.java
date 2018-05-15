import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.awt.*;

public class MidTerm_Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THIS IS A TEMPLATE MidTerm Problem #04 \n\n");
		
		Scanner console = new Scanner(System.in);
		
		//                0   1   2   3   4   5   6   7   8   9    
		int[] numbers = {-2,  8, 13, 22, 25, 25, 38, 42, 51,103};
		
		int index = Arrays.binarySearch(numbers, 103);
		System.out.println("103 is found at index  " + index);
		
		index = Arrays.binarySearch(numbers, 30);
		System.out.println("30  is found at index  " + index);
		
		index = Arrays.binarySearch(numbers, 8);
		System.out.println(" 8  is found at index  " + index);
		
		index = Arrays.binarySearch(numbers, -1);
		System.out.println("-1  is found at index  " + index);
		
		
		// a.  4 -> 7 -> 8 -> 9
		// b.  4 -> 7 -> 5 -> 6
		// c.  4 -> 1
		// d.  4 -> 1 -> 0
		
		
	}

}
