package leetCodeMedium;

public class Problem231 {
	public static boolean isPowerOfTwo(int n) {
		if (n < 0) {
			return false;

		}
		if (n == 1) {
			return true;
		}
		if (n % 2 == 1) {
			return false;
		}
		return isPowerOfTwo(n / 2);

	}

	public static void main(String[] args) {
		int num = 16;
		boolean value = isPowerOfTwo(num);
		System.out.println(value);
	}

}
