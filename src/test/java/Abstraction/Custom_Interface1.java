package Abstraction;

 interface Animal5 {

	  void m1();      // This is implicitly public and abstract

	 public void m2();// This is implicitly public

}

abstract class Dog5 implements Animal5 {
	
	public void m1() {
		System.out.println("Dog5->m1 method");
	}
}

class Custom_Interface1 extends Dog5 {

	public void m2() {
		System.out.println("Custom_Interface1->m2 method");
	}

	public static void main(String[] arg) {
		Custom_Interface1 s1 = new Custom_Interface1();
		s1.m1();
		s1.m2();
	}

}