package Map;
import java.util.*;

public class LinkedHashMapEx1 {
	public static void main (String []arg) {
		
		LinkedHashMap m= new LinkedHashMap (); //insertion order preserved
		m.put("Chirag", 700); //values will print acc. to their hashcode value
		m.put("Bala", 800);
		m.put("Venky", 200);
		m.put("Naresh", 500);
		System.out.println(m); //{Venky=200, Chirag=700, Bala=800, Naresh=500}
		System.out.println(m.put("Chirag", 1000)); //700
		
		Set s=m.keySet();
		System.out.println(s); //[Venky, Chirag, Bala, Naresh]
		
		Collection c= m.values();
		System.out.println(c);// [200, 1000, 800, 500]
		
		Set s1= m.entrySet();
		System.out.println(s1); //[Venky=200, Chirag=1000, Bala=800, Naresh=500]
		Iterator itr= s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1= (Map.Entry)itr.next(); //type casting.object is Entry type and it is inner interface of Map
			System.out.println(m1.getKey()+"....."+m1.getValue());
			if (m1.getKey().equals("Naresh")) {
				m1.setValue(1000);
			}
		}
		System.out.println(m);
	}

}
