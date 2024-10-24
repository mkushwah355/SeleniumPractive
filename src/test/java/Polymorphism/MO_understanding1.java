package Polymorphism;


class BaseClass {

	public void m1() {
		System.out.println("BaseClass m1() method");
	};
}

class MO_understanding1{
	public void m1() {
			System.out.println(" ChildClass m1() method"); 
			
		}

	public static void main(String[] arg) {
		BaseClass s1 = new BaseClass();
		s1.m1();
	}
}


