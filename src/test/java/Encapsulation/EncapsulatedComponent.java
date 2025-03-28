package Encapsulation;

class EncapsulatedComponent1 {
	private String name;    //to restrict its accessibility for other outside classes.
	
	public String getName() { //getter method
		
		return name;
	}
	public String setName(String name) { //setter method
		
		 this.name=name;       //this refers to current class instance 
		 return name;
}}

class EncapsulatedComponent {
	
	public static void main (String []arg) {
		EncapsulatedComponent1 s1= new EncapsulatedComponent1();
		
		System.out.println(s1.setName("setter method"));
		System.out.println(s1.getName());
		
			
	}
	
	
}