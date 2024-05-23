package Set;
import java.util.*;

public class HashSetDuplicates {
	
	public static void main (String []arg) {
		
		HashSet h= new HashSet ();
		h.add("A");
		h.add("A"); // Duplicates will be ignored from HashSet object without compile and runtime error.
		System.out.println(h);
		System.out.println(h.add("B"));
		System.out.println(h.add("B"));// False will return if duplicates are present in HashSet
		
	}

}
