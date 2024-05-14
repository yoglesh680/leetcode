package leetCode;

public class Problem29 {
	public static int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		int result = dividend / divisor;

		return result;

	}

	public static void main(String[] args) {
		int d = 10, d1 = 3;
		int r = divide(d, d1);
		System.out.println(r);
	}

}
