package Java_8Features;

interface Animal{
	
	public void m1();
}

/*class Demo implements Animal{
	
	public void m1() {
		System.out.println("Demo- m1 method");
	}
}*/

class lambdaFunction_funInterEx1 {
	public static void main (String[]arg) {
		/*Demo s1= new Demo();*/
//Parent reference can be used to hold child object.
		Animal s1=()->System.out.println("Demo- m1 method");
		s1.m1();
	}
}
