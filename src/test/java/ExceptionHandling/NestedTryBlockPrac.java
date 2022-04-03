package ExceptionHandling;

public class NestedTryBlockPrac {

	public static void main(String[] args) {
		// 1st try block
		try {
			//String a=null;
			//System.out.println(a.length());
			// 2nd try block
			try {
				// 3rd try block
				try {
					// 4th try block
					try {
						int b = 1 / 0;
						// 4th catch block
					} catch (ArrayIndexOutOfBoundsException e) {
						
					}
				// 3rd catch block
				} catch (Exception e) {
					System.out.println("Arithematic-3rd catch block");
				}
		// 2rd catch block
			} catch (Exception e) {

			}

		// 1st catch block
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
