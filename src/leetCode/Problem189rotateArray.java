package leetCode;

public class Problem189rotateArray {
	public static int[] rotate(int[] nums, int k) {
		int n = nums.length;
		 k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
		return nums;

	}

	private static void reverse(int[] nums, int i, int j) {
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}

	public static void printNum(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int nums[] = { -1 };
		int k = 2;
		rotate(nums, k);
		printNum(nums);
	}

}
