package leetCodeMedium;

public class Problem3079 {
	public static int sumOfEncryptedInt(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += encrypted(num);
		}
		return sum;
	}

	private static int encrypted(int num) {
		if (num < 10) {
			return num;
		}
		int tem = num;
		int max = 0;
		int r = 0;
		while (num != 0) {
			r = num % 10;
			max = Math.max(max, r);
			num /= 10;

		}

		String n = String.valueOf(max);
		Integer value = Integer.valueOf(n + n);
		if (tem >= 100) {
			value = Integer.valueOf(n + n + n);
		}
		if (tem >= 1000) {
			value = Integer.valueOf(n + n + n + n);
		}
		return value;
	}

	public static void main(String[] args) {
		int[] nums = { 50, 100 };
		int value = sumOfEncryptedInt(nums);
		System.out.println(value);
	}

}
