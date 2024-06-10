package Map;
import java.util.*;
import java.util.Collections;
class HashtableEx1_DataStructure {
	public static void main (String []arg) {
		Hashtable h = new Hashtable (25);
		h.put(new HashtableEx1(5), "A");
		h.put(new HashtableEx1(2), "B");
		h.put(new HashtableEx1(6), "C");
		h.put(new HashtableEx1(15), "D");
		h.put(new HashtableEx1(23), "E");
		h.put(new HashtableEx1(16), "F");
		//h.put("durga", null); //NPE
		System.out.println(h);
	}
}

class HashtableEx1 {
	
	int i;
	
	HashtableEx1(int i){
		this.i=i;
	}
	public int hashcode() {
		return i;
	}
	public String toString() {
		return i+"";
}}
