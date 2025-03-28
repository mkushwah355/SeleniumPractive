package faltuCode;
import java.util.Arrays;

//Aim: Sort string in alphabetical order with Arrays.sort() method
class practice{
	
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
