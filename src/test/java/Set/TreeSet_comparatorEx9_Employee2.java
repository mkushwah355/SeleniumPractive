package Set;
import java.util.Comparator;
import java.util.TreeSet;

//It is much simpler program compare to previous employee program
class Employee1 implements Comparable<Employee1>{		
		 String name;
		 int eid;
		 
		 Employee1(String name, int eid){
			 this.name= name;
			 this.eid= eid;
		 }
		 public String toString() {
			 return name+"--"+eid;
		 }
		 public int compareTo(Employee1 obj) {
				/* int eid1= this.eid;
				 Employee1 e= (Employee1)obj;
				 int eid2= e.eid;*/
//the commented code is some what complex to understand that why i have used below code to run the same program.
			 if(eid<obj.eid)
				 return -1;
			 else if(eid>obj.eid)
				 return +1;
			 else 
				 return 0;		 
	}}
class mycomparator6 implements Comparator{
		 public int compare(Object obj1, Object obj2) {
			 Employee1 e1= (Employee1)obj1;
			 Employee1 e2= (Employee1)obj2;
			 String S1= e1.name;
			 String S2=e2.name;
			 return S1.compareTo(S2);
		 }
	 }
	 
class TreeSet_comparatorEx9_Employee2 {
		 public static void main (String []arg) {
			 Employee1 e1= new Employee1("Nagpur", 101);
			 Employee1 e2= new Employee1("Bilaspur", 102);
			 Employee1 e3= new Employee1("Chattisgarh", 103);
			 Employee1 e4= new Employee1("Velore", 104);
			 Employee1 e5= new Employee1("Nagpur", 105);
			 
			 TreeSet t= new TreeSet ();
			 t.add(e1);t.add(e2);t.add(e3);t.add(e4);t.add(e5); //obj1.compareTo(obj2)
			 System.out.println(t);
			 
			 TreeSet t1= new TreeSet(new mycomparator5());
			 t1.add(e1);
			 t1.add(e2);t1.add(e3);t1.add(e4);t1.add(e5); //obj1.compareTo(obj2)
			 System.out.println(t1);
		 }	 	
	}

