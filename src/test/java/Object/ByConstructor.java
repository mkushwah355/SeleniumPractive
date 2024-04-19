package Object;
//Initializing an object through constructor
 class ByConstructor {
	String name;
	int rollno;
	
	ByConstructor(String n, int r){
		name=n;
		rollno=r;
		
	}
	void display() {
		System.out.println(name+" "+rollno);
	}
	
	public static void main (String []arg) {
		ByConstructor s1= new ByConstructor("Mayank",101);
		ByConstructor s2= new ByConstructor("Deepak",102);
		ByConstructor s3= new ByConstructor("Arun",103);
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}
	
	

}
