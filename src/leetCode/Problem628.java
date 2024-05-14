package leetCode;

public class Problem628 {
	public static int maximumProduct(int[] nums) {
		int n = nums.length;
		int product = nums[n - 1] * nums[n - 2] * nums[n - 3];
		int product1 = nums[0] * nums[1] * nums[n - 1];

		return Math.max(product, product1);

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int num = maximumProduct(nums);
		System.out.println(num);
	}
}
