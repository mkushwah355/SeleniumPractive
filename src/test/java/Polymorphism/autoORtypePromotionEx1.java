package Polymorphism;

public class autoORtypePromotionEx1 {
		
	static void run(int a){
		
		System.out.println("print1");
	}
	
	static void run (String a){
		System.out.println("print2");
	}
	//If we put run(‘a’) then compiler won’t understand which method execute then type promotion comes into picture. 
	//It will promote the data type to another data type implicitly if no matching data type is found.
	public static void main (String []arg){
		run('1');
	}
}
