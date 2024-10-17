package Java8Features;

public class AnonymousInnerClassVSLambda {
	public static void main(String[] arg) {
//Anonymous inner class Vs Lambda expression
		Runnable s1 = ()->{                                  
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
		}; 		

		Thread s2 = new Thread();
		s2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
