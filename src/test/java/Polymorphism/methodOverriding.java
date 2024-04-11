package Polymorphism;

class test {
	void show(){
		System.out.println("print 1");
	}	
}
	
class methodOverriding extends test {
	
	void show(){
		//super.show();
		System.out.println("prints 2");
	}
	
	public static void main (String []arg){
		methodOverriding a= new methodOverriding();
		a.show();
		test b=new test();
		b.show();
	}
}

