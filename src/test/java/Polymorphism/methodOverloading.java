package Polymorphism;

public class methodOverloading {
	// same method name but different type of argument
	 void run(int a, int b) {
		System.out.println("print1");
	}

	 void run(int a, double b) {
		System.out.println("print2");
	}

	public static void main(String[] arg) {

		methodOverloading s = new methodOverloading();
		s.run(1, 99.3443);
	}
}
