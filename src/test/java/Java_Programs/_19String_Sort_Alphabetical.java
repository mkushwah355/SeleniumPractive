package Java_Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Aim: Sort string in alphabetical order with Arrays.sort() method
class _19String_Sort_Alphabetical{
	
	public static void main (String[] arg) {
		
		String str= "Mayank";
		String[]str1= str.toLowerCase().split("");
		
		Arrays.sort(str1);
		
		String result="";
		for(String loop1:str1) {
			result=result+loop1;
		}
		
		System.out.println(result);
	}	
}

//Aim: Sort string in alphabetical order
class practice {
	 public static void main(String[] arg) {
		 
		 String str1= "Mayank";
		 String[] str=	str1.toLowerCase().split("");
		 
		 ArrayList<String> list= new ArrayList<String>();
		 
		 for(String loop1:str) {
			 list.add(loop1);
		 }

		 Collections.sort(list);
		 
		 String result="";		 
		 for(String loop2:list) {		
			 result=result+loop2;
		 }
		 System.out.println(result);		
	 }
}
