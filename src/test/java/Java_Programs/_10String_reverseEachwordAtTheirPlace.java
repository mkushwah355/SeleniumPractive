package Java_Programs;
import java.util.Scanner;
//
//Aim1: To print reverse of each word in given sentence
class String_reverseEachwordMayankTrick{
	public static void main(String[]arg) {
		
		String str= "My name is Mayank";
		String[] s1=str.split("\\s+");//[My, name, is, Mayank]
		String s3="";
		
		for(int i=0;i<s1.length;i++) {
			String a=s1[i];                //My------name-----is----Mayank
			for(int j=a.length()-1;j>=0;j--) {
				char s2=a.charAt(j);
				s3=s3+s2;
			}s3=s3+" ";			
		}System.out.println(s3);	//output= yM eman si knayaM 
	}
}
//Aim1: To print reverse of each word in given sentence with for loop
 class _10String_reverseEachwordAtTheirPlace {

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

//Aim2: To print reverse of each word in given user input. 
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
	
	
	for(String loop1:s2) {
		for(int i=loop1.length()-1;i>=0;i--) {
			System.out.print(loop1.charAt(i));
		}
		System.out.print(" ");
	}}}
	
 
 
 