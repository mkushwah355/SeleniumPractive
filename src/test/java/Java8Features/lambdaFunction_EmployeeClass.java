package Java8Features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " " + age;
	}
}
/*class Mycomparator implements Comparator<Employee>{
	public int compare(Employee I1, Employee I2) {
		//(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
		if (I1.age<I2.age) {
			return -1;}
			else if (I1.age>I2.age) {
				return +1;}
				else {
					return 0;}
}}*/

class lambdaFunction_EmployeeClass {

	public static void main(String[] arg) {

		ArrayList<Employee> AL = new ArrayList<Employee>();
		AL.add(new Employee("Nilesh", 32));
		AL.add(new Employee("Ajay", 22));
		AL.add(new Employee("Sunny", 15));
		AL.add(new Employee("Funny", 52));
		System.out.println("Unsorted list elements: "+AL);
		//Collections.sort(AL, new Mycomparator());
//Below is one way to declare Comparator interface
		//Comparator<Employee> s1=(I1,I2)->(I1.age<I2.age)?-1:(I1.age>I2.age)?+1:0;
		//Collections.sort(AL, s1);
		//System.out.println("Sorted-1 list(AL) on age: " +AL);
		
//Below is second way to declare Comparator interface			
		//Collections.sort(AL, (I1,I2)->(I1.age<I2.age)?-1:(I1.age>I2.age)?+1:0);
		//System.out.println("Sorted-2 list(AL) on age: "+AL);
		
//Below is third way to declare Comparator interface
		//sorting on basis of name.	
		//Collections.sort(AL, (I1,I2)->I1.name.compareTo(I2.name));
		//System.out.println("Sorted-3 list(AL) on name: "+AL);
		//sorting on basis of age. we cannot use compareTo with age sorting. so using compare method instead.
		Collections.sort(AL, (I1,I2)->Integer.compare(I1.age,I2.age));		
		System.out.println("Sorted-3 list(AL) on age: "+AL);
		
//using Stream API we are filtering the collection.
		System.out.println("Elements with foreach stream API:");
		AL.stream().forEach(System.out::println);
	}}



