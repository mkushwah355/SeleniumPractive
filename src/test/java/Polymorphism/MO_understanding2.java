package Polymorphism;


class BaseClass1 {

	public void m1() {
		System.out.println("BaseClass m1() method");
	};
}

class MO_understanding2 extends BaseClass1 {
	public void m1() {
			System.out.println("ChildClass m1() method"); 
			
		}
//We can give reference type as BaseClass for ChildClass object. 
//But cannot give ChildClass reference for BaseClass object if creating in ChildClass.
	public static void main(String[] arg) {
		BaseClass1 s1 = new MO_understanding2();
		//MO_understanding2 s1= new BaseClass1();
		s1.m1();
	}
}
