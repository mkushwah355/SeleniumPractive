package Set;
import java.util.*;
//To get employee objects in default natural sorting order based on eid.
 class Employee implements Comparable{
	
	 String name;
	 int eid;
	 
	 Employee(String name, int eid){
		 this.name= name;
		 this.eid= eid;
	 }
	 public String toString() {
		 return name+"--"+eid;
	 }
	 public int compareTo(Object obj) {
		 int eid1= this.eid;
		 Employee e= (Employee)obj;
		 int eid2= e.eid;
		 
		 if(eid1<eid2)
			 return -1;
		 else if(eid1>eid2)
			 return +1;
		 else 
			 return 0;	
		 
}}
 class mycomparator5 implements Comparator{
	 public int compare(Object obj1, Object obj2) {
		 Employee e1= (Employee)obj1;
		 Employee e2= (Employee)obj2;
		 String S1= e1.name;
		 String S2=e2.name;
		 return S1.compareTo(S2);
	 }
 }
 
class TreeSet_comparatorEx9_Employee {
	 public static void main (String []arg) {
		 Employee e1= new Employee("Nagpur", 101);
		 Employee e2= new Employee("Bilaspur", 102);
		 Employee e3= new Employee("Chattisgarh", 103);
		 Employee e4= new Employee("Velore", 104);
		 Employee e5= new Employee("Nagpur", 105);
		 
		 TreeSet t= new TreeSet ();
		 t.add(e1);t.add(e2);t.add(e3);t.add(e4);t.add(e5); //obj1.compareTo(obj2)
		 System.out.println(t);
		 
		 TreeSet t1= new TreeSet(new mycomparator5());
		 t1.add(e1);
		 t1.add(e2);t1.add(e3);t1.add(e4);t1.add(e5); //obj1.compareTo(obj2)
		 System.out.println(t1);
	 }	 	
}









