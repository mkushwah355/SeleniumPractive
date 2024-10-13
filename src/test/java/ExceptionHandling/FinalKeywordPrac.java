package ExceptionHandling;

class FinalKeywordPrac {

	final int age = 18;
	
	void display() {
		int age; // = 18;
	}

public static void main(String[] arg) {

		FinalKeywordPrac obj = new FinalKeywordPrac();

		obj.display();

		// it will print "ExceptionHandling.FinalKeywordPrac@15db9742"
		// @15db9742 --hashcode with respect to object reference.
		// System.out.println(obj);
	}
}



