package Java_8Features;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;

public class stream_evenOddFilter {

	public static void main(String[] arg) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(0);
		AL.add(10);
		AL.add(20);
		AL.add(5);
		AL.add(15);
		AL.add(25);
		System.out.println("ArrayList: "+AL);
		//Filter even numbers from Arraylist and store in another list.

		//without streams (until 1.7V)
		List<Integer> L = new ArrayList<Integer>();

		for (Integer L1 : AL) {
			if (L1 % 2 == 0) {
				L.add(L1);
			}
		}
		System.out.println("Even numbers without stream: " + L);
	
	//with stream from 1.8V 
		List<Integer> L2=AL.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("Even numbers with stream: "+L2);
}}