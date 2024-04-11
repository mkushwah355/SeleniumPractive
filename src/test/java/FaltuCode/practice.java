package FaltuCode;

abstract class vehicle{
	
	abstract int getNoOfwheels();
	
}

class Car extends vehicle{
	
	int getNoOfwheels() {
	
		return 4;
			}
	
}
class Bus extends vehicle{
	int getNoOfwheels() {
		
		return 6;
			}
}

class practice{
	public static void main (String []arg) {
		Car s1= new Car();
		System.out.println(s1.getNoOfwheels());
		Bus s2= new Bus();
		System.out.println(s2.getNoOfwheels());
		
	}
}