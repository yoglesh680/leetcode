package leetCodeMedium;

public class Problem704 {
	public static int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return nums[i];
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		int value = search(nums, target);
		System.out.println(value);
	}
}
