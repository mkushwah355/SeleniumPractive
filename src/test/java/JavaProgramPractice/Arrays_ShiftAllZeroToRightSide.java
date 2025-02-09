package JavaProgramPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Aim: Shift All Zero to Right Side with for loop.
 class Arrays_ShiftAllZeroToRightSide {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= {1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1};
		
		 int count=0;
//fill all non-zero numbers		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {   	//a[1]!=0//a[0]!=0//a[5]!=0  //a[2]!=0
				 a[count]=a[i]; //a[0]=1 //skip	  //a[1]=a[5]//a[2]=[2]
				 count++; 		//count=1//skip	  //count=2	 //count=3
			 }			 
		 }
//place zero up to the length of array		
//{1, 5, 2, 9, 3, 4, 7, 5, 6, 1, _, _, _, _} -----Array & count=10 will be like this until reaching while loop.
		 while(count < a.length) { //10<14
			 a[count++]=0;         //a[10]=0, increment count //a[11]=0//a[12]=0//a[13]=0
		 }
		 System.out.println(Arrays.toString(a));		 
	 }	 
 }
 
//Aim: Shift All Zero to Right Side through collection.
 class Arrays_ShiftAllZeroToRightSideWithCollection {
	 
	 public static void main (String[]arg) {
		 
		 int[] a= {1, 0, 5, 2, 9, 3, 0, 4, 7, 0, 5, 6, 0, 1};
		
		 List<Integer> list = new ArrayList<Integer>();	
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {
				 list.add(a[i]);
			 }			 
		 }
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==0) {
				 list.add(a[i]);
			 }			 
		 }
		 System.out.println(list);		 
	 }	 
 } 
 
 
 
 