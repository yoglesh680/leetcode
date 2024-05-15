package medium;

public class Problem55 {
	public static boolean canJump(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count < i) {
				return false;
			}
			count = Math.max(count, i + nums[i]);
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}

}
