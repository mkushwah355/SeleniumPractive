package Queue;
import java.util.*;
public class PriorityQueueEx2 {
	public static void main (String []arg) {
		
		PriorityQueue q= new PriorityQueue (15, new mycomparator());
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		System.out.println(q); //[Z,L,B,A]
}}
class mycomparator implements Comparator {
	public int compare (Object obj1, Object obj2) {
		
		String s1= (String)obj1;
		String s2= obj2.toString();
		return s2.compareTo(s1);
}}
