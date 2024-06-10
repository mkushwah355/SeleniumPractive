package Map;
import java.util.*;

public class TreeMapEx2_Comparator {
	
	public static void main (String []arg) {
		
		TreeMap m= new TreeMap (new mycomparator());
		m.put("XXX",10);
		m.put("AAA", 20);
		m.put("ZZZ", 30);
		m.put("LLL", 40);
		System.out.println(m); //{ZZZ=30, XXX=10, LLL=40, AAA=20}
}}
 class mycomparator implements Comparator {
	 public int compare (Object obj1, Object obj2) {
		 String S1= obj1.toString();
		 String S2= obj2.toString();
		 return S2.compareTo(S1);
	 }
 }