package leetCode;

public class Program338 {
	public static int[] countBits(int n) {
		int[] num = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			num[i] = num[i >> 1] + (i & 1);
		}
		return num;

	}

	public static void main(String[] args) {
		int n = 5;
		int[] nums = countBits(n);
		for (int i : nums) {
			System.out.print(i + " ");

		}
	}

}
