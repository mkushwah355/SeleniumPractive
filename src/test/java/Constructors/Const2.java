package Constructors;

class Const2 {
	int id;
	String name;
	int age;

	Const2(int a, String b, int c) {
		id = a;
		name = b;
		age = c;
	}

	Const2(int a, String b) {

		id = a;
		name = b;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);

	}

	public static void main(String[] arg) {
		Const2 s1 = new Const2(2, "Mayank2", 26);
		Const2 s2 = new Const2(1, "Mayank1");
		Const2 s3 = new Const2(4, "Mayank4");
		Const2 s4 = new Const2(3, "string3", 5);

		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
