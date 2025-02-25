package Java_Programs;

//Aim: Swap two strings WITHOUT temp variable
class _05String_SwapTwoStringWithOutTempVariable {
	 
	 public static void main (String[]arg) {
		 
		 String s1= "Hello";
		 String s2= "World";
		 
		 String s= s1+s2; //HelloWorld
		 
		 s2= s.substring(0,s.length()-s2.length()); //Hello
		 s1= s.substring(s2.length());
		 
		 System.out.println(s1);
		 System.out.println(s2);
	 }	 
}
//Aim: Swap two strings WITH temp variable
class _05String_SwapTwoStringWithTempVarible {
	 
	 public static void main (String[]arg) {
		 
		 String s1= "Hello";
		 String s2= "World";
		 
		String temp= s1;
		s1=s2;
		s2= temp;
		
		System.out.println(s1);
		System.out.println(s2);
		 
		 
	 }	 
}