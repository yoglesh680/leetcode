package medium;

public class Problem45 {
	public static int jump(int[] nums) {
		int jump = 0;
		int current = 0;
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (i + nums[i] > max) {
				max = i + nums[i];
			}
			if (i == current) {
				jump++;
				current = max;
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		int jump = jump(nums);
		System.out.println(jump);
	}

}
