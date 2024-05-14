package leetCodeMedium;

public class Problem169 {
	public static int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
				count = 1;
			} else if (nums[i] == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		int num = majorityElement(nums);
		System.out.println(num);
	}
}
