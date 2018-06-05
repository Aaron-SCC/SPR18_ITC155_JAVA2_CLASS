import java.io.*;
import java.util.*;

// second version of ArrayIntList to store a list of ints
public class ArrayIntList {
	
	// instance var
	private int[] elementData;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 100; // always have this CONSTANT WELL DEFINED
	
	// constructor(s)
	public ArrayIntList(){      // this one will be invoked in no capacity from Client1
		this(DEFAULT_CAPACITY);
	}

	public ArrayIntList(int capacity) {      // this one will be invoked in A SPECIFIED capacity from Client1
		// TODO Auto-generated constructor stub
		if(capacity < 0){
			throw new IllegalArgumentException("capacity " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
		
	}
	
	
	// methods
	
	// return the current number of elements in the list
	public int size(){
		return size;
		
	}
	
	
	//  pre: 0 <= index < size()
	// post: return the integer value at the given value in the list 
	public int get(int index){
		checkIndex(index); // helper method is checkIndex 
		return elementData[index];
	}
	
	
	// HELPER METHOD
	// throw an exception if index is not legal for current list
	private void checkIndex(int index){
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException("index " + index);
		}
	}
	
	
	// create a comman separated bracketed version of the list
	// fence post algorithm 
	public String toString(){
		if(size == 0){
			return "[]";
		} else {
			// fence post
			String result = "[" + elementData[0];
			for(int i = 1; i < size ; i++){
				result += ", "  + elementData[i];
			}
			result += "]";
			return result;
		}
		
	}
	
	
	
	// return position of first occurrence of the value
	// -1 is not found
	public int indexOf(int value){
		for(int i = 0 ; i < size ; i++){
			if(elementData[i] == value){
				return i;
			}
		}
		return -1; 
	}
	
	
	// return true if list is empty
	public boolean isEmpty(){
		return size == 0; // return true if size is 0
	}
	
	// return true if a value is in the list
	public boolean contains(int value){
		return indexOf(value) >= 0 ;
	}
	
	
	
	// overloaded methods
	    // overloaded methods
	        // overloaded methods
	public void add(int value){
		ensureCapacity(size + 1); // helper method ensureCapacity
		elementData[size] = value;
		size ++;
	}
	
	
	
	// append the value to the end of the list
	public void add(int index, int value){
		checkIndex(index);
		ensureCapacity(size + 1); // helper method ensureCapacity
		for(int i = size ; i > index ; i--){
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}
	        // overloaded methods
	    // overloaded methods    
	// overloaded methods

	
	
	
	
	// ensure that array is given capacity or double the size
	private void ensureCapacity(int capacity) { // helper method
		// TODO Auto-generated method stub
		if(capacity > elementData.length) {
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity){
				newCapacity = capacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}
	
	
	// remove value at a given index; need to shift subsequent values to left
	public void remove(int index){
		checkIndex(index);
		for(int i = index ; i < size ; i++){
			elementData[i] = elementData[i + 1];
		}
		size--;
		
	}
	
	
	// replace an int at a given index with a new value
	public void set(int index, int value){
		checkIndex(index);
		elementData[index] = value;
	}
	
	// the list is empty
	public void clear(){
		size = 0;
	}
	
	
	// append all values in the list to the end of this list
	public void addAll(ArrayIntList other){
		ensureCapacity(size + other.size());
		for(int i = 0 ; i < other.size ; i++){
			add(i,other.elementData[i]);
		}
	}
	
	public ArrayListIterator iterator(){
		return new ArrayListIterator(this);
	}
	
	// EXERCISE (1)
	public int lastIndexOf(ArrayIntList values, int indexValue) {
		int index = -1;
		for (int i = 0 ; i < values.size ; i++) {
			if (get(i) == indexValue) {
				index = i;
			}
		}
		return index;
	}
	
	
	// EXERCISE (3)
	public void replaceAll(int initValue, int replaceValue) {
		for (int i = 0 ; i < size ; i++) {
			if (elementData[i] == initValue) {
				elementData[i] = replaceValue;
			}
		}
	}
	

}
















