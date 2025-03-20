package Polymorphism;

//Case 2: Overriding and Exception handling 

class parentClass2 {

	void method1() {
		System.out.println("parentClass2->method1");
	}
}
class methodOverridingCase2 extends parentClass2 {
	//if we mention same exception(checked or checked) in parent & child class then both parent and child will accept this exception
	//Child class can only throws unchecked exception if parent class does not throw any exception.

	void method1() throws ArithmeticException {
		int a = 1 / 0;
		System.out.println("childClass->method1");
	}

	public static void main(String[] arg) throws Exception {
		parentClass2 a = new parentClass2();
		a.method1();
		methodOverridingCase2 b = new methodOverridingCase2();
		b.method1();

	}
}