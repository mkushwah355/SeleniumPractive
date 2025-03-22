package Inheritance;

import Polymorphism.Class_IE;
//Created this class to use import statement. Import statement will allow to use methods of another class
// makeSound() & wagTail() methods are from Polymorphism.Class_IE.
//We can only use another class methods with import statement but cannot override them.
//Class_Import class makeSound() method independent method and it is not overriding the class Class_IE makeSound() method.

public class Class_Import {

	public void makeSound() {
		System.out.println("Dog barks from Polymorphism.Class_Import");
	}

	public static void main(String[] arg) {

		Class_IE obj1 = new Class_IE();

		obj1.makeSound();
		obj1.wagTail();
		
		Class_Import obj2= new Class_Import();
		obj2.makeSound();
	}
}
