package JavaIntPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class List_uniqueElements {
	
	public static void main(String []arg) {
		
		String []a1= {"A","C","D","B"};
		String []a2= {"H","G","C","E"};
		
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList(a1));
		ArrayList<String> list2= new ArrayList<String>(Arrays.asList(a2));
		
		ArrayList<String> unCommon1= new ArrayList(list1);
		ArrayList<String> unCommon2= new ArrayList(list2);
		
		unCommon1.removeAll(unCommon2);
		unCommon2.removeAll(unCommon1);
		
		ArrayList result= new ArrayList();
		
		result.addAll(unCommon1);
		result.addAll(unCommon2);
		
//print all unique elements after comparing two list		
		Collections.sort(result);
		System.out.println(result);		
	}

	}

