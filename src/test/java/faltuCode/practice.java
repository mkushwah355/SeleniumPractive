package faltuCode;

import java.util.*;

class Student{
	int a;
	Student(int a){
		this.a=a;
	}
	
	public int hashcode() {
		return a;
	}
	
	public String toString() {
		return a+"";
	}
		
}

class practice{
	public static void main(String[]arg) {
		Hashtable<Student,String> h= new Hashtable<Student,String>();
		h.put(new Student(5),"A");
		h.put(new Student(6),"B");
		h.put(new Student(12),"C");
		h.put(new Student(15),"D");
		h.put(new Student(23),"E");
		System.out.println(h);
	}
	
}