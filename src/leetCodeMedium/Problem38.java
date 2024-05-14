package leetCodeMedium;

public class Problem38 {
	public static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };

		int start = findPosition(nums, target, true);
		if (start == nums.length || nums[start] != target) {
			return result;
		}
		int end = findPosition(nums, target, false) - 1;
		result[0] = start;
		result[1] = end;
		return result;

	}

	private static int findPosition(int[] nums, int target, boolean b) {
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > target || (b && nums[mid] == target)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] nums = { 1 };
		int[] result = searchRange(nums, 1);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
