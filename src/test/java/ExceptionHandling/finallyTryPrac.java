package ExceptionHandling;

class finallyTryPrac {

	public static void main(String[] args) {
		

		try {
			int a = 1 / 0;
			
		} catch (Exception e) {
			System.out.println("ArithematicException:  " + e);
			// finally used to put cleanup code such as closing file, closing
			// connection etc.
			// finally will always executed regardless exception is handled or
			// not
		} finally {
			System.out.println("finally always executed");
		}

		System.out.println("rest of the code");

	}

}
