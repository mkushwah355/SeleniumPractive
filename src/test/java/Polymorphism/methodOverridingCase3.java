package Polymorphism;

//Case 3: Invoking override method from sub-class

class GHI {

	void show()
	{
		System.out.println("print 1");
		}
}
class methodOverridingCase3 extends GHI{
	
	void show()
	{
		super.show();
		System.out.println("print 2");
	}
	public static void main (String []arg) throws Exception {
		GHI a=new GHI();
		a.show();
	
		
	}
}
