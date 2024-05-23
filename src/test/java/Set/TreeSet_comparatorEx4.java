package Set;
import java.util.*;
//Write a program to insert integer objects into the TreeSet where the sorting order is descending order?
//Expected result = [20,15,10,5,0]	
 class TreeSet_comparatorEx4 {
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet (new myComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t); //[20,15,10,5,0]		
	}}
class myComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer I1= (Integer)obj1;
		Integer I2= (Integer)obj2;
		if (I1<I2)
			return +1;
		else if (I1>I2)
			return -1;
		else
			return 0;}}