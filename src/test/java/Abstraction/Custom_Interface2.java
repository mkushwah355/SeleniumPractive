package Abstraction;

interface Animal6 {

	  void implicitPublicMethod();      // This is implicitly public and abstract
	  public void explicitPublicMethod();// This is implicitly public
	  
	  default void defaultMethod() {
		  this.privateMethod();        //privateMethod calling in default method
		  System.out.println("Interface-> defaultMethod");
	  }
	  
	  public static void staticMethod() {		  
		  System.out.println("Interface-> staticMethod");
		  
	  }
	  private void privateMethod() {
		    System.out.println("Interface-> privateMethod");
		}	 
}

class Dog6 implements Animal6 {

	public void implicitPublicMethod() {
		System.out.println("implicitPublicMethod-> child class");
		
	}
	public void explicitPublicMethod() {
		System.out.println("explicitPublicMethod-> child class");
		
	}	
	public void dogSpecificMethod() {
		System.out.println("Dog6 class specific method");		
	}	
	
}

class Custom_Interface2 {
	public static void main(String[] arg) {
		Animal6 obj1= new Dog6();			//Upcasting
		obj1.implicitPublicMethod();
		obj1.explicitPublicMethod();
		obj1.defaultMethod();
		Animal6.staticMethod();
		
		Dog6 s1= (Dog6)obj1;				//Downcasting
		s1.dogSpecificMethod();
		
		
	}
}