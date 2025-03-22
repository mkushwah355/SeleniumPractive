package Inheritance;

import Polymorphism.Class_IE;

public class Class_Extend extends Class_IE{
	
	public void makeSound() {
		System.out.println("Dog barks from Inheritance.Class_IE");
	}
	
	public static void main(String[] arg) {
		
		Class_Extend obj1= new Class_Extend();
		obj1.makeSound();
		
		Class_IE obj2= new Class_IE();
		obj2.makeSound();	
	}

}
