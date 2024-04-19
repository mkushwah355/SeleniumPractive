package Abstraction;
//Constructor unique problem-1

abstract class student{
	
	abstract protected void m3();
	abstract void m2();
	final  public void m1() {
	        	 System.out.println("m1");
	         }
	student(){
		String name;
		int rollno;
	}
}
class ConsUniqueProblem extends student{
	 public void m3() {
		System.out.println("m3");
	}

	void m2() {
		System.out.println("m2");
	}
	ConsUniqueProblem(String name, int rollno){
		super();
	System.out.println(name+rollno);
	}
	public static void main (String []arg) {
		
		ConsUniqueProblem s1= new ConsUniqueProblem("mama",12);
		//System.out.println(name);
		s1.m1();
		s1.m2();
		s1.m3();}}