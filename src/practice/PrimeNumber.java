package practice;

public class PrimeNumber {

	public static void main(String arg[]) {
		int i, count = 0, j = 2;

		for (i = 2; i <= 100; i++) {
			for (j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			} else {
				count = 0;
			}
		}
	}
}
