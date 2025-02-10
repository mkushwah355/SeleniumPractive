package JavaProgramPractice;

//Swap two strings.
class _05String_SwapTwoStrings {
	 
	 public static void main (String[]arg) {
		 
		 String s1= "Hello";
		 String s2= "World";
		 
		 String s= s1+s2;
		// System.out.println(s);//HelloWorld
		 
		 s2= s.substring(0,s.length()-s2.length()); //Hello
		 s1= s.substring(s2.length());
		 
		 System.out.println(s1);
		 System.out.println(s2);
	 }	 
}
