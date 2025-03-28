package Java_Concepts;

import Inheritance.AccessModifier_Protected_ParentClass;

//this is a child class to check accessibility of protected modifier.

class AccessModifier_Protected_ChildClass extends AccessModifier_Protected_ParentClass {
	
	public void showName() {
		System.out.println(name); // Accessing protected field from Parent class
		display();               // Calling protected method from Parent class
	}

	public static void main(String[] args) {
		AccessModifier_Protected_ChildClass obj1 = new AccessModifier_Protected_ChildClass();
		obj1.showName();
	}

}
