package JavaProgramPractice;

//Aim: Create method which accepts Array and returns sum of all the elements of array.
class Arrays_SumOfArrayElementsAfterCreatingMethod {
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int sum= sumOfArray(a);
		System.out.println(sum);
	}
	
	public static int sumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		//System.out.println("Array elements=" + sum);
		return sum;
	}

	
}
//Aim: Return sum of all the elements in array without creating method.
 class Arrays_SumOfArrayElementsWithoutCreatingMethod {	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5}; 
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) 
			{			
			sum=sum+ a[i];			
			}
		System.out.println("Sum of Array elements: "+sum);
		}
	}
