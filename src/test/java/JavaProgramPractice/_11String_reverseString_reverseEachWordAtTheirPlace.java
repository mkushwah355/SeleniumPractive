package JavaProgramPractice;

public class _11String_reverseString_reverseEachWordAtTheirPlace {

	public static void main (String[]arg) {
		
		String str= "My name is Mayank";
		String[] s1=str.split("\\s+");
		String s3="";
		
		for(int i=s1.length-1;i>=0;i--) {
			//System.out.println(a[i]); //Mayank---is---name---My
			String a=s1[i];
			for(int j=a.length()-1;j>=0;j--) {
				//System.out.print(b.charAt(j));
				char s2= a.charAt(j);
				s3=s3+s2;
			}s3=s3+" ";
		}System.out.println(s3);		//output=knayaM si eman yM 
	}	
}
