package faltuCode;

class test {
	void show() {
		System.out.println("print 1");
	}
}

class practice extends test {

	void show() {
		System.out.println("prints 2");
	}

	public static void main(String[] arg) {
		practice a = new practice();
		a.show();
		test b = new test();
		b.show();
	}
}
