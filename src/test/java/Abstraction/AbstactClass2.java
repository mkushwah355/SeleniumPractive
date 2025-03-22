package Abstraction;

import Abstraction.AbstractClass1;

abstract class vehicle1 {

	abstract int getNoOfWheels();

}

class Auto extends vehicle1 {
	int getNoOfWheels() {

		return 3;
	}
}

class Bus extends vehicle1 {
	int getNoOfWheels() {

		return 6;
	}
}

 class AbstactClass2 {
	public static void main(String[] arg) {
		Auto s1 = new Auto();
		System.out.println(s1.getNoOfWheels());//3
		Bus s2 = new Bus();
		System.out.println(s2.getNoOfWheels());//6

		System.out.println(new Auto().getNoOfWheels()); //3//Anonymous Class

	}
}