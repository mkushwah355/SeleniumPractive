package JavaProgramPractice;

//Aim: Perform multiplication without multiplication operator with for loop.
 class MultiplicationWithoutOperatorWithForLoop {

    public static void main(String[] args) {
        int result = multiply(5, 10); // Expected output should be 50
        System.out.println(result);
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

//Aim: Perform multiplication without multiplication operator with while loop.
class Multiplication_WithoutOperator {

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

//Aim: With multiplication operator
class MultiplicationWithOperator {

	public static void main(String[] args) {

		int result = multiply(5, 10);//output should be 50
		System.out.println(result);
	}

	public static int multiply(int a, int b) {
		return a * b;
	}
}