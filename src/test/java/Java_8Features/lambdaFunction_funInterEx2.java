package Java_8Features;


interface Animal1{
	
	public void m1(int a, int b);
}

/*class Demo implements Animal{
	
	public void m1(int a, int b) {
		System.out.println("Demo-AdditionMethod:" + (a+b));
	}
}*/

class lambdaFunction_funInterEx2 {
	public static void main (String[]arg) {
		/*Demo s1= new Demo();*/
//Parent reference can be used to hold child object.
		Animal1 s1=(a,b)->System.out.println("Demo-AdditionMethod: " + (a+b));
		s1.m1(10,20);
		s1.m1(40,30);
	}
}


