package Java_Programs;

//Aim: Print sum of all elements of 4x4 array matrix.
class _015Arrays_Matrix4By4_SumOfAllElements {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } }; //output=74

		int row= a.length;// Calculates all rows of array.
		int column= a[0].length;// Calculates all columns of array(Assuming all rows have the same number of columns
		
		int sum=0;
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			sum=sum+a[i][j];
		}}
		
		
		System.out.println("Sum of all elements: "+sum);
		//System.out.println(column);


	}
}