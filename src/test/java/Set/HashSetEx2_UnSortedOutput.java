package Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx2_UnSortedOutput {	  
	
	public static void main (String [] arg) {		
//Insertion order not preserved		
		Set<Integer> HS = new HashSet<>();
		HS.add(25);
		HS.add(12);
		HS.add(42);
		HS.add(3);
		HS.add(9);
		System.out.println("HS-> "+HS); //[3, 25, 9, 42, 12]
		
//Insertion order preserved			
		Set<Integer> LHS = new LinkedHashSet<>();
			LHS.add(25);
			LHS.add(12);
			LHS.add(42);
			LHS.add(3);
			LHS.add(9);
		System.out.println("LHS-> "+LHS); //[3, 25, 9, 42, 12]
//TreeSet for natural sorting order
//We cannot use Collections.sort() or Collections.sort(HS, new Comparator()); on Set and map.
//Collections.sort is specifically for List type.
		Set<Integer> TS = new TreeSet<>(LHS);
		TS.add(25);
		TS.add(12);
		TS.add(42);
		TS.add(3);
		TS.add(9);
		System.out.println("TS-> "+TS); //[3, 9, 12, 25, 42]
		
	}	
	
}
