package JavaProgramPractice;
import java.util.Arrays;

public class String_reverseString_reverseEachWordAtTheirPlace {

	public static void main (String[]arg) {
		
		String s= "My name is Mayank";
		String[] a=s.split("\\s+");
		String c="";
		//System.out.println(Arrays.toString(a));//[My, name, is, Mayank]
		
		for(int i=a.length-1;i>=0;i--) {
			//System.out.println(a[i]); //Mayank---is---name---My
			String b=a[i];
			for(int j=b.length()-1;j>=0;j--) {
				//System.out.print(b.charAt(j));
				c=c+b.charAt(j);
			}c=c+" ";
		}System.out.println(c);		//output=knayaM si eman yM 
	}	
}
