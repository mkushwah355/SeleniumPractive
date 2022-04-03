package ExceptionHandling;

public class ArrayIndexOutOfBoundPrac {

	public static void main(String[] args) {

		try {
			int a[] = { 1, 2, 3, 5 };
			
			// it will try to display the 10th index value
			System.out.println(a[10]);
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		System.out.println("rest of the code");

	}

}
