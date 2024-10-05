package Polymorphism;

//Case 2: Overriding and Exception handling 

class DEF {
		
	void show()
	{
		System.out.println("print 1");
		}
}
class methodOverridingCase2 extends DEF{
	//if we mention same exception(checked or checked) in parent & child class then both parent and child will accept this exception
	//Child class can only throws unchecked exception if parent class does not throw any exception.
	void show() throws ArithmeticException
	{
		int a=1/0;
		System.out.println("print 2");
	}
	public static void main (String []arg) throws Exception{
		DEF a=new DEF();
		a.show();
		methodOverridingCase2 b=new methodOverridingCase2();
		b.show();
		
	}
}