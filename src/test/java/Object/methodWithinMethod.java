package Object;

//Below is java class which has method inside method.
//we cannot direct declare method inside method. it can be achieved through local class

 class methodWithinMethod {
	
	void m1() {
		System.out.println("Inside m1 method");
		
		class localClass{   //local class helped to create method inside method
			void m2() {
				System.out.println("Inside local class m2 method");}	
		}
		localClass s1= new localClass();  //local class object created outside local class but inside method
		s1.m2();
	}	
//Main method cannot be created inside any other method bcs JVM will look main method in top level class
	public static void main (String []arg) {
		methodWithinMethod s2=new methodWithinMethod();
		s2.m1();	
	}

}
