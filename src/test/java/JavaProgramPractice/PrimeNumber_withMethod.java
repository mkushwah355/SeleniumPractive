package JavaProgramPractice;

//create a method to check given number is prime or not.
//Java program to generate prime numbers b/w 1 & 4
//Prime no. b/w 1 to 10 -> 2,3,5,7
public class PrimeNumber_withMethod {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;

		for (int num = a; num <= b; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}
		for (int i = 2; i < num; i++) { // Check all numbers from 2 to num - 1
			if (num % i == 0) {
				return false; // Found a divisor, num is not prime
			}
		}
		return true; // No divisors found, num is prime
	}
}
