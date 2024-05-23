package Set;
import java.util.*;
//
public class TreeSet_comparatorEx7 {

	public static void main (String []arg) {
		
		TreeSet t= new TreeSet(new mycomparator3());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);	}
}
class mycomparator3 implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		
		String S1= obj1.toString();
		String S2= obj2.toString();
		return S1.compareTo(S2);   //Ascending order--[A, K, L, Z]
		//return -S1.compareTo(S2); //Descending order--[Z, L, K, A]
		//return S2.compareTo(S1);    //Descending order--[Z, L, K, A]
		
	}
}


