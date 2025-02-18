package JavaProgramPractice;

//Aim: Check whether given number is prime or not
class PrimeNumber {

	public static void main(String[] arg) {

		int a = 11;
		boolean flag = false;

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Not a prime number");
		else
			System.out.println("It is prime number");
	}
}

//Aim: Java program to check prime numbers in range of 1 to 10.
//Prime no. b/w 1 to 10 -> 2,3,5,7

class PrimeNumber_withMethod {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}
		for (int i = 2; i < n; i++) { // Check all numbers from 2 to (n-1)
			if (n % i == 0) {
				return false; // Found a divisor, n is not prime
			}
		}
		return true; // No divisors found, n is prime
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 10;

		for (int n = a; n <= b; n++) {
			if (isPrime(n)) {
				System.out.println(n);
			}
		}
	}
}
