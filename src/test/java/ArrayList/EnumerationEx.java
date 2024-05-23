package ArrayList;
import java.util.*;

import org.checkerframework.checker.units.qual.C;

public class EnumerationEx {
	
	public static void main (String []arg) {
	Vector v= new Vector();
	for (int i=0; i<=10; i++) {
		v.addElement(i);
	}
	System.out.println(v);//[0,1,2,3,4....,10]
	 Enumeration e= v.elements();
	 while (e.hasMoreElements()) {
		 Integer I = (Integer)e.nextElement();
// to print only even numbers from the list		 
		 if(I%2==0) {
			 System.out.println(I); //0 2 4 6 8 10
			} 	 
	 }
	 //System.out.println(v);

}}
