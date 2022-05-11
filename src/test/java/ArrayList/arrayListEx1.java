package ArrayList;

import java.util.*;import org.apache.tools.ant.types.resources.selectors.Size;

public class arrayListEx1 {
	public static void main (String []arg){
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("BMW");		
		cars.add("Honda");
		cars.add("Audi");
		
		int size= cars.size();
		System.out.println("Size of Arraylist: " + size);
		
		for (int i = 0; i < size; i++) {
			System.out.println("get i text: "+i + cars.get(i));
			Collections.sort(cars);}
		System.out.println("Index of array: " +cars.get(3));
		Collections.sort(cars);
		//using for-each loop
/*	for(String car: cars){
		
		System.out.println(car);*/
		
		//using Iterator
		Iterator<String> itr = cars.iterator();
		while(itr.hasNext()){
			System.out.println("List: " + itr.next());
		}
		//Removing the element
		
		cars.remove(size-1);
		for(String carsss:cars){
			System.out.println(carsss);
		}
		
	}	
	
}
