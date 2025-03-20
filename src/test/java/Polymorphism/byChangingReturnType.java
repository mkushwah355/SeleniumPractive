/* package Polymorphism;

//overloading is not possible by changing return type only (without providing the arguments)

 class byChangingReturnType {
	
	 static int run(){
		System.out.println("print1");
		return a+b;
	}
	
	 static double run(){
		System.out.println("print2");
		return a+b;
	}
	 public static void main (String []arg){
		 run(1,1);
	 }
	
}

//overloading is not possible with identical arguments in both methods
 class byChangingReturnType2 {
		
	 static int run(int a, int b){
		System.out.println("print1");
		return a+b;
	}
	
	 static double run(int a, int b){
		System.out.println("print2");
		return a+b;
	}
	 public static void main (String []arg){
		 run(1,1);
	 }
	
}*/