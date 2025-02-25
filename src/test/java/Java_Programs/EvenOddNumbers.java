package Java_Programs;

//Aim: Print even numbers within range.
class EvenOddNumbers {

	public static void main(String[] args) {
		int a= 1;
		int b=10;
		
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
//Aim: Print odd numbers within range.
class OddNumbers {

	public static void main(String[] args) {
		int a= 1;
		int b=10;
		
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
