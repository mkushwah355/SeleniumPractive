package faltuCode;

import java.io.Serializable;

class practice implements Serializable {
	
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public static void main (String[]arg) {
		
	 String	s1= "Mayank"; 
		String s2= "Mayank";
		String s3= new String("Mayank").intern();
		String s4= new String("Mayank");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
	}
	
	
	
	
}