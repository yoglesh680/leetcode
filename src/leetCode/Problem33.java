package leetCode;

public class Problem33 {
	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == nums[mid]) {
				return mid;

			}
			if (start <= mid) {
				if (target >= nums[start] && target <= nums[end]) {
					end = mid + 1;
				} else {
					start = mid + 1;
				}
				if (target >= mid && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = end - 1;
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int num = search(nums, 0);
		System.out.println(num);
	}

}
