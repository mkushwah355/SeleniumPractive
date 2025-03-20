package Java_8Features;
import Java_8Features.Left;
import Java_8Features.Right;

interface Left{
	
	default void m1() {
		System.out.println("Left Interface");
	}
}
interface Right{
	
	default void m1() {
		System.out.println("Right Interface");
	}
}

class defaultMethod implements Left,Right{
//there is chance of ambiguity as implementing class getting same m1() method from Left and Right.
//Either, we override m1() or use super to get the interface implementation for m1().
	public void m1() {
		//System.out.println("Own implementation"); 
		Left.super.m1();
		Right.super.m1();
	}
	public static void main (String[]arg) {
		defaultMethod s1= new defaultMethod();
		s1.m1();
	}
}


