package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


class practice1 implements Comparator<practice1>{
	
	String name;
	int age;
	int rollno;
	
	practice1(String name, int age, int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	
	public int compare(practice1 obj1, practice1 obj2) {
		if(obj1.age<obj2.age)
			return -1;
		else if(obj1.age>obj2.age)
			return +1;
		else
			return 0;
	}	
	
}
class TreeSetEx11{
	public static void main(String[]arg) {
		ArrayList<practice1> AL= new ArrayList<practice1>();
		AL.add(new practice1("Mayannk", 23, 101));
		AL.add(new practice1("Deepak", 52, 103));
		AL.add(new practice1("Sunil", 32, 102));
		
		Collections.sort(AL,new practice1(null, 0, 0));
		for(practice1 e:AL) {
			System.out.println(e.age+" "+e.name+" "+e.rollno);
		}
		
}}
