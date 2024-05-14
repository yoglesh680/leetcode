package leetCodeMedium;

public class Problem213 {
	public static int rob(int[] nums) {
		int odd = 0;
		int even = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				even += num;
			}
			else {
				odd += num;
			}
		}
		return odd;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 2 };
		int num = rob(nums);
		System.out.println(num);
	}

}
