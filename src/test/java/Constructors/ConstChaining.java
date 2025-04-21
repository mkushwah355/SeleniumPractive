package Constructors;

 class Parent1 {
	
	 Parent1(){
		 this(80,90);
		 System.out.println("Default constructor of base class");
	 }
	 Parent1(int x, int y){
		 System.out.println("Parameterized constructor of base class");
}}
//Child1 created to call the base class constructor. super() used to call base class constructor
//if won't extend base class in Child1 class then super won't be able to identify the base class.
//Constructors cannot be inherited or override.
class Child1 extends Parent1  {
	
	Child1(){
		this("Java", "Python");
		System.out.println("default constructor of Child1 class");
	}
	Child1(String x, String y){
		super();
		System.out.println("Parameterized constructor of Child1 class");
	}
}
 class ConstChaining{
	 public static void main (String []arg) {
		 Child1 obj1= new Child1();
	 }
 }