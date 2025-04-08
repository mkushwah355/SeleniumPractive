package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class List_SortedOutput {	  
	
	public static void main (String [] arg) {		
	
		List<Integer> AL = new ArrayList<>();
		AL.add(25);
		AL.add(12);
		AL.add(42);
		AL.add(3);
		AL.add(9);
		System.out.println("AL-> "+AL); //[25, 12, 42, 3, 9]--Insertion order preserved	
				
		List<Integer> LS = new LinkedList<>(AL);
		LS.add(25);
		LS.add(12);
		LS.add(42);
		LS.add(3);
		LS.add(9);
		System.out.println("LS-> " + LS); //[25, 12, 42, 3, 9, 25, 12, 42, 3, 9]--Insertion order preserved	with additional objects
		
		Collections.sort(AL);
		System.out.println("AL-> "+AL);//[3, 9, 12, 25, 42]--Natural Sorted list(Ascending)
		
		Collections.sort(AL, new Comparator<Integer>(){
			public int compare(Integer Obj1, Integer Obj2) {
				return Obj2.compareTo(Obj1);
			}
		});
		System.out.println("AL-> "+AL); //[42, 25, 12, 9, 3]--Customize Sorted list(Descending)
		
	}	
	
}
