package Set;
import java.util.*;

public class TreeSetEx1 {
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet ();
		t.add("A");  //unicode value is 65
		t.add("a");  //unicode value is 97, so small "a" is bigger than capital "A"
		t.add("B");
		t.add("Z");
		t.add("L");
		/*t.add(new Integer(10));//CCE as heterogeneous objects are not allowed.
		t.add(null); //NPE
		*/
		//Capital "A" will print first compare to small "a" due to unicode value.
		System.out.println(t); // [A,B,L,Z,a] , default natural sorting order(Ascending order for String objects).
	}
}
