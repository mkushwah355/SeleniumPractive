package Polymorphism;

public class autoORtypePromotionEx4 {
		
		
		void methodOverloading(int a, int b) {
			System.out.println("Method1");
		}
//Object is parent class of all the class.	
//If we want to print method from main method call then the class method should have some return type.			
		String methodOverloading(Object a, int b) {
			return "Method2";
		}
		
		public static void main (String[]arg) {
			
			autoORtypePromotionEx4 s= new autoORtypePromotionEx4();
		
			System.out.println(s.methodOverloading("String", 1));
		
}}

