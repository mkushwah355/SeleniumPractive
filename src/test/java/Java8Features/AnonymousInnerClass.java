package Java8Features;

public class AnonymousInnerClass {
	
	public static void main (String[]arg) {
		
		Runnable s1= new Runnable() {      //Anonymous inner class starting point
			
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");}}

		};    //------add semicolon after child class of Runnable interface.		
	
		Thread s2= new Thread();
	 	s2.start();
	 	for(int i=0; i<10; i++) {
	 		System.out.println("Main Thread");
	 	}
	}
}
 	
 	
