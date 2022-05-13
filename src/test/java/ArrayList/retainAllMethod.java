package ArrayList;

import java.util.ArrayList;

/*Aim: To print the common elements of list*/

public class retainAllMethod {
	
	public static void main (String []arg){
		
		ArrayList<String> FL = new ArrayList<String>();
		FL.add("Apple");
		FL.add("Orange");
		FL.add("Grape");
		FL.add("Papaya");
		System.out.println("first list of fruit: " + FL);
		
		ArrayList<String> SL = new ArrayList<String>();
		SL.add("Orange");
		SL.add("Grape");
		SL.add("Papaya");
		SL.add("Watermelon");
		SL.add("Guava");
		System.out.println("Second list of fruits: " + SL);
		
		//returns the common elements in both list  
		FL.retainAll(SL);
		System.out.println("Common fruits in both list: " + FL);
		
		
		
	}
	
	
}
