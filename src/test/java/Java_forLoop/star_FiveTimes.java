package Java_forLoop;
/*
******/

//Aim: Print star 5 times (landscape)
class star_FiveTimes {

	public static void main(String[] args) {
		int a = 5; // star 5 times

		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}
	}
}

/*
*
*
*
*
*
*/

//Aim: Print star 5 times (horizontal)
class star_FiveTimes2 {

	public static void main(String[] args) {
		int a = 5; // star 5 times

		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
	}
}

/*
*****
*****
*****
*****
*****
*/

class star_FiveTimes3 {

	public static void main(String[] args) {
		int a = 5; // star 5 times

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*"); //it will print in horizontal
			}
			System.out.println(); //it will change the line after printing 5 horizontal star 
		}
	}
}

/*
12345
12345
12345
12345
12345
*/
class star_FiveTimes4 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j); //it will print in horizontal
			}
			System.out.println(); //it will change the line after printing 5 horizontal star 
		}
	}
}

/*
11111
22222
33333
44444
55555
*/
class star_FiveTimes5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i); //it will print in horizontal
			}
			System.out.println(); //it will change the line after printing 5 horizontal star 
		}
	}
}

/*
*
**
***
****
*****
*/

class star_FiveTimes6 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <i; j++) { //j<i will print the incremented star in pyramid
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}
}
/*
1
00
111
0000
11111
*/
class star_FiveTimes7 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				if (i % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println(); // Move to the next line
		}
	}
}

/*
1
12
123
1234
12345
*/
class star_FiveTimes8 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(); // Move to the next line
		}

	}
}
/*
1
22
333
4444
55555
*/
class star_FiveTimes9 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(); // Move to the next line
		}

	}
}
