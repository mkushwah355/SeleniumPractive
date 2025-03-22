package Polymorphism;
//It is created to check import and extends feature of class.
//Used in Inheritance.Class_Import & Inheritance.Class_Extend.
class Animal3 {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

public class Class_IE extends Animal3 {

	public void makeSound() {
		System.out.println("Dog barks from Polymorphism.Class_IE");
	}

	public void wagTail() {
		System.out.println("Dog wag tail");
	}

	public static void main(String[] arg) {
		Class_IE obj1 = new Class_IE();
		obj1.makeSound();

		Animal3 obj2 = new Class_IE();//Upcasting
		obj2.makeSound();


	}
}
