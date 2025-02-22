package JavaProgramPractice;
import java.util.*;

//Aim: Reverse integer array
class _019Arrays_ReverseIntArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};	

		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]);	
		}
	}
}

//Aim: Reverse integer array WITHOUT storing into string.
class _019Arrays_ReverseIntArrayWhileLoop{
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		
		int x=0 , y= a.length-1;
		
		while(x<y) {
			
			int temp= a[x];
			a[x]=a[y];
			a[y]= temp;
			
			x++;
			y--;
		}
		System.out.println(Arrays.toString(a));	
	}
}