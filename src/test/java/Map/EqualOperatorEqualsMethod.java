package Map;
import java.util.*;

public class EqualOperatorEqualsMethod {
	
	public static void main (String []arg) {
		
		Integer I1= new Integer (10);
		Integer I2= new Integer (10);
		
		System.out.println(I1==I2); //reference comparison
		System.out.println(I1.equals(I2)); //content comparison
		
	}

}
