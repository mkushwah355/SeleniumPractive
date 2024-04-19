package Abstraction;

public class Case1_newVsConstructor {
	
	String name;   //instance variable
	int rollno;    //instance variable

	  Case1_newVsConstructor(String name, int rollno){  //Constructor
		this.name=name;                          //=name--Assignment statement- it is meant to initialization.   
		this.rollno=rollno;                      //Constructor job is to initialize an object.
		
	}
	public static void main (String []arg) {
	Case1_newVsConstructor s= new Case1_newVsConstructor("durga",101);
	System.out.println(s.name +" "+ s.rollno);
}}
