package Java_Programs;

//Aim: Print Fibanocci series with for loop.
class FibanocciSeries {

	public static void main(String[] arg) {

		int a = 0;
		int b = 1;
		int sum;
		for (int i = 1; i <= 7; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}//output= 1,2,3,5,8,13,21
}

//Aim: Check given number belongs to fabonacci series.
class FibanocciSeriesCheckGivenNumber {
	public static void main(String[] arg) {

		int x = 13;
		int a = 0, b = 1, sum = 0;
		boolean isFabonacci=false;
		
		for (int i = 0; i < x; i++) {
			sum = a + b;
			a = b;
			b = sum;
			if(sum==x) {
				isFabonacci=true;
				break;
			}
		}
		if(isFabonacci) {
			System.out.println("Number belongs to fabonacci series");
		}else {
			System.out.println("Not a fabonacci series number");
		}
	}
}

//Aim: Print Fibanocci series with while loop.
class FibanocciSeriesWithWhileLoop {
	public static void main(String[] arg) {

		int i = 1;
		int a = 0;
		int b = 1;
		int sum;

		while (i <= 7) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;

			i++;
		}
	} //output= 0,1,2,3,5,8,13,21
}
/*Logic: 
1. We need to decide how many numbers we want to print in series(it will decide 'i' value).
2. Fibanocci series is addition of previous two numbers.
3. So, we need the sum of those two numbers which requires 3 variables. 'a' & 'b' then 'sum' variable
5. then 'a' & 'b' value should change on each iteration which can be achieved through swapping.
*/