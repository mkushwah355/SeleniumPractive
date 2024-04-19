package Object;

//Initializing an object through method
public class ByMethod {
	
	String name;
	int rollno;
	
	void studentRecord(String n, int r) {
		name=n;
		rollno=r;		
	}
	
	/*void displayStudentRecord() {
		System.out.println(name+" "+rollno);
	}*/
	
	public static void main(String []arg) {
		ByMethod s1= new ByMethod();
		ByMethod s2= new ByMethod();
		ByMethod s3= new ByMethod();
		
		s1.studentRecord("Mayank", 101);
		s2.studentRecord("Deepak", 102);
		s3.studentRecord("Arun", 103);
		
		System.out.println(s1.name+" "+s1.rollno);
		System.out.println(s2.name+" "+s2.rollno);
		System.out.println(s3.name+" "+s3.rollno);
		
		/*	s1.displayStudentRecord();
			s2.displayStudentRecord();
			s3.displayStudentRecord();*/
		
	}

}
