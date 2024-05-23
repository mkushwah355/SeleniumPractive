package Set;
import java.util.*;
//Write a program to insert integer objects into the TreeSet where the sorting order is descending order?
//Expected result = [20,15,10,5,0]	
 class TreeSet_comparatorEx5{
	
	public static void main (String []arg) {
		
		TreeSet t= new TreeSet (new myComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);	
	}}
class myComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer I1= (Integer)obj1;
		Integer I2= (Integer)obj2;
//Comparator case 1- default natural sorting order(ascending order)		
		//return I1.compareTo(I2); //[0, 5, 10, 15, 20]
//case 2- 	Descending orders	
		//return -I1.compareTo(I2); //[20, 15, 10, 5, 0]
//case 3- Descending orders	
		//return I2.compareTo(I1);// [20, 15, 10, 5, 0]
//case 4- Ascending order		
		//return -I2.compareTo(I1);//[0, 5, 10, 15, 20]
//case 5- Insertion order
		//return +1; //[10, 0, 15, 5, 20, 20]
//case 6- Reverse of insertion order
		//return -1; //[20, 20, 5, 15, 0, 10]
//case 7- only first element will be inserted and all remaining are considered as duplicate	
		return 0; //[10]
}};