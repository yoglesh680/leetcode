package leetCode;

public class Problem69 {
	public static int mySqrt(int x) {
		int left = 1;
		int right = x;
		long result = 0;
		if (x == 0 || x == 1) {
			return x;
		}

		//
		while (left <= right) {
			long mid = left + (right - left) / 2;

			if (mid * mid == x) {
				return (int) mid;
			} else if (mid * mid < x) {
				left = (int) (mid + 1);
				result = mid; // Store the potential result before moving further
			} else {
				right = (int) (mid - 1);
			}
		}
		return (int) result;
	}

	public static void main(String[] args) {

		int num = 8;
		int result = mySqrt(num);
		System.out.println(result);
	}
}
