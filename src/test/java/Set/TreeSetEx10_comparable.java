package Set;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
	String name;
	int age;
	int rollno;
	
	Student(String name, int age, int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;		
	}
	
	public int compareTo(Student obj1){
		if(rollno<obj1.rollno) 
			return -1;
		else if(rollno>obj1.rollno)
			return +1;
		else
			return 0;
		/*return Integer.compare(this.rollno, obj1.rollno);*/ //it will work only with integer return type.
	}
}
class TreeSetEx10_comparable{
	public static void main(String[]arg) {
		ArrayList<Student> AL= new ArrayList<Student>();
		AL.add(new Student("Mayank", 32, 102));
		AL.add(new Student("Deepak", 33, 101));
		AL.add(new Student("Vivek", 34, 103));
		Collections.sort(AL);
		for(Student e:AL) {
			System.out.println(e.age+" "+e.name+" "+e.rollno);
		}
	}
}
