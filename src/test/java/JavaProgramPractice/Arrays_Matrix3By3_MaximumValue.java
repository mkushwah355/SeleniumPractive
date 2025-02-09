package JavaProgramPractice;

//Print the minimum value from 3x3 matrix
/*	2 4 5
	3 1 7
	1 2 9*/

public class Arrays_Matrix3By3_MaximumValue {

	public static void main(String[] arg) {

		int[][] a = { { 2, 4, 5 }, { 3, 1, 7 }, { 1, 2, 9 } }; //output=9
		int row= a.length;// Calculates all rows of array.
		int column= a[0].length;// Calculates all columns of array(Assuming all rows have the same number of columns
				
		int max = a[0][0];

		for (int i = 0; i <a.length; i++) {//i will iterate over all rows.
			for (int j = 0; j < a[i].length; j++) {//j will iterate over all elements of row(column).
				if (a[i][j] >max) {
					max = a[i][j];
				}
			}
		} System.out.println(max);
	}

}
