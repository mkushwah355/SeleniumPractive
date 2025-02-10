package JavaProgramPractice;

//Aim: Print Fibanocci series with for loop.
class FibanocciSeries {

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

//Aim: Print Fibanocci series with while loop.
class FibanocciSeriesWithWhileLoop {
	public static void main(String[] arg) {
		//0,1,2,3,5,8,13,21,34
		int i = 1;
		int a = 0;
		int b = 1;
		int sum;

		while (i < 9) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

			i++;
		}
	}
}
/*Note: 
1. We need to decide till which number we want to print series(it will decide 'i' value).
2. Fibanocci series is addition of previous two numbers.
3. So, we need the sum of those two numbers which requires 3 variables. 'a' & 'b' then 'sum' variable
5. then 'a' & 'b' value should change on each iteration which can be achieved through swapping.

*/