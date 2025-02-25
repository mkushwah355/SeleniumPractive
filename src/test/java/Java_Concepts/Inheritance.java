package Java_Concepts;

class Inheritance1 {
	
void Animal() {
	
	System.out.println("Animal");
}}

class Inheritance extends Inheritance1{
	
	void barking() {
		System.out.println("barking");
	}
	public static void main (String []arg) {
		Inheritance s1 =new Inheritance();
		s1.Animal();
		s1.barking();
	}
	
	
}