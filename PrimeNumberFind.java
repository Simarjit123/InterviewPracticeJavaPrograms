package practice;

public class PrimeNumberFind {

	public static void main(String[] args) {

		int num = 4;
		boolean isPrime = false;
		for (int i = 1; i < num / 2; i++) {
			if (num % 2 == 0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println("Number is prime");

		} else {
			System.out.println("not prime number");
		}

	}
}
