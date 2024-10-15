package Map;
import java.util.*;

//Hashtable works from "Top to bottom" and "Right to left" and its indexing starts from zero.

class HashtableEx1_DataStructure {
	
	public static void main (String []arg) {
		Hashtable h = new Hashtable ();
		h.put(new HashtableEx1(5), "A");   //5%11= 5(index of bucket in hashtable)
		h.put(new HashtableEx1(2), "B");   //2%11= 2
		h.put(new HashtableEx1(6), "C");   //6%11= 6
		h.put(new HashtableEx1(15), "D");  //15%11= 4
		h.put(new HashtableEx1(23), "E");  //23%11= 1
		h.put(new HashtableEx1(16), "F");  //16%11= 5
		//h.put("durga", null); //NPE
		System.out.println(h); //{23=E, 5=A, 15=D, 16=F, 2=B, 6=C}
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
