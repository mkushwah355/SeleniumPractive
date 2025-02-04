package JavaProgramPractice;

import java.util.Arrays;

//Shift All Zero to left Side
 class Arrays_ShiftAllZeroToLeftSide {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= { 1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1 };
		
		 int count=a.length-1;  
		 
//fill all non-zero numbers		 
		 for(int i=a.length-1;i>=0;i--) {
			 if(a[i]!=0) {
				 a[count]=a[i];
				 count--;
			 }			 
		 }
//place zero up to the length of array		 
		 for(int i=0; i<count;i++) {
			 a[i]=0;
		 }
		 System.out.println(Arrays.toString(a));		 
	 }	 
 }
