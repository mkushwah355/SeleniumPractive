package Java_Programs;

//Aim: Print table of two without using operator.
public class Multiplication_TableofTwo {

	public static void main(String[] args) {
		int number = 2; // The number for which we want the multiplication table

		System.out.println("Multiplication table of " + number + ":");
		for (int i = 1; i <= 10; i++) {
			int result = multiply(number, i);
			System.out.println(result);
		}
	}

	public static int multiply(int a, int b) {
		// 'a' has to sum itself 'b' times to get the result
		int d = 0;

		// Using a for loop to perform the multiplication
		for (int c = 1; c <= b; c++) {
			d = d + a;
		}

		return d;
	}
}

//Aim: Print table of two with using operator.
class MultiplicationTableWithOperator {
	public static void main(String[] args) {
		
		int number = 2; // The number for which we want the multiplication table

		System.out.println("Multiplication table of " + number + ":");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " * " + i + " = " + result);
		}
	}
}
