package Abstraction;

/*//abstract class without constructor
abstract class Case3_NeedOfConstructorInAbstractClass1 {
	String name;
	int age;
}

class Case3_NeedOfConstructorInAbstractClass extends Case3_NeedOfConstructorInAbstractClass1{
	 int rollno;
	 int marks;
//we have to initialize parent class variables in child class every time.
//if 100 variables initialize in 100 class then 100 lines of code will be added in each class. 	 
	Case3_NeedOfConstructorInAbstractClass(int rollno, int marks, String name, int age){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
	}
	public static void main (String []arg) {
Case3_NeedOfConstructorInAbstractClass s1= new Case3_NeedOfConstructorInAbstractClass(21,101,"durga",29);
System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.marks);
	}
}*/

//---------------------------------------------------------------------------------------------------------//
//abstract class with constructor
abstract class Case3_NeedOfConstructorInAbstractClass1 {
	String name;
	int age;
	Case3_NeedOfConstructorInAbstractClass1(String name, int age){
		this.name=name;
		this.age=age;
}}
class Case3_NeedOfConstructorInAbstractClass extends Case3_NeedOfConstructorInAbstractClass1{
	 int rollno;
	 int marks; 
//super keyword used to access the parent class constructor
//Advantage-if 100 variables initialize in parent class then then we can access all 100 variables in single line of code.	 
	Case3_NeedOfConstructorInAbstractClass(int rollno, int marks, String name, int age){
		super(name, age);
		this.rollno=rollno;
		this.marks=marks;
	}
	public static void main (String []arg) {
Case3_NeedOfConstructorInAbstractClass s1= new Case3_NeedOfConstructorInAbstractClass(21,101,"durga",29);
System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.marks);
	}
}













