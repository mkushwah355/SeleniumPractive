package FaltuCode;

class A {
	public static void main (String[] arg){
		
		String s1 = "Mayank Kushwah";
		int s2= s1.length();///14 (14-1=13 and h is at 13th place)
		System.out.println("Length of String: " + s2);
		String rev= "";
		//char[] s3= s1.toCharArray();
		
		for (int i=s2-1;i>=0;i--){
			rev = rev+s1.charAt(i);
			//s1.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}
	
	
}