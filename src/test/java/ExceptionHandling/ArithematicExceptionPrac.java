package ExceptionHandling;

import java.io.*;
import org.apache.tools.ant.taskdefs.Length;

public class ArithematicExceptionPrac {

	public static void main(String[] arg) {
		try {
			int a = 1 / 0;

			// it will check the exception from 1st catch to last catch block.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException:  " + e);
		} catch (Exception e) {
			System.out.println("Exception:  " + e);
		}
		// next line of code outside try catch block
		System.out.println("rest of the code");
	}

}
