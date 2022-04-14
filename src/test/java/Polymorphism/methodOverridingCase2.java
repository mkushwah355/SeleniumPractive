package Polymorphism;

public class methodOverridingCase2 {
		
	void show() throws Exception
	{
		System.out.println("print 1");
		}
}
class WXY extends methodOverridingCase2{
	//if we mention same exception(checked or checked) in parent & child class then both parent and child will accept this exception
	//Child class can only throws unchecked exception if parent class does not throw any exception.
	void show() throws Exception
	{
		
		System.out.println("print 2");
	}
	public static void main (String []arg) throws Exception{
		WXY a=new WXY();
		a.show();
		methodOverridingCase2 b=new methodOverridingCase2();
		b.show();
		
	}
}