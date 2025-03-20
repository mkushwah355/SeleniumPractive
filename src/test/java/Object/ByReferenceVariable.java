package Object;

//Initializing an object means storing data into the object.
//Initializing an object with reference variable
public class ByReferenceVariable {
	String name;
	int rollno;

	public static void main(String[] arg) {

		ByReferenceVariable s1 = new ByReferenceVariable();
		ByReferenceVariable s2 = new ByReferenceVariable();

		s1.name = "Mayank";
		s1.rollno = 101;
		s2.name = "Deepak";
		s2.rollno = 102;

		System.out.println(s1.name + " " + s1.rollno);
		System.out.println(s2.name + " " + s2.rollno);
	}

}
