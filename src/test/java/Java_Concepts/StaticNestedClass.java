package Java_Concepts;

class Dog1 {

	static void barking() {
		System.out.println("bhoo bhoo");
	}
}

 class StaticNestedClass {

	static class NestedClass {

		void cat() {
			System.out.println("Meow");
		}

		static void cow() {
			System.out.println("Me me");
		}
	}

	public static void main(String[] args) {
		StaticNestedClass.NestedClass s1 = new StaticNestedClass.NestedClass();
		s1.cat();
		NestedClass.cow();
		Dog1 s2 = new Dog1();
		s2.barking();

	}

}
