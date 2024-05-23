package ArrayList;
import java.util.*;

public class ListIteratorEx1 {
	
	public static void main (String []arg) {
		
		LinkedList l= new LinkedList();
		l.add("Monu");
		l.add("Sonu");
		l.add("Golu");
		l.add("Pelu");
		l.add("Tonu");		
	   System.out.println(l);
		
		ListIterator ltr= l.listIterator();
		while(ltr.hasNext()) {			
			String s1= (String)ltr.next();
			if (s1.equals("Tonu")){
			     ltr.remove(); }  //it will remove Tonu from the list.
			else if(s1.equals("Golu")) {
				ltr.add("Tillu");} //it will add Tillu in the list.
			else if (s1.equals("Pelu")) {
				ltr.set("Jilu");//it will update(set) Pilu to Jilu in the list.
			}}
		System.out.println(l);}
}
