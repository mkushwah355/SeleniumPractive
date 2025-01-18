package JavaProgramPractice;

//Aim: Perform multiplication without multiplication operator.
public class MultiplicationWithoutOperator {

	public static void main(String[] args) {
		int result = multiply(5, 10);//output should be 50
		System.out.println(result);
	}

	public static int multiply(int a, int b) {
		//a has to sum itself j times to get result
		int c = 1;
		int d = 0;

		while (c <= b) { //loop will start from 1 and run until <=10

			d = d + a; // 
			c++; // this will increment the loop until c<=10 condition met
		}

		return d;
	}
}

//With multiplication operator
/*public class MultiplicationWithoutOperator {

	public static void main(String[] args) {

		int result = multiply(5, 10);//output should be 50
		System.out.println(result);
	}

	public static int multiply(int a, int b) {
		return a * b;
	}
}*/