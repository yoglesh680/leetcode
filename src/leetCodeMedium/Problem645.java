package leetCodeMedium;

public class Problem645 {
	public static int[] findErrorNums(int[] nums) {
		boolean[] arr = new boolean[nums.length + 1];
		int[] result = { 0, 0 };
		for (int num : nums) {
			if (arr[num] == true) {
				result[0] = num;
			} else {
				arr[num] = true;
			}

		}

		for (int i = 1; i <= nums.length; i++) {
			if (arr[i] == false) {
				result[1] = i;
				break;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		int[] result = findErrorNums(nums);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
