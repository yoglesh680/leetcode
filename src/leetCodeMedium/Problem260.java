package leetCodeMedium;

public class Problem260 {
	public static int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		int k = 0;
		if (nums.length == 2) {
			return nums;
		}

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[k++] = nums[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };// [3,5]
		int[] result = singleNumber(nums);
		for (int num : result) {
			System.out.print(num + " ");
		}

	}

}
