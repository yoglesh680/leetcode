package leetCodeMedium;

public class Problem485 {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int current = 0;
		for (int num : nums) {
			if (num == 1) {
				current++;
				max = Math.max(max, current);
			} else {
				current = 0;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		int num = findMaxConsecutiveOnes(nums);
		System.out.println(num);
	}
}
