package Abstraction;

abstract class vehicle4 {

	abstract int getNoOfWheels();
}

class Auto3 extends vehicle4 {

	int getNoOfWheels() {
		return 3;
	}
}

class Bus3 extends Auto3 {

	int getNoOfWheels() {
		return 8;
	}
	int getNoOfWheelsAGAIN() {
		return 10;
	}
}

class AbstractClass4 {
	public static void main(String[] arg) {
		
		vehicle4 obj1 = new Bus3();
		System.out.println(obj1.getNoOfWheels());//8//Upcasting-referencing parent class(vehicle4) for child class object(Bus3).
				
		Auto3 obj2 = new Bus3();
		System.out.println(obj2.getNoOfWheels());//8//Upcasting-referencing parent class(Auto3) for child class object(Bus3).
		
		Bus3 obj3 = new Bus3();
		System.out.println(obj3.getNoOfWheels());//8
		
		Bus3 s1 = ((Bus3)obj3);
		System.out.println(s1.getNoOfWheelsAGAIN());//3//Downcasting- using Bus3 class specific methods using the Bus3 object(obj3).
		

		System.out.println(new Auto3().getNoOfWheels()); //3//Anonymous Class

	}
}