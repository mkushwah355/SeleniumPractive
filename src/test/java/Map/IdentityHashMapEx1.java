package Map;
import java.util.*;
public class IdentityHashMapEx1 {
	
	public static void main (String []arg) {
		
		Integer I1= new Integer (10);
		Integer I2= new Integer (10);
//In HashMap, JVM will use equals() method to identify duplicate keys.		
		HashMap m1= new HashMap (); 
		m1.put(I1,"Pawan");
		m1.put(I2,"Kalyan");
		System.out.println(m1);
//In identityHashMap, JVM will use ==operator to identify duplicate keys.		
		IdentityHashMap m2= new IdentityHashMap (); 
		m2.put(I1,"Pawan");
		m2.put(I2,"Kalyan");
		System.out.println(m2);
	}

}
