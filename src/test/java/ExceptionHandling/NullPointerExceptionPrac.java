package ExceptionHandling;

public class NullPointerExceptionPrac {

	public static void main(String[] args) {

		try {
			String a = null;
			System.out.println(a.length());
			// if exception occurs, the remaining statement will not execute
			System.out.println("rest of the code");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} catch (Throwable e) {
			System.out.println("Throwable: " + e);
		}

	}

}
