package practice;

public class MoveZeroes {
	public static int[] moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count++] = nums[i];
			}
		}
		while (count < nums.length) {
			nums[count++] = 0;
		}
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				int temp = nums[count];
//				System.out.println(temp);
//				nums[count] = nums[i];
//				System.out.println(count);
//				System.out.println(nums[i]);
//				nums[i] = temp;
//				count++;
//
//			}
//		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		int[] nums1 = moveZeroes(nums);
		for (int i : nums1) {
			System.out.print(i + " ");
		}

	}
}
