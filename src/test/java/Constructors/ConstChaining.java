package Constructors;

 class ConstChaining1 {
	
	 ConstChaining1(){
		 this(80,90);
		 System.out.println("Default constructor of base class");
	 }
	 ConstChaining1(int x, int y){
		 System.out.println("Parameterized constructor of base class");
}}
//child created to call the base class constructor. super() used to call base class constructor
//if won't extend base class in child class then super won't be able to identify the base class.
//Constructors cannot be inherited or override.
class test extends ConstChaining1  {
	
	test(){
		this("Java", "Python");
		System.out.println("default constructor of child class");
	}
	test(String x, String y){
		super();
		System.out.println("Parameterized constructor of child class");
	}
}
 class ConstChaining{
	 public static void main (String []arg) {
		 test s1= new test();
	 }
 }