package Set;
import java.util.*;

public class TreeSet_StringBufferEx2 {
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet ();
		//StringBuffer & StringBuilder both implements comparable interface and will not through ClassCastException 
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t);	
		/*t.add(new StringBuilder("A"));
		t.add(new StringBuilder("Z"));
		t.add(new StringBuilder("L"));
		t.add(new StringBuilder("B"));
		System.out.println(t);*/
		
	}

}
