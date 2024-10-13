/*package Polymorphism;

public class autoORtypePromotionEx3 {

//Ambiguity error
//Compiler is not able to understand which method to call and it is also not able to do type promotion due to ambiguity.
	
	static void Method(float a, double b) {

		System.out.println("Method1 called=  " + (a+b));

	}

	static void Method(double a, float b) {

		System.out.println("Method2 called=  " + (a+b));

	}
	public static void main (String []arg){
		Method(1,2);
		Method(1,2);
	}

}
*/