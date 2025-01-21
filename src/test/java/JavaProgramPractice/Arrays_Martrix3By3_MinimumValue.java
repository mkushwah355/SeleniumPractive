package JavaProgramPractice;

//Print the minimum value from 3x3 matrix
/*	2 4 5
	3 1 7
	1 2 9*/

public class Arrays_Martrix3By3_MinimumValue {

	public static void main(String[] arg) {

		int[][] a = { { 2, 4, 5 }, { 3, 1, 7 }, { 1, 2, 9 } };
		int min = a[0][0];

		for (int i = 0; i < 3; i++) { //outer loop iterates over each row of the matrix.
			for (int j = 0; j < 3; j++) {//inner loop iterates over each column of the current row.
				if (a[i][j] <min) {
					min = a[i][j];
				}
			}
		} System.out.println(min);
	}

}
