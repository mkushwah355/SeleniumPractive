package Map;
import java.util.*;

 class WeakHashMapEx1 {
	
	public static void main (String []arg) throws Exception {
		
		//HashMap m= new HashMap ();
		WeakHashMap m= new WeakHashMap ();
		Temp t= new Temp ();
		m.put(t, "durga");
		System.out.println(m);
		t=null;
		System.gc();
		//Thread.sleep(5000);
		System.out.println(m);
}}
class Temp {
	public String toString() {
		return "temp";
	}
	public void finalize () {
		System.out.println("Finalize method called");
	}
}
