package ArrayList;

import java.util.ArrayList;

/*Aim: To print the unique element of list(finding the missing element )*/

public class RemoveAllMethod {
			
	public static void main (String [] arg){
		ArrayList<String> FL = new ArrayList<String>();
		FL.add("Apple");
		FL.add("Orange");
		FL.add("Grape");
		System.out.println("First list: " + FL);	
				
		ArrayList<String> SL = new ArrayList<String>();
		SL.add("Apple");
		SL.add("Grape");
		SL.add("Papaya");
		//SL.add("Papaya");
		System.out.println("Second list: " + SL);
		
		//removes all elements from the first list  
		//returns empty list if all the elements of first list match with elements of second list
		SL.removeAll(FL);
		//prints the element of second list which does not match with the element of the first list 
		System.out.println("Unique element of second list: " +SL);		
	}
}
