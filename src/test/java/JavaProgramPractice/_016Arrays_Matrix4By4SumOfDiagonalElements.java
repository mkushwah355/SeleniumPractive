package JavaProgramPractice;

//Aim: Find sum of diagonal elements of array matrix.
class _016Arrays_Matrix4By4SumOfDiagonalElements {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } }; //output: primary=16, secondary= 17
		//primary=left to right, secondary= right to left		
		int primary = 0;
		int secondary = 0;

		for (int i = 0; i < a.length; i++) {
			primary = primary + a[i][i];
			secondary = secondary + a[i][a.length - 1 - i];

		}
		System.out.println(primary);
		System.out.println(secondary);

	}
}
//Aim: Find sum of diagonal elements of array matrix through counter.

class Arrays_MatrixSumOfDiagonalElements2 {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } };//output: primary=16, secondary= 17

		int primary = 0;
		int secondary = 0;
		int count = 0;
//primary=left to right
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (i == j) {
					primary = primary + a[i][j];
				}

				count++;
			}
		}
		System.out.println("primary-left to right: " + primary);
//secondary= right to left
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (i + j == a.length - 1) {
					secondary = secondary + a[i][j];
				}
				count++;
			}			
		}System.out.println("secondary-right to left: " + secondary);

	}
}
