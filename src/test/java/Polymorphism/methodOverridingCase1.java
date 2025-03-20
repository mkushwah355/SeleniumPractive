package Polymorphism;

//Case 1: Overriding and Access modifier
class parentClass1 {

	protected void method1() {
		System.out.println("parentClass->method1");
	}

		void method2() {
		System.out.println("parentClass1->method2");
	}
}
public class methodOverridingCase1 extends parentClass1 {
	//child class method access modifier should be bigger than parent class method access modifier
	//Public>protected>Default (bigger to smaller in terms of accessibility)

	public void method1() {
		System.out.println("childClass->method1");
	}

	public static void main(String[] arg) {
		parentClass1 a = new parentClass1();
		a.method1();
		methodOverridingCase1 b = new methodOverridingCase1();
		b.method1();
		b.method2();		
	}
}
