package JavaProgramPractice;

public class _11String_reverseString_reverseEachWordAtTheirPlace {

	public static void main (String[]arg) {
		
		String s= "My name is Mayank";
		String[] str=s.split("\\s+");
		String c="";
		
		for(int i=str.length-1;i>=0;i--) {
			//System.out.println(a[i]); //Mayank---is---name---My
			String b=str[i];
			for(int j=b.length()-1;j>=0;j--) {
				//System.out.print(b.charAt(j));
				c=c+b.charAt(j);
			}c=c+" ";
		}System.out.println(c);		//output=knayaM si eman yM 
	}	
}
