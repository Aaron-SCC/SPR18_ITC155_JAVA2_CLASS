import java.io.*;
import java.util.*;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {5, 19, 0, 2, 4, 0, 13, 85, -8, 0, 23};
		
		ArrayIntList list = new ArrayIntList(600); // or  new ArrayIntList(600);
		
		for(int n : data ){
			list.add(n);
		}
		
		System.out.println(list.toString());
		System.out.println();
		
		
		ArrayListIterator i = list.iterator();
		int product = 1;
		
		while(i.hasNext()){   // remove the ZEROs... else PRODUCT will be ZERO
			int n = i.next();
			if(n == 0){
				i.remove();
			} else {
				product *= n;
			}
			
		}
		
		System.out.println("list now " + list.toString());
		System.out.println("product " + product);
		
		
		
		
		int[] data1 = {8, 6, 7, 5, 3, 0, 9};
		
		ArrayIntList list1 = new ArrayIntList(); // or  new ArrayIntList(600);
		
		for(int n : data1 ){
			list1.add(n);
		}
		
		
		list1.addAll(list);
		System.out.println("list1 now " + list1.toString());

	}

}