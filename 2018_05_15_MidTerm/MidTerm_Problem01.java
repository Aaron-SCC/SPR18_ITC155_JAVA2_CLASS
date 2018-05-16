import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;



public class MidTerm_Problem01  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("THIS IS A TEMPLATE MidTerm Problem #01 \n\n");
		
		Scanner console = new Scanner(System.in);
		
		
		List<Integer> list = new LinkedList<Integer>()  ;
		
		list.add(-5729);
		list.add(-5729);
		list.add(-5729);
		list.add(105 );
		list.add(28);
		list.add(-28);
		list.add(105);
		list.add(-5729);
		list.add(1);
		list.add(101);
		
		//list.add();
		
		
		
		System.out.println(list);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("list mode is " + maxOccurrences(list) + "\n\n\n\n");
		
		List<Integer> list02 = new LinkedList<Integer>()  ;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(list02);
		

		System.out.println("list mode02 is " + maxOccurrences(list02) + "\n\n\n\n");
		
	}
	
	public static int maxOccurrences (List list)  {
		int mode = 0;
		int modeCount = 0;
		
		TreeMap<Integer,Integer> mapOccurrences = new TreeMap<Integer,Integer>(); 
		
		if (list.size() == 0){ // CHECK FOR EMPTY LIST 
			System.out.println("mode IS ZERO    since EMTPY LIST !!!! ");
			return modeCount;
		} else { // ELSE WE HAVA LIST   TO  P R O C E S S  !!!!
			Iterator<Integer> i = list.iterator();
			//while (list.hasNext()){
			while (i.hasNext()){
				int element = i.next();
				System.out.println(element);
				if (!mapOccurrences.containsKey(element)) {
					mapOccurrences.put(element, 1);
				} else {
					int count = mapOccurrences.get(element);
					mapOccurrences.put(element, count + 1);
				}
			}
			
			modeCount = Collections.max(mapOccurrences.values());			
		}

		
		System.out.println();
		System.out.println();
		System.out.println(mapOccurrences);
		System.out.println();
		return modeCount;
	}

}












