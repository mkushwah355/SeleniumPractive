package Inheritance;

//this is a parent class to check accessibility of protected modifier.

public class AccessModifier_Protected_ParentClass {
	
	protected String name = "name field->Parent Class";

	protected void display() {
		System.out.println("display method->Protected method in Parent class.");
	}
	
	public static void main(String[] args) {
		AccessModifier_Protected_ParentClass obj1 = new AccessModifier_Protected_ParentClass();
		System.out.println(obj1.name); // Accessing protected field
		obj1.display();               // Accessing protected method
	}
}
