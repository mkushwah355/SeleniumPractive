package Abstraction;

 class Case2_ChildObjectsVsParantConstructor1 {
		
	String name;   //instance variable
	int age;       //instance variable
	
	Case2_ChildObjectsVsParantConstructor1(String name, int age){
		this.name=name;     //current class constructor initialization
		this.age=age;       //current class constructor initialization
		
	}}
 
 class Case2_ChildObjectsVsParantConstructor extends Case2_ChildObjectsVsParantConstructor1{
	 
	 int rollno;     //instance variable
	 int marks;     //instance variable

		Case2_ChildObjectsVsParantConstructor(int rollno, int marks,int age, String name){
		 super(name,age);      //parent class constructor initialization through super keyword
		 this.rollno=rollno;    //current class constructor initialization
		 this.marks=marks;      //current class constructor initialization
		  
	 }
	 public static void main (String []arg) {
//object created for child class to access the current class constructor
//Parent class constructor executed whenever child class object is created
//order of argument in child constructor and object constructor should be same. otherwise compile time error come		 
Case2_ChildObjectsVsParantConstructor s1 = new Case2_ChildObjectsVsParantConstructor(21, 101,46,"durga");
		 System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.marks);
		 
	 }
	 
	 
 }
