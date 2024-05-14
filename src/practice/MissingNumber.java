package practice;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			num ^= i ^ nums[i];
			System.out.println(num);
		}
		num ^= nums.length;
		return num;

	}

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		int num = missingNumber(nums);
		System.out.println(num);

	}
}
