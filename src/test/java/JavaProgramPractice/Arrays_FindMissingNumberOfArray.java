package JavaProgramPractice;

//Find missing number of array
public class Arrays_FindMissingNumberOfArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 6 };

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {

			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of array elements: " + sum1);

		int sum2 = 0;

		for (int i = 1; i <= 6; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of 1 to 6 no: " + sum2);
		sum2= sum2-sum1;
		
		System.out.println("missing no. is: " +sum2);
	}
}

/*Logic:   sum1= sum of all elements
		   sum2= sum of all numbers with in range(i.e. 1 to 6)
		   missing number= sum2-sum2 = 21-18= 3
		
*/