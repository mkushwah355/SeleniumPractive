package JavaProgramPractice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

//Aim: print all unique elements, print common elements	& remove common elements
class List_uniqueElements2 {

	public static void main(String[] arg) {

		ArrayList<Integer> AL1 = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3));
		ArrayList<Integer> AL2 = new ArrayList<Integer>(Arrays.asList(2, 7, 1, 3));
		
//print all unique elements(set remove duplicates)
		Set<Integer> S2= new HashSet<Integer>(AL1);
		S2.addAll(AL2);
		System.out.println("All unique elements: "+S2);
		
//print common elements		
		Set<Integer> S3= new HashSet<Integer>(AL1);
		S3.retainAll(AL2);
		System.out.println("Common elements: "+S3);
		
//remove common elements		
		S2.removeAll(S3);
		System.out.println("Most unique element: "+S2);
	}

}

