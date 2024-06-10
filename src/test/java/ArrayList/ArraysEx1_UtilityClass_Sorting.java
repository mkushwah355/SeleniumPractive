package ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1_UtilityClass_Sorting {
	public static void main(String[] args) {
		
		int [] a= {10,5,20,11,6};
		System.out.println("Primitive Array before sorting:");
		for (int a1:a) {
			System.out.println(a1); //10,5,20,11,6
		}		
	    Arrays.sort(a);
	     System.out.println("Primitive Array after sorting:");
	     for (int a1:a) {
	    	 System.out.println(a1); //5,6,10,11,20
	     }
	     
	     String [] s= {"A","Z","B"};
	     System.out.println("Object Array before sorting:");
	     for (String a2:s) {
	    	 System.out.println(a2); //A,Z,B
	     }
	     Arrays.sort(s);
	     System.out.println("Object Array after sorting:");
	     for (String a2:s) {
	    	 System.out.println(a2);//A,B,Z
	     }
	     Arrays.sort(s, new mycomparator2());
	     System.out.println("Object Array after sorting by comparator:");
	     for (String a2:s) {
	    	 System.out.println(a2);//Z,B,A
}}}

class mycomparator2 implements Comparator {
	public int compare (Object obj1, Object obj2) {
		String s1= obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
