package Set;
import java.util.*;

public class HashSetEx1 {
	public static void main (String []arg) {
		
		HashSet h= new HashSet ();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false
		System.out.println(h);	
	}

}
