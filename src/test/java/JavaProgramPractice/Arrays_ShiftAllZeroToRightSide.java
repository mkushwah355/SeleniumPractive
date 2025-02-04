package JavaProgramPractice;
import java.util.Arrays;

//Shift All Zero to Right Side
 class Arrays_ShiftAllZeroToRightSide {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= {1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1};
		
		 int count=0;
//fill all non-zero numbers		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {
				 a[count]=a[i];
				 count++;
			 }			 
		 }
//place zero up to the length of array		 
		 while(count < a.length) {
			 a[count++]=0;
		 }
		 System.out.println(Arrays.toString(a));		 
	 }	 
 }
