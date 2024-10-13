package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx4_Collections_Sort_Comparator {
public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		//l.add(new Integer(10)); //RE: CCE
		//l.add(null); //NPE
		System.out.println("Before sorting:" +l); //[Z, A, K, L]
		Collections.sort(l, new mycomparator());
		System.out.println("After sorting:" +l); //[Z, L, K, A]
}}
class mycomparator implements Comparator{
	public int compare (Object obj1, Object obj2) {
		String s1= (String)obj1;
		String s2= obj2.toString();
		return s2.compareTo(s1); 
		
	}
}
