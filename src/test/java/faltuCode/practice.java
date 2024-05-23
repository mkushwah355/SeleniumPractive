package faltuCode;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class practice implements Comparable{
	
	String name;
	int id;
	
	practice(String name, int id){
		this.name=name;
		this.id= id;
}  
	public String toString() {
		return name+"--"+id;
	}
	public int compareTo(Object obj) {
		 
		 int id1= this.id;
		 practice I1= (practice)obj;
		 int id2= I1.id;
		 if (id1<id2)
			 return -1;
		 else if(id1>id2)
			 return +1;
		 else 
			 return 0;
		 
	 }
	
	public static void main (String []arg) {
		
		practice e1= new practice("nag", 101);
		practice e2= new practice("sag",102);
		practice e3= new practice("chag",103);
		practice e4=new practice ("baag",104);		
		
		ArrayList t= new ArrayList();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		TreeSet t1= new TreeSet(new mycomparator7());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
}}

class mycomparator7 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		practice c1= (practice)obj1;
		practice c2=(practice)obj2;
		String S1=c1.name;
		String S2=c2.name;
		return S1.compareTo(S2);
	}

}


	 