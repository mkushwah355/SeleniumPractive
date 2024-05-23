package Set;
import java.util.*;

public class TreeSet_comparatorEx6 {
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet (new myComparator2());
		t.add("Roja");
		t.add("Shobha");
		t.add("Rani");
		t.add("Ganga");
		t.add("Ranikumari");
		System.out.println(t);}
}
class myComparator2 implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
//If internal objects are String type then below type casting is good.		
		String S1= (String)obj1;
//if internal objects are String, StringBuffer, StringBuilder or any then toString() will convert into String object. 		
		String S2= obj2.toString(); 		
		//return S1.compareTo(S2);  //Ascending order---[Ganga, Rani, Ranikumari, Roja, Shobha]
		//return -S1.compareTo(S2); //Descending order--[Shobha, Roja, Ranikumari, Rani, Ganga]
		return S2.compareTo(S1);    //Descending order--[Shobha, Roja, Ranikumari, Rani, Ganga]

	}
	
	
}
