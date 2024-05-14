package leetCode;

public class MissingArray {
	public static int missingArray(int[] nums) {
		boolean[] flag = new boolean[100001];
		for (int num : nums) {
			if (num > 0 && num <= 100000) {
				flag[num] = true;
			}
		}
		for (int i = 1; i < nums.length; i++) {
			if (!flag[i]) {
				return i;
			}
		}
		return 100001;
	}

	public static void main(String[] args) {
		int[] nums = { -1, -3 };
		int num = missingArray(nums);
		System.out.println(num);
	}

}
