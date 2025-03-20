package Polymorphism;

//Case 3: Invoking override method from sub-class
class parentClass3 {

	void method1() {
		System.out.println("parentClass3->method1");
	}
}

class methodOverridingCase3 extends parentClass3 {
	
	void method1() {
		super.method1();
		System.out.println("childClass->method1");
	}

	public static void main(String[] arg) throws Exception {
		methodOverridingCase3 a = new methodOverridingCase3();
		a.method1();

	}
}
