package JavaProgramPractice;

//Print the minimum value from 3x3 matrix
/*	2 4 5
	3 1 7
	1 2 9*/

public class Arrays_Martrix3By3_MaximumValue {

	public static void main(String[] arg) {

		int[][] a = { { 2, 4, 5 }, { 3, 1, 7 }, { 1, 2, 9 } };
		int max = a[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] >max) {
					max = a[i][j];
				}
			}
		} System.out.println(max);
	}

}
