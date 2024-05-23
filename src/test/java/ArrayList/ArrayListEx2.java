package ArrayList;

import java.io.Serializable;
import java.util.*;

public class ArrayListEx2 {
	public static void main (String []arg) {
	
	ArrayList l1= new ArrayList();
	LinkedList l2= new LinkedList();
	System.out.println(l1 instanceof Serializable);//true
	System.out.println(l2 instanceof Serializable);//true
	System.out.println(l1 instanceof Cloneable);//true
	System.out.println(l2 instanceof Cloneable);//true
	System.out.println(l1 instanceof RandomAccess);//true
	System.out.println(l1 instanceof RandomAccess);//true
	System.out.println(l2 instanceof RandomAccess);//false
	}

}
