package Constructors;

//class which allow to create only one object.
//it can be achieved through private constructor and getInstance() method
 class Singleton {       //singleton class
	
	static Singleton s= new Singleton();    //object created for singleton class
	private Singleton() {             //making constructor private to restrict the object creation outside the class   
		System.out.println("Constructor will invoke for only one object");
	}
	
//getInstance() method is returning the Singleton type value
//static method can only access other static members
//static method can be accessible with class name and does not require creation of object.
	public static Singleton getInstance() { //creating static instance method to return the current class object value
		return s;
	}

}
 class SingletonImplementation{
	 public static void main(String []arg) {
		 //Singleton s1= new Singleton();// object creation is not allowed as constructor is private.
		 Singleton s1= Singleton.getInstance();//static method can be called through its class name
		 Singleton s2= Singleton.getInstance(); //will print the same value as reference is returning the same value.
		                                        //s reference is returning the same value from getInstance method
	 }
 }

