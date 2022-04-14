package Polymorphism;

public class autoORtypePromotionEx2 {

	/*static void Method(int a, int b) {

		System.out.println("Method1 called= " + (a+b));
	}*/
	//if we comment Method1 then type promotion happen from int to float in method execution
	static void Method(float a, float b) {

		System.out.println("Method2 called=  " + (a+b));

	}

	static void Method(double a, double b) {

		System.out.println("Method3 called=  " + (a+b));

	}
	public static void main (String []arg){
		Method(1,2);
		Method(1,2);
	}

}
