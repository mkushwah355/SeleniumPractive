package faltuCode;

interface Student1{
	
    public static final String name = "mayank";
	public static final int rollno = 123;
	
	       void m1();
	       void m2();
	
	
}

class Interface implements Student1{
	public void m1() {
		System.out.println("m1"+name);
		
	}
	public void m2() {
		System.out.println("m2"+rollno);
	}
	
	public static void main (String []arg) {
		Interface s1= new Interface();
		s1.m1();
		s1.m2();
	}
	
}