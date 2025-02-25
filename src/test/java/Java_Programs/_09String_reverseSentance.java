package Java_Programs;

//Aim:To reverse a given sentence in simple way.
class String_reverseSentanceMayankTrick{
	public static void main (String[]arg) {	
		
		String s= "My name is Mayank";
		String[] str=s.split("\\s+");
		String c= "";
		
		for(int i=str.length-1;i>=0;i--) {
			//System.out.print(b[i]+" ");
			c=c+str[i]+" ";						
		}
		System.out.println(c);//output= Mayank is name My
	}	
}

//Aim: To reverse a given sentence with String builder.
 class _09String_reverseSentance {

	public static void main(String[] args) {
		String s1= "My name is Mayank";
		String[] s2=s1.split("\\s+");// "\\s+" represents any whitespace character and + means one or more occurrences.
		
		StringBuilder SB=new StringBuilder();
		for(int i=s2.length-1;i>=0;i--) {
			SB.append(s2[i]);
			if(i>0) {
				SB.append(" ");}	
		}System.out.println(SB);  //output= Mayank is name My
}}
