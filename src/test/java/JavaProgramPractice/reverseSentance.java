package JavaProgramPractice;

//Aim: To reverse a given sentence.
public class reverseSentance {

	public static void main(String[] args) {
		String s1= "My name is Mayank";
		String[] s2=s1.split("\\s+");
		
		StringBuilder SB=new StringBuilder();
		for(int i=s2.length-1;i>=0;i--) {
			SB.append(s2[i]);
			if(i>0) {
				SB.append(" ");}	
		}System.out.println(SB);
}}
