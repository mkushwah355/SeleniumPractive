package JavaProgramPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Aim: Shift All Zero to left Side through for loop
 class Arrays_ShiftAllZeroToLeftSide {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= { 1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1 };
		
		 int count=a.length-1;  
		 
// Move all non-zero elements to the end of the array	 
		 for(int i=a.length-1;i>=0;i--) {
			 if(a[i]!=0) {
				 a[count]=a[i];
				 count--;
			 }			 
		 }
// Fill the beginning of the array with zeros	
//{_, _, _, _, _, _, _, _, _, _, 1, 5, 2, 9, 3, 4, 7, 5, 6, 1}	--Array & count=3 after for loop	 
		 while (count >= 0) {
	            a[count--] = 0;
	        }
		 System.out.println(Arrays.toString(a));		 
	 }	 
 }
//Aim: Shift All Zero to left Side through collection
class Arrays_ShiftAllZeroToLeftSideThroughCollection {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= {1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1};
		
		 List<Integer> list = new ArrayList<Integer>();	
		 
		for(int i=0;i<a.length;i++) {
			 if(a[i]==0) {
				 list.add(a[i]);
			 }			 
		 }
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {
				 list.add(a[i]);
			 }			 
		 }
		 System.out.println(list);		 
	 }	 
 } 
 
 