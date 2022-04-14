package Polymorphism;

class test {
	void show(){
		System.out.println("print 1");
	}	
}
	
class ABC extends test {
	
	void show(){
		//super.show();
		System.out.println("prints 2");
	}
	
	public static void main (String []arg){
		ABC a= new ABC();
		a.show();
		test b=new test();
		b.show();
	}
}

