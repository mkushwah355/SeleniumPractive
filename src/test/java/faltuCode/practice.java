package faltuCode;

class practice {
	String name;
	int rollno;
	
	void studentRecord(String n, int r) {
		name=n;
		rollno=r;
		
	}
	
	void display() {
		System.out.println(name+" "+rollno);
		
	}
	
	public static void main (String []arg) {
		
		practice s1= new practice();
		practice s2= new practice();
	     
		s1.studentRecord("mayank", 101);
		s2.studentRecord("mayank1", 102);
		s1.display();
		s2.display();
		
	
	
	
}}