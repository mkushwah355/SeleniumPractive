package Polymorphism;

class Animal {
	public void makeSound(){
		System.out.println("Animal makes a sound");
	}	
}
class Dog extends Animal {
	
	public void makeSound(){
		System.out.println("Dog barks");
	}
	 void wagTail() {
		 System.out.println("Dog wag tail");
	 }
}

public class methodOverriding {
	public static void main (String []arg){
		Dog s1 = new Dog();
		s1.makeSound();
		
		Animal s2 = new Dog();//Upcasting
		s2.makeSound();
		
		Dog s3= ((Dog)s2);//Downcasting. It is not creating object. It is stored in stack as it is local variable
		s3.wagTail();
		
		
	}
}
