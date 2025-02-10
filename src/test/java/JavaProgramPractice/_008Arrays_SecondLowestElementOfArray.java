package JavaProgramPractice;

import java.util.Arrays;
//Find second lowest element of an array with for loop.
class _008Arrays_SecondLowestElementOfArray {		
	public static void main(String []arg) {
		
		int[] a= {1,3,4,6,1,9};
		
		int lowest=Integer.MAX_VALUE;//2147
		int second_lowest= Integer.MAX_VALUE;//2147
			
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<lowest) {
				second_lowest=lowest;
				lowest=a[i];
			} else if(a[i]<second_lowest && a[i]!=lowest) {
				second_lowest=a[i];
			}
		} System.out.println("Lowest elemet of array: "+lowest);
		  System.out.println("Second lowest Element: "+second_lowest);	
	}
}
//Find second lowest element of an array with sort() method.
//This approach will not work if array contain duplicate numbers. Then it will not give correct second lowest number through indexing.
 class Arrays_SecondLowestElementOfArrayWithSortMethod{
	 
	 public static void main (String[]arg) {
		 int[] a= {1,3,4,6,9};
		 
		 Arrays.sort(a);
		 System.out.println("Second Lowest element: "+a[1]);
		 
	 }
	 
 }