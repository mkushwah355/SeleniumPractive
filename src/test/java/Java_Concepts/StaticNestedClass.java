package Java_Concepts;


class dog{
	
	static void barking() {
		System.out.println("bhoo bhoo");
	}
}


public class StaticNestedClass {

	static class NestedClass{
		
	           void cat() {
			      System.out.println("Meow");}
		static void cow() {
			System.out.println("Me me");
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClass.NestedClass s1= new StaticNestedClass.NestedClass();
		s1.cat();
		NestedClass.cow();
		dog s2= new dog();
		s2.barking();
		
	}

}
