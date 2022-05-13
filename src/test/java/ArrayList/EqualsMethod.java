package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*Aim: To compare the two list and display the boolean result as true and false.*/

public class EqualsMethod {
	
	public static void main (String [] arg){
		
		ArrayList<String> firstList = new ArrayList<String>();
		firstList.add("Apple");
		firstList.add("Mango");
		firstList.add("Grapes");
		Collections.sort(firstList);
		System.out.println("First list of Fruits: " + firstList);
		
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("Grapes");
		secondList.add("Mango");
		secondList.add("Apple");		
		Collections.sort(secondList);
		System.out.println("Second list of fruits: " + secondList);
		
		boolean result= firstList.equals(secondList);		
		System.out.println("Comparison result :" + result);
				
	}

}
