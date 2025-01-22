package JavaProgramPractice;

//Aim:To reverse a given sentence in simple way.
class String_reverseSentanceMayankTrick{
	public static void main (String[]arg) {	
		String a= "My name is Mayank";
		String[] b=a.split("\\s+");
		String c= "";
		//System.out.println(Arrays.toString(b));
		
		for(int i=b.length-1;i>=0;i--) {
			//System.out.print(b[i]+" ");
			c=c+b[i]+" ";						
		}System.out.println(c);//output= Mayank is name My
	}	
}

//Aim: To reverse a given sentence(We can make the code cleaner and more efficient.)
 class String_reverseSentance {

	public static void main(String[] args) {
		String s1= "My name is Mayank";
		String[] s2=s1.split("\\s+");//\\s represents any whitespace character and + means one or more occurrences.
		
		StringBuilder SB=new StringBuilder();
		for(int i=s2.length-1;i>=0;i--) {
			SB.append(s2[i]);
			if(i>0) {
				SB.append(" ");}	
		}System.out.println(SB);  //output= Mayank is name My
}}
