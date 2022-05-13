package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*Aim: To compare the two list and display the boolean result as true and false.*/

public class containsMethod {
	
	public static void main (String [] arg){
		
		ArrayList<String> FL = new ArrayList<String>();
		FL.add("Apple");
		FL.add("Orange");
		FL.add("Grape");
		FL.add("Papaya");
		System.out.println("First list of fruit: " + FL);
		
		ArrayList<String> SL = new ArrayList<String>();
		SL.add("Orange");
		SL.add("Grape");
		SL.add("Papaya");
		SL.add("Watermelon");
		SL.add("Guava");
		System.out.println("Second list of fruits: " + SL);
		
		//it is comparing the two list and displaying the result as True or False
		boolean result= SL.contains(FL);
		System.out.println("Both list contain same fruits: " +result);
		
		SL.removeAll(FL);
		for (String s3 : SL) {
			System.out.println("Mismatch fruit names: " +s3);
		}}}
	

