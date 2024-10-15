package faltuCode;

import java.util.TreeSet;

class practice2{
	
	
	
	public static void main(String []arg) {
		try{TreeSet<String> t= new TreeSet<String>();
		t.add("a");
		
		t.add("d");
		System.out.println(t);
		 }
	
	catch(Exception e){
			System.out.println(e);
		
	}
		finally {
			
			System.out.println("always");
			System.exit(0);
		}
	

}}
