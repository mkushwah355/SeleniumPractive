package JavaProgramPractice;

//Aim: Return sum of all the elements in array without creating method.
//without creating method
class Arrays_SumOfArrayElementsWithoutCreatingMethod {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 ,-1};

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Array elements(withoutMethod): " + sum);
	}
}

//Aim: Create method which accepts Array and returns sum of all the elements of array.
//after creating method
class _005Arrays_SumOfArrayElements {

	int[] array = { 1, 2, 3, 4, 5 ,-1};
	int sum = 0;

	public int sumOfArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		//System.out.println("Array elements=" + sum);
		return sum;
	}
	public static void main(String[] args) {
		
		_005Arrays_SumOfArrayElements obj= new _005Arrays_SumOfArrayElements();
		int sum = obj.sumOfArray(obj.array);
		System.out.println("Sum of array(withMethod): "+sum);
	}
}