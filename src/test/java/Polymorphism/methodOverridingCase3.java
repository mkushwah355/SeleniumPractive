package Polymorphism;

class methodOverridingCase3 {

	void show()
	{
		System.out.println("print 1");
		}
}
class STU extends methodOverridingCase2{
	
	void show()
	{
		super.show();
		System.out.println("print 2");
	}
	public static void main (String []arg) throws Exception {
		STU a=new STU();
		a.show();
	
		
	}
}
