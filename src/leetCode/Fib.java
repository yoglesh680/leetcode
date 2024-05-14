package leetCode;

public class Fib {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static void main(String[] args) {
		int n = 10; // You can change this value to generate Fibonacci numbers up to a different
					// limit

		System.out.println("Fibonacci Series up to " + n + " terms:");
		for (int i = 1; i <= n; ++i) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
