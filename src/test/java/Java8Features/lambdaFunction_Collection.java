package Java8Features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer I1, Integer I2) {
		
		return I1<I2?-1:(I1>I2)?1:0;
		if (I1<I2) {
			return -1;}
		else if(I1>I2) {
			return +1;
		}else
			return 0;		
}}*/
public class lambdaFunction_Collection {
	public static void main(String[] arg) {

		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(5);
		AL.add(11);
		AL.add(2);
		AL.add(7);
		System.out.println(AL);
	//	Collections.sort(AL, new MyComparator());
		Comparator<Integer> MyComparator=(I1,I2)-> I1<I2?-1:(I1>I2)?1:0;
		Collections.sort(AL, MyComparator);
		System.out.println(AL);
//to print the elements of AL list one by one. Like a for loop		
		AL.stream().forEach(System.out::println);
//to filter the list for even number
		List<Integer> AL2= AL.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(AL2);
		
	}
}
