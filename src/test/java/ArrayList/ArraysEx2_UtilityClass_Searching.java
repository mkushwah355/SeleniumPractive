package ArrayList;
import java.util.*;
import static java.util.Arrays.*;

public class ArraysEx2_UtilityClass_Searching {

	public static void main(String[] args) {
		
		int [] a= {10,5,20,11,6};
		Arrays.sort(a);//sort by natural order
		System.out.println(Arrays.binarySearch(a, 6));//1
		System.out.println(Arrays.binarySearch(a, 14));//-5
		
		String[] s= {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(binarySearch(s,"Z"));//2
		System.out.println(binarySearch(s, "S"));//-3
		
		Arrays.sort(s,new mycomparator3());
		System.out.println(binarySearch(s,"Z", new mycomparator3()));//0
		System.out.println(binarySearch(s,"S", new mycomparator3()));//-2
		System.out.println(binarySearch(s,"N"));//unpredictable result//-4
}}
class mycomparator3 implements Comparator {
	
	public int compare (Object obj1, Object obj2) {
		String s1= obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
