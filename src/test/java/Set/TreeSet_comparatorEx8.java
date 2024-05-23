package Set;
import java.util.*;

 class TreeSet_comparatorEx8 {
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet(new mycomparator4());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}}
 class mycomparator4 implements Comparator {
	 
	 public int compare (Object obj1, Object obj2) {
		 String S1= obj1.toString();
		 String S2= obj2.toString();
		 int L1= S1.length();
		 int L2= S2.length();
		 
		 if(L1<L2)
			return -1;  //means before
		 else if(L1>L2)
			 return +1; //means after
		 else
			 return S1.compareTo(S2);
		 
	 }
	 
 }