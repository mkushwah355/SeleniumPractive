package Abstraction;
//Constructor unique problem-1

abstract class student {
	
	abstract void method1();
	
	abstract protected void protectedMethod2();
	
	final public void finalMethod3() {   //cannot override final method. but we can use final method as it is in child class if required.
		System.out.println("student-> finalMethod3");
	}

	student() {
		String name;
		int rollno;
	}
}

class school extends student {
	
	void method1() {
		System.out.println("school-> method1");
		
	}
	public void protectedMethod2() {
		System.out.println("school-> protectedMethod2");
	}
	
	school(String name, int rollno) {
		super();
		System.out.println(name + rollno);
	}
}
class ConsUniqueProblem{
	public static void main(String[] arg) {

		school obj1 = new school("Rohit", 12);
		
		obj1.method1();
		obj1.protectedMethod2();
		obj1.finalMethod3(); //final method called after inheritance with the school class object.
	}
}