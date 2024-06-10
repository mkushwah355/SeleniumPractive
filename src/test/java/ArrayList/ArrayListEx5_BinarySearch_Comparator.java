package ArrayList;
import java.util.*;
public class ArrayListEx5_BinarySearch_Comparator {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l); //[15, 0, 20, 10, 5]
		Collections.sort(l,new mycomparator1());
		System.out.println(l); //[20, 15, 10, 5, 0]
		System.out.println(Collections.binarySearch(l,10, new mycomparator1()));//2
		System.out.println(Collections.binarySearch(l,13,new mycomparator1()));//-3
		System.out.println(Collections.binarySearch(l,17));//-6
		System.out.println(Collections.binarySearch(l,17,new mycomparator1()));//-2
}}

class mycomparator1 implements Comparator {
	public int compare (Object obj1, Object obj2) {
		Integer I1= (Integer)obj1;
		Integer I2= (Integer)obj2;
		return I2.compareTo(I1);
	}
}
