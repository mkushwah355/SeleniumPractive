package Java8Features;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;

public class stream_SortedList {

		public static void main(String[] arg) {
			ArrayList<Integer> AL = new ArrayList<Integer>();
			AL.add(0);
			AL.add(10);
			AL.add(20);
			AL.add(5);
			AL.add(15);
			AL.add(25);
			System.out.println("ArrayList: "+AL);		
//to sort a list in natural sorting order 
			List<Integer> L2=AL.stream().sorted().collect(Collectors.toList());
			System.out.println("Sorted list: "+L2);
	}}

