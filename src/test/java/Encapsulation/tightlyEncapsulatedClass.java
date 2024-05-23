package Encapsulation;

//When all the variables are private such type of class is called tightly encapsulated class
class tightlyEncapsulatedClass1 {

	private String name; //private data members which are not allowed outside of class.
	private int age;
	private int rollno;

	public String getName() { //getter method for name variable
		return name;
	}

	public String setName(String name) { //setter method for name variable
		this.name = name;
		return name;
	}

	public int getAge() { //getter method for age variable
		return age;
	}

	public int setAge(int age) {//setter method for age variable
		this.age = age;
		return age;
	}

	public int getRollno() { //getter method for rollno
		return rollno;
	}

	public int setRollno(int rollno) {//setter method for rollno variable
		this.rollno = rollno;
		return rollno;
	}
}

class tightlyEncapsulatedClass {
	public static void main(String[] arg) {
		tightlyEncapsulatedClass1 s1 = new tightlyEncapsulatedClass1();
		s1.setName("Mayank"); //providing the values to setter method
		s1.setAge(31);
		s1.setRollno(1012);

		System.out.println("Student name: " + s1.getName()); //calling the getter method
		System.out.println("Student age: " + s1.getAge());
		System.out.println("Student rollno: " + s1.getRollno());
	}
}
