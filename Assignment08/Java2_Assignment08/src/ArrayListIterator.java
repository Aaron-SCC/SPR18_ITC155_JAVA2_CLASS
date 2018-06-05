import java.io.*;
import java.util.*;

// provides a set of utilities for iterating

public class ArrayListIterator {
	
	// instance vars
	private ArrayIntList list; // list to iterate over
	private int position; // current position within the list
	private boolean removeOK; // is it OK to remove ?
	
	// constructor
	public ArrayListIterator (ArrayIntList list){
		this.list = list ; 
		position = 0;
		removeOK = false;
	}
	
	
	// methods
	
	// return true if there are more elements
	public boolean hasNext(){
		return position < list.size();
	}
	
	//  pre-condition:  hasNext()
	// post-condition:  reutrn the next element in the iteration
	public int next(){
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		int result = list.get(position);
		position++;
		removeOK = true;
		return result;
		
	}
	
	//  pre: next() has been called without a call on remove
	// post: remove the last element returned by the iterator
	public void remove(){
		if(!removeOK){
			throw new IllegalStateException();
		}
		                            // list of ArrayIntList.java remove() method
		list.remove(position - 1);  // not recursive.. list.remove is the SAME as method line 43 public void remove()
		position --;
		removeOK = false;
		
	}

}









