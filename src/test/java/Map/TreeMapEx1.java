package Map;
import java.util.*;
public class TreeMapEx1 {

	public static void main (String []arg) {
		
		TreeMap t= new TreeMap ();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		//t.put("FFFF", "XXX"); //RE: CCE(ClassCastExcpetion)
		//t.put(null, "XXX");  //RE: NPE(NullPointerException)
		System.out.println(t);
	}
}
