package ArrayList;
import java.util.*;

public class IteratorEx1 {
	
	public static void main (String []arg) {
		
		ArrayList l= new ArrayList();
		
		for (int i=0; i<=10; i++) {
			l.add(i);			
		}
		System.out.println(l);
		
		Iterator itr= l.iterator();
		while(itr.hasNext()) {
			Integer I= (Integer)itr.next();
// to print only even number and remove odd numbers from the list
			if(I%2==0) 
				System.out.println(I);
			else 
				itr.remove();		  //it will remove(odd) the objects from the iterating list of 0 to 10
		}
		System.out.println(l);
}}
