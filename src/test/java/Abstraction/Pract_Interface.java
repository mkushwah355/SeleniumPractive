package Abstraction;

 interface Pract_Interface1 {

	  void m1();

	 public void m2();

}

abstract class ServiceProvider implements Pract_Interface1 {
	public void m1() {

		System.out.println("Method 1");
	}
}

class Pract_Interface extends ServiceProvider {

	public void m2() {
		System.out.println("Method 2");
	}

	public static void main(String[] arg) {
		Pract_Interface s1 = new Pract_Interface();
		s1.m1();
		s1.m2();
	}

}