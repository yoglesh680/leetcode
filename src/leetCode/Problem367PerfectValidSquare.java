package leetCode;

public class Problem367PerfectValidSquare {
	public static boolean isPerfectSquare(int num) {
		if (num < 2) {
			return true;
		}
		int left = 0;
		int right = num / 2;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;
			if (square == num) {
				return true;

			} else if (square < num) {
				left = (int) (mid + 1);
			} else {
				right = (int) (mid - 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 14;
		boolean data = isPerfectSquare(num);
		System.out.println(data);
	}
}
