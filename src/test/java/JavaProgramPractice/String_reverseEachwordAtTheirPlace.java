package JavaProgramPractice;
import java.util.Scanner;
//
class String_reverseEachwordMayankTrick{
	public static void main(String[]arg) {
		String a= "My name is Mayank";
		String[] b=a.split("\\s+");//[My, name, is, Mayank]
		String c="";
		//System.out.println(Arrays.toString(b));	
		
		for(int i=0;i<b.length;i++) {
			//System.out.println(b[i]);
			String d=b[i];//My------name-----is----Mayank
			for(int j=d.length()-1;j>=0;j--) {
				char e=d.charAt(j);
				c=c+e;
			}c=c+" ";			
		}System.out.println(c);	//output= yM eman si knayaM 
	}
}
//Aim1: To print reverse of each word in given sentence
 class String_reverseEachwordAtTheirPlace {

	public static void main(String[] args) {

		String s1 = "My name is Mayank";
		String[] s2 = s1.split(" ");//["My","name","is","Mayank"]

		String revString = "";

		for (int i = 0; i < s2.length; i++) {
			String s3 = s2[i];
			String reverseWord = "";

			for (int j = s3.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + s3.charAt(j);//avaj
			}
			revString = revString + reverseWord + " ";
		}
		System.out.println(revString);}    //yM eman si knayaM 
}

//Aim2: To print reverse of each word in given user sentence 
 class reverseEachwordScanner {

 	public static void main(String[] args) {
 		
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter your input:");
 		String sc1=sc.nextLine();
 		
 		//String s1= "My name is Mayank";
 		String[] s2=sc1.split(" ");//["My","name","is","Mayank"]
 		
 		String revString="";
 		
 		for (int i=0;i<s2.length;i++) {
 			String s3= s2[i];
 			String reverseWord= "";
 			
 			for(int j=s3.length()-1;j>=0;j--) {
 				reverseWord=reverseWord +s3.charAt(j);//avaj
 			}
 			revString= revString+reverseWord+" ";
 		}
 	System.out.println(revString);}
 }

//Aim3: To print reverse of each word using advances for loop.
 
class reverseEachWordAdvForLoop {
	
	public static void main (String []arg) {
	String s1= "My name is Mayank";
	String[] s2=s1.split("\\s+");
	
	
	for(String s3:s2) {
		for(int i=s3.length()-1;i>=0;i--) {
			System.out.print(s3.charAt(i));
		}
		System.out.print(" ");
	}}}
	
 
 
 