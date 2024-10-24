package Set;

public class TreeSet_comparableEx3 {
	
	public static void main (String []arg) {
		
		System.out.println("A".compareTo("Z")); //-ve
		System.out.println("Z".compareTo("K")); //+ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null)); //RE:Null pointer exception
	}

}
