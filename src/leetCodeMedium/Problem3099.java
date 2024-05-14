package leetCodeMedium;

public class Problem3099 {
	public static int sumOfTheDigitsOfHarshadNumber(int x) {
		int sum = 0;
		int r = 0;
		int temp = x;
		if (x == 1) {
			return x;
		}
		while (x > 0) {
			r = x % 10;
			sum += r;
			x = x / 10;
		}
		if (temp % sum == 0) {
			return sum;
		}
		return -1;
	}

	public static void main(String[] args) {
		int x = 18;
		int result = sumOfTheDigitsOfHarshadNumber(x);
		System.out.println(result);
	}
}
