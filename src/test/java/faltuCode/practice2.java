package faltuCode;


class Animal1{
	
	public void staticMethod(){
		System.out.println("Animal->staticMethod");
	}
	
	public void finalMethod(){
		System.out.println("Animal->finalMethod");
	}
	
	private void privateMethod(){
		System.out.println("Animal->privateMethod");
	}
}
class Dog1 extends Animal1{
	
	public void staticMethod(){
		System.out.println("Dog->staticMethod");
	}
	
	public void finalMethod(){
		System.out.println("Dog->finalMethod");
	}
	
	private void privateMethod(){
		System.out.println("Dog->privateMethod");
	}
}

class practice2{
	public static void main(String[] arg) {
		Animal1 obj1= new Dog1();
		obj1.staticMethod();
		obj1.finalMethod();
		//obj1.privateMethod();
		
		
	}
}
