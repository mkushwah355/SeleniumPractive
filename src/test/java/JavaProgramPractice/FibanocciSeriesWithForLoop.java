package JavaProgramPractice;

//Aim: Print Fibanocci series with for loop.
public class FibanocciSeriesWithForLoop {

	public static void main(String[] arg) {
		//output= 0,1,2,3,5,8,13,21
		int a = 0;
		int b = 1;
		int sum;
		for (int i = 1; i < 7; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}
}
