package ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

//hasNext(), next(), nextIndex(), hasPrevious(),previous(), previousIndex(), remove(),add(), set()
public class ListIteratorEx2_pevious {

	public static void main(String[]arg) {
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("BMW");
		cars.add("BMW");		
		cars.add("Honda");
		cars.add("Audi");
		
		ListIterator<String> LE=cars.listIterator(cars.size()); // without size() method it won't work
		while (LE.hasPrevious()) {
			String S1= (String)LE.previous();
			System.out.println(S1);				
}}
}
