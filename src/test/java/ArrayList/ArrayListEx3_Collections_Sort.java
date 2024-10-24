package ArrayList;
import java.util.*;
public class ArrayListEx3_Collections_Sort {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10)); //RE: CCE
		//l.add(null); //NPE
		System.out.println("Before sorting:" +l); //[Z, A, K, N]
		Collections.sort(l);
		System.out.println("After sorting:" +l); //[A, K, N, Z]
	}

}
