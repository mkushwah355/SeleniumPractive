package Polymorphism;

//Case 1: Overriding and Access modifier

class ABC {
		
	protected void show (){
		
		System.out.println("print 1");
	}	
}

class methodOverridingCase1 extends ABC{
	//child class method access modifier should be bigger than parent class method access modifier
	//Public>protected>Default (bigger to smaller in terms of accessibility)
	public void show(){
		System.out.println("print 2");
	}
	public static void main (String []arg){
			ABC a=new ABC();
			a.show();
			methodOverridingCase1 b=new methodOverridingCase1();
			b.show();
	}
}
