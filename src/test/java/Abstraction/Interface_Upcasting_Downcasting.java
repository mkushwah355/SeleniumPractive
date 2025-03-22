package Abstraction;
interface Animal {
	
	void makesSound();
	default void makesNoise() {
		System.out.println("interface default method->makesNoise");
	}
}
class Dog implements Animal{

	public void makesSound() {
	System.out.println("makesSound->Dog barks");		
	}	
	
	public void wagTail() {
		System.out.println("makesSound->Dog wagTail");		
		}
}
public class Interface_Upcasting_Downcasting{
	public static void main(String[] arg) {
		Dog obj1= new Dog();
		obj1.makesSound();
		obj1.makesNoise();
		
		Animal obj2= new Dog();//Up-casting. giving parent class reference to subclass object.
		obj2.makesSound();
		obj2.makesNoise();
		
		Dog s1= (Dog)obj2;  //Down-casting. casting s2 object to Dog class to use its class specific methods.
			s1.wagTail();// Accessing subclass-specific method
			
		
		
	}
}
