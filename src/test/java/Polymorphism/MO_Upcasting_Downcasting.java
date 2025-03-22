package Polymorphism;

class Animal1 {
	 void makeSound(){
		System.out.println("Animal makes a sound");
	}	
}
class Dog1 extends Animal1 {
	
	 void makeSound(){
		System.out.println("Dog barks");
	}
	 void wagTail() {
		 System.out.println("Dog wag tail");
	 }
}

public class MO_Upcasting_Downcasting {
	public static void main (String []arg){
		Dog1 s1 = new Dog1();
		s1.makeSound();
		
		Animal1 s2 = new Dog1();//Up-casting
		s2.makeSound();
		
		Dog1 s3= ((Dog1)s2);//Down-casting. s3 is not creating object. It is stored in stack as it is local variable
		s3.wagTail();
		
		
	}
}
