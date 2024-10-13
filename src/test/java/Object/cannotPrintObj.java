package Object;

public class cannotPrintObj {

	String name;
	int age;

	cannotPrintObj(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] arg) {

		cannotPrintObj s1 = new cannotPrintObj("Mayank", 32);
		cannotPrintObj s2 = new cannotPrintObj("Deepak", 31);
		//if we try to print object directly without toString() method.

		System.out.println(s1); //output= Object.cannotPrintObj@4aa8f0b4
		System.out.println(s2); //output= Object.cannotPrintObj@7960847b

//This output shows the class name followed by the hexadecimal representation of the object's hash code. 
//It's not very informative, which is why overriding toString to provide a meaningful string representation of the object is a common practice.
	}
}
