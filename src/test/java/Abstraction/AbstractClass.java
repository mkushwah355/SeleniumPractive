package Abstraction;
import Abstraction.AbstractClass;
//
//abstract class which have abstract and non- abstract methods
 abstract class vehicle2 {

	abstract public int car() ; //abstract method
	public int bus() {          //non-abstract method(Concrete method)
	return 6;	
	}	
}

class subvehicle extends vehicle2 { //subclass extending the abstract class(implementation of abstract method)
		public int car() {
			return 4;}
		void car2() {
			System.out.println("car2");
		}
		;
		}

class AbstractClass {                  //main class
	public static void main (String []arg) {
		subvehicle s1= new subvehicle();
		System.out.println(s1.car());
		
		System.out.println(s1.bus());
		s1.car2();
	}
}


/*abstract class abstractClass{
	
	void car1() {
		System.out.println("car1");
		
	}
	abstract void car2();
}

class subAbstract extends abstractClass{
	
	void car2() {
		System.out.println("car2");
	}
	
}


class practice{
	public static void main (String []arg) {
		subAbstract s1= new subAbstract();
		s1.car2();
		s1.car1();
	}
	
}*/