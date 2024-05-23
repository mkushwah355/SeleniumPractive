package LinkedList;
import java.util.*;

public class LinkedListEx1 {

	public static void main (String []arg) {
		
		LinkedList l= new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);//[durga, 30, null, durga]
		l.set(0,"software");
		System.out.println(l);//[software, 30, null, durga]
		l.add(0,"venky");
		System.out.println(l);//[venky, software, 30, null, durga]
		l.removeLast();
		System.out.println(l);//[venky, software, 30, null]
		l.addFirst("CCC");
		System.out.println(l);//[CCC, venky, software, 30, null]		
	}
	
}
