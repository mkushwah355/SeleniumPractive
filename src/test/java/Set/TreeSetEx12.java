package Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	
	String name;
	int age;
	int rollno;
	
	Student1(String name, int age, int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
}}

class ageComparator implements Comparator<Student1>{
	
	public int compare(Student1 obj1, Student1 obj2) {
		return Integer.compare(obj1.age,obj2.age);
}}
class nameComparator implements Comparator<Student1>{
	public int compare(Student1 obj1, Student1 obj2) {
		return obj1.name.compareTo(obj2.name);
	}
	
}	

class TreeSetEx12{
	public static void main(String[]arg) {
		ArrayList<Student1> AL= new ArrayList<Student1>();
		AL.add(new Student1("Mayank", 23, 101));
		AL.add(new Student1("Deepak", 52, 103));
		AL.add(new Student1("Sunil", 32, 102));
		
		Collections.sort(AL,new ageComparator());
		System.out.println("Sorting by age:");
		for(Student1 e:AL) {
			System.out.println(e.age+" "+e.name+" "+e.rollno);
		}
		System.out.println(""
				+ "");
		
		Collections.sort(AL,new nameComparator());
		System.out.println("Sorting by name:");
		for(Student1 e:AL) {
			System.out.println(e.age+" "+e.name+" "+e.rollno);
		}
}}

