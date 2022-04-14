package Polymorphism;

class methodOverridingCase1 {
		
	protected void show (){
		
		System.out.println("print 1");
	}	
}

class DEF extends methodOverridingCase1{
	//child class method access modifier should be bigger than parent class method access modifier
	//Public>protected>Default>Private (bigger to smaller in terms of accessibility)
	public void show(){
		System.out.println("print 2");
	}
	public static void main (String []arg){
			XYZ a=new XYZ();
			a.show();
			methodOverridingCase1 b=new methodOverridingCase1();
			b.show();
	}
}
